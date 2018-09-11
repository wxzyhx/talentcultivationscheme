/**
 * wxz于2018-06-22 created
 *  wxz于2018-06-25 modified toDisplayCultivationScheme(cultime)
 *  wxz于2018-07-05 modified 表单验证方法, added selectCourseType方法
 *  wxz于2018-07-06 modified listCourseClassification()方法
 *  wxz于2018-07-12 added delGenCourseById()方法
 * @author wxz
 *
 */
  //渲染完就执行
    $(function() {
    	getCultivationSchemes();//获取所有培养方案
    	//根据课程类别确定部分课程类型
        $("#addCourseForm select[name='courseclassificationId']").bind("change", function(obj){
        	selectCourseType($("#addCourseForm select[name='courseclassificationId']").val()) ;
        });
        //添加课程中总学分=理论课学分+实践课学分
        $("#addCourseForm input[name='theorycredit']").bind("input propertychange", function(){
        	$("#addCourseForm input[name='totalcredit']").val(Number($("#addCourseForm input[name='theorycredit']").val())
        			+Number($("#addCourseForm input[name='practicalcredit']").val())) ;
        });
        $("#addCourseForm input[name='practicalcredit']").bind("input propertychange", function(){
        	$("#addCourseForm input[name='totalcredit']").val(Number($("#addCourseForm input[name='theorycredit']").val())
        			+Number($("#addCourseForm input[name='practicalcredit']").val())) ;
        });
        //修改课程中总学分=理论课学分+实践课学分
        $("#updateCourseForm input[name='theorycredit']").bind("input propertychange", function(){
        	$("#updateCourseForm input[name='totalcredit']").val(Number($("#updateCourseForm input[name='theorycredit']").val())
        			+Number($("#updateCourseForm input[name='practicalcredit']").val())) ;
        });
        $("#updateCourseForm input[name='practicalcredit']").bind("input propertychange", function(){
        	$("#updateCourseForm input[name='totalcredit']").val(Number($("#updateCourseForm input[name='theorycredit']").val())
        			+Number($("#updateCourseForm input[name='practicalcredit']").val())) ;
        });
    });
    var isMainCourseArr = ["否","是"];//是否专业主干课程（0-不是、1-是）
    var isBilingualCourseArr = ["否","是"];//是否双语课程（0-不是、1-是）
    var isEnglishCourseArr = ["否","是"];//是否全英文授课课程（0-不是、1-是）
    var isIndustryCourseArr = ["否","是"]; //是否行业课程（0-不是、1-是）
    var isInternationalCourseArr = ["否","是"]; //是否国际课程（0-不是、1-是）   
    var courseType = ["必修","选修"];
    var culcreatetime=null;//定义保存当前培养方案创建日期的全局变量
    var json_obj_item="";//json格式保存目标分解项
    var group_obj_item=null;//存储目标分解项id数组，全局变量
    var cultivationid=null;//存储培养方案id
    
    function getCultivationSchemes() {//获取所有培养方案
        $.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/getCulSchemes.do',
            dataType : 'json', 
            success : function(data) {
            	if(data.culs!=null){
            		listCourseClassification();
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
                }
            },
            error : function(data) {
                alert("获取培养方案出错！");
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
            	            url : urlRootContext+'/courseinfo/getCoursesByCulid.do?cultivationid='
            	            		+data.cul.cultivationid,//根据培养方案id获取课程信息
            	            dataType : 'json', 
            	            success : function(result) {
        	            		$("#cultivationschemeId").val(data.cul.cultivationid);//把当前方案id赋值给input标签
        	            		cultivationid=data.cul.cultivationid;
        	            		if(result.courses!=null){
            	            		$("#updateCourseForm input[name='cultivationschemeId']").val(data.cul.cultivationid);
            	            		$('#bottomTab').bootstrapPaginator(options);
            	                    buildTable(1,10);// 根据培养方案查询全部课程
            	                }else{
            	                	$("#tableBody").empty();//清空
            	                	$("#tableBody").append('<tr><th colspan ="10"><center>查询无数据</center></th></tr>');
            	                }
        	            		$("#addCourseForm input[name='cultivationschemeId']").val(data.cul.cultivationid);
            	            },
            	            error : function(result) {
            	                alert("获取课程出错！");
            	            }
            	        });
                }
            },
            error : function(data) {
                alert("获取当前培养方案出错！");
            }
        });
    }
    
    //生成表格
    function buildTable(pageNum,pageSize) {
        var url =  urlRootContext + "/courseinfo/getCoursesByCulid.do?" +
        		"cultivationid="+cultivationid+//传递培养方案id
        		"&ccid="+$("#courseclassificationId").val(); //传递课程类别id
        var reqParams = {"pageNum":pageNum,"pagesize":pageSize};//请求数据
        $(function () {
            $.ajax({
                type:"POST",
                url:url,
                data:reqParams, 
                async:false,
                dataType:"json",
                success: function(data){
                    if(data.isError == false) {
                        var newoptions = {
                            currentPage: data.pageno,  //当前页数
                            totalPages: data.pages==0?1:data.pages,  //总页数
                            size:"normal",
                            alignment:"center",
                            itemTexts: function (type, page, current) {
                                switch (type) {
                                    case "first":
                                        return "第一页";
                                    case "prev":
                                        return "前一页";
                                    case "next":
                                        return "后一页";
                                    case "last":
                                        return "最后页";
                                    case "page":
                                        return  page;
                                }
                            },
                            onPageClicked: function (e, originalEvent, type, page) {
                                var userName="";
                                buildTable(userName,page,PAGESIZE);//默认每页最多10条
                            }
                        }
                        $('#bottomTab').bootstrapPaginator("setOptions",newoptions); //重新设置总页面数目
                        dataList = data.courses;
                        $("#tableBody").empty();//清空表格内容
                        if (dataList!=null && dataList.length > 0 ) {
                            console.info(dataList.length);
                            var index = 1;
                            var offset = (pageNum -1 )*pageSize;
                            $(dataList).each(function(){//重新生成        
                            	var options=$("#courseclassificationId option:selected"); //获取课程类别选中的项
                                var html ="<tr>";
                                html += '<td>' + this.coursecode + '</td>';
                                html += '<td>' + this.coursename + '</td>';
                                html += '<td>' + this.courseenglishname + '</td>';
                           	 	if(options.text()=="专业必修课"){
                           	 		$.ajax({//根据子课程类别id获取子课程类别
                           	 			async : false,
                           	 			type : 'post',
                           	 			url : urlRootContext+'/courseinfo/getByChildClassificationId.do',
                           	 			data : "childccId=" + this.childcourseclassificationId,
                           	 			success : function(result) {      	
                           	 				if(result.childcc!=null){
                           	 					html += '<td>' + result.childcc.childcourseclassifcationdesc + '</td>';
                           	 				} 
                           	 			},
                           	 			error : function(data) {
                           	 				alert("获取子课程类别信息出错！");
                           	 			}
                           	 		});
                           	 	}else{
                           	 		$.ajax({//根据课程类别id获取课程类别
                           	 			async : false,
                           	 			type : 'post',
                           	 			url : urlRootContext+'/courseinfo/getCourseClassificationByCCId.do',
                           	 			data : "ccId=" + this.courseclassificationId,
                           	 			success : function(result) {      	
                           	 				if(result.cc!=null){
                           	 					html += '<td>' + result.cc.courseclassifcationdesc + '</td>';
                           	 				} 
                           	 			},
                           	 			error : function(data) {
                           	 				alert("获取课程类别信息出错！");
                           	 			}
                           	 		});
                           	 	}
                                html += '<td>' + isMainCourseArr[this.ismajor] + '</td>';
                                html += '<td>' + isBilingualCourseArr[this.isbilingual] + '</td>';
                                html += '<td>' + isEnglishCourseArr[this.isenglish] + '</td>';
                                html += '<td>' + isIndustryCourseArr[this.isindustry] + '</td>';
                                html += '<td>' + isInternationalCourseArr[this.isinternational] + '</td>';
                                html += '<td>' + courseType[this.coursetype] + '</td>';
                                html += '<td>' + this.totalcredit + '</td>';
                                html += '<td>' + this.theorycredit + '</td>';
                                html += '<td>' + this.practicalcredit + '</td>';
                                html += '<td>' + this.term + '</td>';
                                html += '<td>' + this.remark + '</td>';
                           	 	if(options.text().substr(0,2)=="专业"||options.text().substr(0,1)=="—" ){
                           	 		//若选中"专业必修课"或"专业方向课"
                           	 		html += '<td>';
                           	 		html += '<a href="getReqByReqId.do?requireId='+ this.coursid +'" onclick="return false;">查看</a>';
                           	 		html += '</td>';
                           	 		html += '<td>';
                           	 		html += '<button id="updateReqBtn" class="btn btn-xs" data-toggle="modal" data-target="#updateCourse" onclick="toUpdateCourse('+ this.coursid +')">修改</button>';
                           	 		html += '<button type="button" id="delReqBtn" class="btn btn-xs" onclick="delCourseById('+ this.coursid +')">删除</button>';
                           	 		html += '</td>';
                           	 	}else{//通识课
                           	 		html += '<td>';
                           	 		html += '</td>';
                           	 		html += '<td>';
                           	 		html += '<button type="button" id="delReqBtn" class="btn btn-xs" onclick="delGenCourseById('+ this.coursid +')">删除</button>';
                           	 		html += '</td>';
                           	 	}
                                html += '</tr>';
                                $("#tableBody").append(html);
                                index++;
                            });
                        } else {
                            $("#tableBody").append('<tr><th colspan ="16"><center>查询无数据</center></th></tr>');
                        }
                    }else{
                        alert("课程空");
                    }
                },
                error: function(data){
                    alert("查询课程失败:" + data.pages);
                }
            });
        });
    }
	
  //获取课程类别并为课程信息常规属性赋值
    function listCourseClassification() {
        $.ajax({
             async : false,
             type : 'post',
             url : urlRootContext+'/courseinfo/getCourseClassifications.do',
             success : function(data) {
            	 if(data.ccs!=null){
                   	//为查询课程类别框赋值
             		$("#courseclassificationId").empty();
             		$("#courseclassificationId").append('<option value="0">—请选择—</option>');
             		for(var i=0;i<data.ccs.length;i++){
             			var html ='<option value="'+data.ccs[i].courseclassificationid+'">';//课程id
             			html +=data.ccs[i].courseclassifcationdesc + '</option>';//显示课程描述
             			$("#courseclassificationId").append(html);
             		}
            		$("#courseclassificationId option[value='0']").attr("selected", "selected");
                    $("#courseclassificationId").bind("change", function(obj){
	            		$('#bottomTab').bootstrapPaginator(options);
                    	buildTable(1,10);
                    })
                   	//为模态框课程信息常规属性赋值
             		$("select[name='courseclassificationId']").empty();
             		$("select[name='courseclassificationId']").append('<option value="">—请选择—</option>');
                 	for(var i=0;i<data.ccs.length;i++){
                   		  if(data.ccs[i].courseclassifcationdesc.substr(0,2)=="专业"){
                              var html ='<option value="'+data.ccs[i].courseclassificationid+'">';//课程id
                              html +=data.ccs[i].courseclassifcationdesc + '</option>';//显示课程描述
                              $("select[name='courseclassificationId']").append(html);                   			  
                   		  	}
                 	}
                    $("select[name='courseclassificationId']").bind("change", function(obj){
                     	toListChildClassifications($(this).children('option:selected').text()) ;
                    });
            	 } 
             },
             error : function(data) {
            	 alert("获取课程类别信息出错！");
             }
         }); 
     }
    
	//根据父课程类别加载子课程类别
    function toListChildClassifications(Classificationdesc) {
        $.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/courseinfo/getByClassificationDesc.do?Classificationdesc='+Classificationdesc,
            dataType : 'json', 
            success : function(data) {
            	if(data.childccs!=null){
                	$("select[name='childcourseclassificationId']").empty();
                    $("select[name='childcourseclassificationId']").append('<option value="0">——请选择——</option>');
                    for(var i=0;i<data.childccs.length;i++){
                        var html ='<option value="'+data.childccs[i].childcourseclassificationid+'">';
                        html +=data.childccs[i].childcourseclassifcationdesc + '</option>';
                        $("select[name='childcourseclassificationId']").append(html);
                    }
                }
            },
            error : function(data) {
                alert("获取子课程类别出错");
            }
        });
    }
    
 // 根据课程类别打开不同的新建课程模态框
    function toAddCourse() {
    	var options=$("#courseclassificationId option:selected"); //获取课程类别选中的项
   	 	if(options.text().substr(0,2)=="专业"||options.text().substr(0,1)=="—" ){
   	 		//若选中"专业必修课"或"专业方向课"
   	 		$('#addCourse').modal();//则打开添加课程模态框
           	//为模态框课程信息常规属性赋值
   		 $("#addCourseForm select[ name='courseclassificationId'] option[value='"+ options.val() + "']")
         .attr("selected", "selected");
   		 toListChildClassifications(options.text()) ;
   	 	}else{
   	 		buildGenenalCourseTable(1,10);//生成通识课列表
   	 		$('#addGeneralCourse').modal();//打开已有通识课或跨专业选修课选择模态框
   	 	}
    }   
    
// 保存课程
    function addCourseOP() {
   	 //进行表单验证
        var bv =  $("#addCourseForm").data('bootstrapValidator');
        bv.validate();
        if (bv.isValid()) {
        $.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/courseinfo/addCourseOP.do',
            data : $('#addCourseForm').serialize(),
            success : function(data) {
                    alert("添加成功");
                    $('#addCourse').modal('hide');
//                    formReset();
                    $("#addCourseForm")[0].reset();//表单重置
                    $('#addCourseForm').bootstrapValidator('resetForm');
                    buildTable(1,10);
            },
            error : function(data) {
                alert("添加失败");
            }
        });
        }
    }
    
  //删除课程
    function delCourseById(courseId) {
        if (confirm('确定删除?')) {
            $.ajax({
                async : false,
                type : 'post',
                url : urlRootContext+'/courseinfo/delCourseById.do',
                data : "id=" + courseId,
                success : function(data) {
                    if (data.result == 'SUCCESS') {
                      alert("删除成功【" + data.result + "】");
                    } else {
                      alert("删除失败【" + data.result + "】");
                    }
                    var pageNum = $("#bottomTab li[class='active']").text(); // 获取删除前的页码
                    buildTable(1,10);
                },
                error : function(data) {
                     alert(data.result);
                }
            });
        }
    }
    
    //删除已关联的通识课程
    function delGenCourseById(id) {
    	var url =  urlRootContext + "/courseinfo/delGenCourseById.do?" +
		"cultivationid="+cultivationid+//传递培养方案id
		"&id="+id; //传递通识课程类别id
        if (confirm('确定删除?')) {
            $.ajax({
                async : false,
                type : 'post',
                url : url,
                success : function(data) {
                    if (data.result == 'SUCCESS') {
                      alert("删除成功【" + data.result + "】");
                    } else {
                      alert("删除失败【" + data.result + "】");
                    }
                    var pageNum = $("#bottomTab li[class='active']").text(); // 获取删除前的页码
                    buildTable(1,10);
                },
                error : function(data) {
                     alert(data.result);
                }
            });
        }
    }
    
  //打开修改课程模态框
    function toUpdateCourse(courseId) {
            $.ajax({
                async : false,
                type : 'post',
                url : urlRootContext+'/courseinfo/updateCourse.do',
                data : "id=" + courseId,
                success : function(data) {
                	if(data.course!=null){
                		listCourseClassification();//课程类别下拉框
                		//若原课程子类别有数据则加载课程子类别下拉框 
                		if(data.course.childcourseclassificationId>0){
                    		toListChildClassifications("专业必修课");               			
                		}
                		$("#updateCourseForm input[ name='coursid']").val(
                				data.course.coursid);
                		$("#updateCourseForm input[ name='coursecode']").val(
                				data.course.coursecode);
                		$("#updateCourseForm input[ name='coursename']").val(
                			data.course.coursename);
                		$("#updateCourseForm input[ name='courseenglishname']").val(
                            data.course.courseenglishname);
                		$(":radio[name='ismajor'][value='" + data.course.ismajor + "']")
                		.prop("checked", "checked");
                		$(":radio[name='isbilingual'][value='" + data.course.isbilingual + "']").prop("checked", "checked");
                		$(":radio[name='isenglish'][value='" + data.course.isenglish + "']").prop("checked", "checked");
                		$(":radio[name='isindustry'][value='" + data.course.isindustry + "']").prop("checked", "checked");
                		$(":radio[name='isinternational'][value='" + data.course.isinternational + "']").prop("checked", "checked");
                		$("#updateCourseForm select[ name='coursetype'] option[value='"+ data.course.coursetype + "']")
                         .attr("selected", "selected");
                		$("#updateCourseForm input[ name='theorycredit']").val(
                                data.course.theorycredit);
                		$("#updateCourseForm input[ name='practicalcredit']").val(
                                data.course.practicalcredit);
                		$("#updateCourseForm input[ name='totalcredit']").val(
                				Number($("#updateCourseForm input[name='theorycredit']").val())
                    			+Number($("#updateCourseForm input[name='practicalcredit']").val()));
                		$("#updateCourseForm input[ name='term']").val(
                                data.course.term);
                		$("#updateCourseForm input[ name='remark']").val(
                                data.course.remark);
                		 $("#updateCourseForm select[ name='courseclassificationId'] option[value='"+ data.course.courseclassificationId + "']")
                         .attr("selected", "selected");
                		 $("#updateCourseForm select[ name='childcourseclassificationId'] option[value='"+ data.course.childcourseclassificationId + "']")
                         .attr("selected", "selected");
                	}
                },
                error : function(data) {
                     alert("打开课程模态框错误");
                }
            });
    }
   
 // 保存修改后的课程信息
    function updateCourseOP() {
        $.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/courseinfo/updateCourseOP.do',
            data : $('#updateCourseForm').serialize(),
            success : function(data) {
                    alert("修改成功");
                    $('#updateCourse').modal('hide');
//                    formReset();
                    $("#updateCourseForm")[0].reset();//表单重置
                    buildTable(1,10);
            },
            error : function(data) {
                alert("修改失败");
            }
        });
    }
    
  //创建毕业要求表单验证
    $(function () {
        $("#addCourseForm").bootstrapValidator({
            message: 'This value is not valid',
            group: '.rowGroup',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
            	coursecode: {
                    validators: {
                        notEmpty: {
                            message: '编码不能为空'
                        }
                    }
                },
                coursetype: {
                    validators: {
                        notEmpty: {
                            message: '课程类型不能为空'
                        }
                    }
                },
                courseenglishname: {
                    validators: {
                        notEmpty: {
                            message: '英文名称不能为空'
                        }
                    }
                },
                ismajor: {
                    validators: {
                        notEmpty: {  message: '是否主干课不能为空'    }
                    }
                },
                isbilingual: {
                    validators: {
                        notEmpty: {  message: '是否双语课不能为空'    }
                    }
                },
                isenglish: {
                    validators: {
                        notEmpty: {  message: '是否英文授课不能为空'    }
                    }
                },
                isindustry: {
                    validators: {
                        notEmpty: {  message: '是否行业课不能为空'    }
                    }
                },
                isinternational: {
                    validators: {
                        notEmpty: {  message: '是否国际课不能为空'    }
                    }
                },
                totalcredit: {
                    validators: {
                        notEmpty: {
                            message: '总学分不能为空'
                        }
                    }
                },
                theorycredit: {
                    validators: {
                        notEmpty: {
                            message: '理论学分不能为空'
                        }
                    }
                },
                practicalcredit: {
                    validators: {
                        notEmpty: {
                            message: '实践学分不能为空'
                        }
                    }
                },
                term: {
                    validators: {
                        notEmpty: {
                            message: '学期不能为空'
                        },
                        regexp: {
                    	   	regexp: /^[0-9]*$/,
                    	   	message: '必须是数字'
                               }
                    }
                },
                remark: {
                    validators: {
                        notEmpty: {
                            message: '备注不能为空'
                        }
                    }
                },
                courseclassificationId: {
                    validators: {
                        notEmpty: {
                            message: '课程类别不能为空'
                        }
                    }
                }
            }
        });
    });  
    
  //根据课程类别确定部分课程类型
    function selectCourseType(courseclassificationId) {
    	 $.ajax({
             async : false,
             type : 'post',
             url : urlRootContext+'/courseinfo/getCourseClassificationByCCId.do',
             data : "ccId=" + courseclassificationId,
             success : function(data) {  
            	 if(data.cc!=null)
            		 {
            		 	switch(data.cc.courseclassifcationdesc){
            		 	case '专业必修课':
                    		$("#addCourseForm select[ name='coursetype'] option[value='0']")
                            .attr("selected", "selected");
                    		break;
            		 	case '跨专业选修课':
                    		$("#addCourseForm select[ name='coursetype'] option[value='1']")
                            .attr("selected", "selected");
                    		break;
            		 	}
            		 }
             },
             error : function(data) {
             alert("查询课程类别出错！");
    	 	}
    	 });
    }