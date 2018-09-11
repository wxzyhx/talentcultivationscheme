/**
 * wxz于2018-06-22 created
 * wxz于2018-06-24 added Validate
 * wxz于2018-06-24 modified getCultivationSchemes()
 * @author wxz
 *
 */
  //渲染完就执行
    $(function() {
    	getCultivationSchemes();//获取所有培养方案
    });
    
    var culcreatetime=null;//定义保存当前培养方案创建日期的全局变量
    
    function getCultivationSchemes() {//获取所有培养方案
        $.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/getCulSchemes.do',
            dataType : 'json', 
            success : function(data) {
            	if(data.culs!=null){
                	$("select[name='culcreatetime']").empty();
                    for(var i=0;i<data.culs.length;i++){
                        var html ='<option value="'+data.culs[i].culcreatetime+'">';
                        html +=dateYear(data.culs[i].culcreatetime) + '</option>';
                        $("select[name='culcreatetime']").append(html);
                    }
                    if(culcreatetime!=null){
                    	$("select[name='culcreatetime'] option[value='"+ culcreatetime + "']").attr("selected", "selected");
                    }
                    toDisplayCultivationScheme(date($("select[name='culcreatetime']").val())) ;
                    $("select[name='culcreatetime']").bind("change", function(obj){
                    	culcreatetime=$('#culcreatetime option:selected').val(); //改变选项时保存当前培养方案创建时间
                    	toDisplayCultivationScheme(date($("select[name='culcreatetime']").val())) ;
                    });
                }else{
                	alert("单击“添加”按钮添加培养方案基本信息！");
                }
            },
            error : function(data) {
                alert("获取培养方案列表出错！");
            }
        });
    }
    
  //根据年份获取培养方案
    function toDisplayCultivationScheme(cultime) {
        $.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/getCulSchemesByYear.do?culcreatetime='+cultime,
            dataType : 'json', 
            success : function(data) {
            	if(data.cul!=null){
            	       $.ajax({
            	            async : false,
            	            type : 'post',
            	            url : urlRootContext+'/schoolsystemdegree/getSSDByCulid.do?cultivationid='
            	            		+data.cul.cultivationid,//根据培养方案id获取学制学位
            	            dataType : 'json', 
            	            success : function(result) {
            	            	if(result.ssd!=null){
            	            		$("#cultivationschemeId").val(data.cul.cultivationid);//把当前方案id赋值给input标签
            	            		$("#schoolsystem").html(result.ssd.schoolsystem);
            	            		$("#loweryears").html(result.ssd.loweryears);
            	            		$("#upperyears").html(result.ssd.upperyears);
            	            		$("#degreeId").html(result.degree.degreename);
            	            		$("#updateSchoolsysDegreeForm input[name='schoolsystemdegreeid']").val(result.ssd.schoolsystemdegreeid);
            	            		$("#updateSchoolsysDegreeForm input[name='schoolsystem']").val(result.ssd.schoolsystem);
            	            		$("#updateSchoolsysDegreeForm input[name='loweryears']").val(result.ssd.loweryears);
            	            		$("#updateSchoolsysDegreeForm input[name='upperyears']").val(result.ssd.upperyears);
            	            		$("#updateSchoolsysDegreeForm input[name='cultivationschemeId']").val(data.cul.cultivationid);
            	            		if(result.degrees!=null){
            	            			for(var i=0;i<result.degrees.length;i++){
            	            				var html ='<option value="'+result.degrees[i].degreeid+'">';//学位id
            	            				html +=result.degrees[i].degreename + '</option>';//显示学位名称
            	            				$("#updateSchoolsysDegreeForm select[name='degreeId']").append(html);
            	                    }
            	            			$("#updateSchoolsysDegreeForm select[name='degreeId'] option[value='"+ result.ssd.degreeId + "']")
            	            			.attr("selected", "selected");
            	            		}
            	            		$("#modifybtn").removeAttr("disabled");  //启用修改按钮
            	            		$("#addbtn").attr("disabled","disabled");  //禁用新建按钮
            	            	}else{
            	            		$("#addSchoolsysDegreeForm input[name='cultivationschemeId']").val(data.cul.cultivationid);
            	            		alert("暂无学制学位数据，请添加！");
            	            		$("#addbtn").removeAttr("disabled");  //启用新建按钮
            	            	}
            	           
            	            },
            	            error : function(result) {
            	                alert("获取学制学位出错！");
            	            }
            	        });
                }
            },
            error : function(data) {
                alert("获取当前培养方案出错！");
            }
        });
    }
    
//为培养方案的学位属性赋值
function getDegrees() {
    $.ajax({
         async : false,
         type : 'post',
         url : urlRootContext+'/schoolsystemdegree/getDegrees.do',
         dataType : 'json', 
         success : function(data) {      	
         	if(data.degrees!=null){
             	$("#addSchoolsysDegreeForm select[name='degreeId']").empty();
                 $("#addSchoolsysDegreeForm select[name='degreeId']").append('<option value="">——请选择——</option>');
                 for(var i=0;i<data.degrees.length;i++){
                     var html ='<option value="'+data.degrees[i].degreeid+'">';//学位id
                     html +=data.degrees[i].degreename + '</option>';//显示学位名称
                     $("#addSchoolsysDegreeForm select[name='degreeId']").append(html);
                 }
             } 
         },
         error : function(data) {
        	 alert("获取学位信息出错！");
         }
     }); 
 }

// 保存学制学位
    function addSchoolsysDegreeOP() {
    	 //进行表单验证
       var bv =  $("#addSchoolsysDegreeForm").data('bootstrapValidator');
       bv.validate();
       if (bv.isValid()) {
        $.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/schoolsystemdegree/addSSD.do',
            data : $('#addSchoolsysDegreeForm').serialize(),
            success : function(data) {
                    alert("添加成功");
                    $('#addSchoolsysDegree').modal('hide');
                    formReset();
                    $('#addSchoolsysDegreeForm').bootstrapValidator('resetForm');//清除验证状态
                    getCultivationSchemes();//获取所有培养方案
            },
            error : function(data) {
                alert("添加失败");
            }
        });
      }

    }

    
    //根据年份获取培养方案并为修改界面属性赋值
    function updateScheme() {
    	culcreatetime=$('#culcreatetime option:selected').val(); //获取当前培养方案创建时间
        $.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/getCulSchemesByYear.do?culcreatetime='+date(culcreatetime),
            dataType : 'json', 
            success : function(data) {
            	if(data.cul!=null){
            		$("#updateScheme input[name='cultivationid']").val(data.cul.cultivationid);//培养方案id
            		$("#updateScheme input[name='culcreatetime']").val(dateMonth(data.cul.culcreatetime));//培养方案创建日期
                    $("#updateScheme input[name='departmenthead']").val(data.cul.departmenthead);//部门负责人
                    $("#updateScheme input[name='specialityprincipal']").val(data.cul.specialityprincipal);//专业负责人
                    $("#updateScheme input[name='reviewer']").val(data.cul.reviewer);//审核人
                    $("#updateScheme input[name='president']").val(data.cul.president);//校长
                    $("#updateScheme select[name='departmentId']").empty();
                    $("#updateScheme select[name='departmentId']").append('<option value="">——请选择——</option>');
                    for(var i=0;i<data.departments.length;i++){
                        var html ='<option value="'+data.departments[i].departmentid+'">';//部门id
                        html +=data.departments[i].departmentname + '</option>';//显示部门名称
                        $("#updateScheme select[name='departmentId']").append(html);
                    }
                    $("#updateScheme select[name='departmentId'] option[value='"+ data.cul.departmentId + "']")
                    .attr("selected", "selected");
                }
            },
            error : function(data) {
                alert("根据日期获取培养方案出错！");
            }
        });
    }
   
 // 保存修改后的学制学位
    function updateSchoolsysDegreeOP() {
        $.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/schoolsystemdegree/updateSSD.do',
            data : $('#updateSchoolsysDegreeForm').serialize(),
            success : function(data) {
                    alert("修改成功");
                    $('#updateSchoolsysDegree').modal('hide');
                    formReset();
                    $('#updateSchoolsysDegreeForm').bootstrapValidator('resetForm');//清除验证状态
                    getCultivationSchemes();//获取所有培养方案
            },
            error : function(data) {
                alert("修改失败");
            }
        });
    }
    
    //创建培养方案表单验证
    $(function () {
        $("#addSchoolsysDegreeForm").bootstrapValidator({
            message: 'This value is not valid',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
            	schoolsystem: {
                    validators: {
                        notEmpty: {
                            message: '学制不能为空'
                        }
                    }
                },
                loweryears: {
                    validators: {
                        notEmpty: {
                            message: '学业年限下限不能为空'
                        }
                    }
                },
                upperyears: {
                    validators: {
                        notEmpty: {
                            message: '学业年限上限不能为空'
                        }
                    }
                },
                degreeId: {
                    validators: {
                        notEmpty: {
                            message: '授予学位不能为空'
                        }
                    }
                }
            }
        });
    });