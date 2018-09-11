/**
 * wxz于2018-06-22 created
 * wxz于2018-06-24 added Validate
 * wxz于2018-06-24 modified getCultivationSchemes()
 * modified 去掉校长信息验证 at 2018-07-11 by wxz
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
                	//alert("单击“添加”按钮添加培养方案基本信息！");
                }
            },
            error : function(data) {
                alert("获取培养方案列表出错！");
            }
        });
    }
    
  //根据年份获取培养方案
    function toDisplayCultivationScheme(culcreatetime) {
        $.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/getCulSchemesByYear.do?culcreatetime='+culcreatetime,
            dataType : 'json', 
            success : function(data) {
            	if(data.cul!=null){
                    $("#departmenthead").html(data.cul.departmenthead);//部门负责人
                    $("#specialityprincipal").html(data.cul.specialityprincipal);//专业负责人
                    $("#reviewer").html(data.cul.reviewer);//审核人
                    $("#president").html(data.cul.president);//校长
                    $("#departmentId").html(data.dep.departmentname);//部门
                    $("#modifybtn").removeAttr("disabled");  //启用修改按钮
                }
            },
            error : function(data) {
                alert("根据日期获取培养方案出错！");
            }
        });
    }
    
//为培养方案的部门属性赋值
function addScheme() {
    $.ajax({
         async : false,
         type : 'post',
         url : urlRootContext+'/getDepartments.do',
         success : function(data) {      	
         	if(data.departments!=null){
             	$("#addScheme select[name='departmentId']").empty();
                 $("#addScheme select[name='departmentId']").append('<option value="">——请选择——</option>');
                 for(var i=0;i<data.departments.length;i++){
                     var html ='<option value="'+data.departments[i].departmentid+'">';//部门id
                     html +=data.departments[i].departmentname + '</option>';//显示部门名称
                     $("#addScheme select[name='departmentId']").append(html);
                 }
             } 
         },
         error : function(data) {
        	 alert("获取部门信息出错！");
         }
     }); 
 }

// 保存培养方案
    function addSchemeOP() {
    	 //进行表单验证
       var bv =  $("#addSchemeForm").data('bootstrapValidator');
       bv.validate();
       if (bv.isValid()) {
        $.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/addCulScheme.do',
            data : $('#addSchemeForm').serialize(),
            success : function(data) {
                    alert("添加成功");
                    $('#addScheme').modal('hide');
                    formReset();
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
   
 // 保存修改后的培养方案
    function updateSchemeOP() {
        $.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/updateCulScheme.do',
            data : $('#upateSchemeForm').serialize(),
            success : function(data) {
                    alert("修改成功");
                    $('#updateScheme').modal('hide');
                    formReset();
                    getCultivationSchemes();//获取所有培养方案
            },
            error : function(data) {
                alert("修改失败");
            }
        });
    }
    
    //创建培养方案表单验证
    $(function () {
        $("#addSchemeForm").bootstrapValidator({
            message: 'This value is not valid',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
            	culcreatetime: {
                    validators: {
                        notEmpty: {
                            message: '日期不能为空'
                        }
                    }
                },
                departmentId: {
                    validators: {
                        notEmpty: {
                            message: '部门不能为空'
                        }
                    }
                },
                departmenthead: {
                    validators: {
                        notEmpty: {
                            message: '部门负责人不能为空'
                        }
                    }
                },
                specialityprincipal: {
                    validators: {
                        notEmpty: {
                            message: '专业负责人不能为空'
                        }
                    }
                },
                reviewer: {
                    validators: {
                        notEmpty: {
                            message: '审核人不能为空'
                        }
                    }
                }
            }
        });
    });