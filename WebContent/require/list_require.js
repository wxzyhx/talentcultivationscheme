/**
 * wxz于2018-06-22 created
 *  wxz于2018-06-25 modified toDisplayCultivationScheme(cultime)
 *  modified loadObjItemToCheckbox() and addCheckboxtoUpdateModal()  at 0703 by wxz 
 * @author wxz
 *
 */
  //渲染完就执行
    $(function() {
    	getCultivationSchemes();//获取所有培养方案
    });
    
    var culcreatetime=null;//定义保存当前培养方案创建日期的全局变量
    var json_obj_item="";//json格式保存目标分解项
    var group_obj_item=null;//存储目标分解项id数组，全局变量
    
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
            	            url : urlRootContext+'/require/getRequirementsByCulid.do?cultivationid='
            	            		+data.cul.cultivationid,//根据培养方案id获取毕业要求
            	            dataType : 'json', 
            	            success : function(result) {
            	            	if(result.reqs!=null){
            	            		$("#cultivationschemeId").val(data.cul.cultivationid);//把当前方案id赋值给input标签
            	            		$("#addRequireForm input[name='cultivationschemeId']").val(data.cul.cultivationid);
            	            		$("#updateRequireForm input[name='cultivationschemeId']").val(data.cul.cultivationid);
            	            		$('#bottomTab').bootstrapPaginator(options);
            	                    buildTable(1,10);// 根据培养方案查询全部毕业要求
            	                }
            	            },
            	            error : function(result) {
            	                alert("获取培养目标出错！");
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
        var url =  urlRootContext + "/require/getRequirementsByCulid.do?cultivationid="+$("#cultivationschemeId").val(); //请求的网址
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
                        dataList = data.reqs;
                        $("#tableBody").empty();//清空表格内容
                        if (dataList!=null && dataList.length > 0 ) {
                            console.info(dataList.length);
                            var index = 1;
                            var offset = (pageNum -1 )*pageSize;
                            $(dataList).each(function(){//重新生成
                                var html ="<tr>";
                                html += '<td>' + this.requirementname + '</td>';
                                html += '<td>' + this.requirementdesc + '</td>';
                                html += '<td>';
                                html += '<a href="getReqByReqId.do?requireId='+ this.requirementid +'">查看</button>';
                                html += '</td>';
                                html += '<td>';
                                html += '<button id="updateReqBtn" class="btn btn-xs" data-toggle="modal" data-target="#updateRequire" onclick="toUpdateReq('+ this.requirementid +')">修改</button>';
                                html += '<button type="button" id="delReqBtn" class="btn btn-xs" onclick="delReqById('+ this.requirementid +')">删除</button>';
                                html += '</td>';
                                html += '</tr>';
                                $("#tableBody").append(html);
                                index++;
                            });
                        } else {
                            $("#tableBody").append('<tr><th colspan ="4"><center>查询无数据</center></th></tr>');
                        }
                    }else{
                        alert(data.errorMsg);
                    }
                },
                error: function(data){
                    alert("查询目标分解项失败:" + data.pages);
                }
            });
        });
    }
    
  //载入培养目标分解项，载入的时候还要把所有的值都赋到一个string_obj_item的字符串中，
	//然后再使用split的方法将字符串根据分号拆开成一个group_obj_item数组
	function loadObjItemToCheckbox(){
		$.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/objective/getObjectiveByCulid.do?cultivationid='
            		+$("#cultivationschemeId").val(),//根据培养方案id获取培养目标
            dataType : 'json', 
            success : function(result) {
            	if(result.obj!=null){
            		$.ajax({ 
            			type : "POST",  
            			url : urlRootContext+'/objective/getObjItemByObjId.do',
            			dataType : 'json', 
            			async: false, 
                        data : "objectiveId=" + result.obj.objectiveid,
            			success : function(result) {
            				json_obj_item = result.objectiveitems;
            				var tr_idx = 0;
        					$("#addRequireForm div[name='ckb_objectives']").empty();//清空所有目标复选框
        					$("#updateRequireForm div[name='ckb_objectives']").empty();//清空所有目标复选框
            				//循环遍历所有objectiveitems项
            				$.each(result.objectiveitems,function(idx,item){
            					if(idx == 0){
            						string_obj_item = "";
            					}
            					if(idx != result.objectiveitems.length-1){
            						string_obj_item += item.objectiveitemid + ";";
            					}
            					if(idx == result.objectiveitems.length-1){
            						string_obj_item += item.objectiveitemid;
            					}
            					//一行n个
            					if(idx%6 == 0){
            	        			tr_idx = idx+1;
            	        			$("#addRequireForm div[name='ckb_objectives']").append("<tr id='tr_"+tr_idx+"'>");
            	        		}
            	        		var html = "<td style='border-style:none;'><input type='checkbox' "
            	        			 	+"style='vertical-align:middle;' id='ck"+item.objectiveitemid+"' value='"
            	        				+item.objectiveitemid+";"+"' />" 
            	        				+"<label for='ck"+item.objectiveitemid+"' data-toggle='tooltip' data-placement='bottom'" +
            	        						" title='"+item.objectiveitemdesc+"'>目标"
            	        					+item.objectiveitemname+"</label></td><td>&nbsp;&nbsp;&nbsp;</td>";
            	        		$("#tr_"+tr_idx).append(html);
            	        		if((idx+1)%6 == 0){
            	        			$("#addRequireForm div[name='ckb_objectives']").append("</tr>");
            	        		}
            				});
            				//循环便利完result后使用split的方法将字符串根据分号拆开成一个group_obj_item数组，该变量为全局变量
            				group_obj_item = string_obj_item.split(";");
            			}
            		});
                }
            },
            error : function(result) {
                alert("获取培养目标出错！");
            }
        });		
	}	
	
	//为修改模态框动态添加培养目标复选框
	function addCheckboxtoUpdateModal(){
		if(group_obj_item==null){//若没有调用添加培养要求方法
			loadObjItemToCheckbox();
		}
		var tr_idx = 0;
		$("#addRequireForm div[name='ckb_objectives']").empty();//清空所有目标复选框
		$("#updateRequireForm div[name='ckb_objectives']").empty();//清空所有目标复选框
		//循环遍历所有objectiveitems项
		$.each(json_obj_item,function(idx,item){
			if(idx == 0){
				string_obj_item = "";
			}
			if(idx != json_obj_item.length-1){
				string_obj_item += item.objectiveitemid + ";";
			}
			if(idx == json_obj_item.length-1){
				string_obj_item += item.objectiveitemid;
			}
			//一行n个
			if(idx%6 == 0){
    			tr_idx = idx+1;
    			$("#updateRequireForm div[name='ckb_objectives']").append("<tr id='tr_"+tr_idx+"'>");
    		}
    		var html = "<td style='border-style:none;'><input type='checkbox' "
    			 	+"style='vertical-align:middle;' id='ck"+item.objectiveitemid+"' value='"
    				+item.objectiveitemid+";"+"' />" 
    				+"<label for='ck"+item.objectiveitemid+"' data-toggle='tooltip' data-placement='bottom'" +
            	        " title='"+item.objectiveitemdesc+"'>目标"
    					+item.objectiveitemname+"</label></td></td><td>&nbsp;&nbsp;&nbsp;</td>";
    		$("#tr_"+tr_idx).append(html);
    		if((idx+1)%6 == 0){
    			$("#updateRequireForm div[name='ckb_objectives']").append("</tr>");
    		}
		});
	}
	
	
	//获取所有选中的关联目标项并赋值给隐藏输入框objectiveitems
    function getObjItemCheckbox(){
    	//根据type值获得所有选中的checkbox中的值
		var chenked=$("input[type='checkbox']:checked ").val([]); 
		var selected_item = ""; 
		//循环从1开始，下标为0的checkbox的值为on，不知道是哪来的，所以直接从1开始遍历
		for(var i=0;i<chenked.length;i++){ 
			selected_item += chenked[i].value; 
		}
		//去掉最后一个分号
		var new_items = selected_item.substring(0, selected_item.length-1);
		//给objectiveitems赋上选中的checkbox的值，该文本框为隐藏属性
		$("input[name='objectiveitems']").val(new_items);
    }
	
	
	function emptyselecter(){//清空所有选择框的所有选择项
		for(var j=0;j<group_obj_item.length;j++){//清空所有目标项复选框状态
				var obj_item_temp = group_obj_item[j]+";";
				$("input[type=checkbox][value='"+obj_item_temp+"']").attr("checked", !'checked');
		}
	}
	
// 保存毕业要求
    function addReqOP() {
   	 //进行表单验证
        var bv =  $("#addRequireForm").data('bootstrapValidator');
        bv.validate();
        if (bv.isValid()) {
        	getObjItemCheckbox();//关联目标项复选框值
        $.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/require/addReqOP.do',
            data : $('#addRequireForm').serialize(),
            success : function(data) {
                    alert("添加成功");
                    $('#addRequire').modal('hide');
                    formReset();
                    $('#addRequireForm').bootstrapValidator('resetForm');
                    getCultivationSchemes();
            },
            error : function(data) {
                alert("添加失败");
            }
        });
        }
    }
    
  //删除毕业要求
    function delReqById(reqId) {
        if (confirm('确定删除?')) {
            $.ajax({
                async : false,
                type : 'post',
                url : urlRootContext+'/require/delReqById.do',
                data : "id=" + reqId,
                success : function(data) {
                    if (data.result == 'SUCCESS') {
                      alert("删除成功【" + data.result + "】");
                    } else {
                      alert("删除失败【" + data.result + "】");
                    }
                    var pageNum = $("#bottomTab li[class='active']").text(); // 获取删除前的页码
                    getCultivationSchemes();
                },
                error : function(data) {
                     alert(data.result);
                }
            });
        }
    }
    
  //打开修改毕业要求模态框
    function toUpdateReq(reqId) {
    	addCheckboxtoUpdateModal();
            $.ajax({
                async : false,
                type : 'post',
                url : urlRootContext+'/require/updateReq.do',
                data : "id=" + reqId,
                success : function(data) {
                	if(data.req!=null){
                		$("#updateRequireForm input[ name='requirementid']").val(
                				data.req.requirementid);
                		$("#updateRequireForm input[ name='requirementname']").val(
                			data.req.requirementname);
                		$("#updateRequireForm input[ name='cultivationschemeId']").val(
                            data.req.cultivationschemeId);
                		$("#updateRequireForm textarea[ name='requirementdesc']").val(
                    		data.req.requirementdesc);
                		if(data.req.objectiveitems !=null){
                			//外层循环遍历该培养要求对应的培养目标
                			objlist=data.req.objectiveitems.split(";");
                			for(var i=0;i<objlist.length;i++){
                				//内层循环遍历该培养目标的所有目标项
                				for(var j=0;j<group_obj_item.length;j++){
                					if(objlist[i] == group_obj_item[j]){
                						//将每个服务形式后面加上分号，因为checkbox中所有的value最后都有分号
                						var obj_id_temp = group_obj_item[j]+";";
                						$("input[type=checkbox][value='"+obj_id_temp+"']").attr("checked", 'checked');
                					}
                				}
                			}
                		}
                	}
                },
                error : function(data) {
                     alert("打开毕业要求模态框错误");
                }
            });
    }
   
 // 保存修改后的毕业要求
    function updateReqOP() {
        getObjItemCheckbox();
        $.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/require/updateReqOP.do',
            data : $('#updateRequireForm').serialize(),
            success : function(data) {
                    alert("修改成功");
                    $('#updateRequire').modal('hide');
                    formReset();
                    getCultivationSchemes();
            },
            error : function(data) {
                alert("修改失败");
            }
        });
    }
    
  //创建毕业要求表单验证
    $(function () {
        $("#addRequireForm").bootstrapValidator({
            message: 'This value is not valid',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
            	requirementname: {
                    validators: {
                        notEmpty: {
                            message: '名称不能为空'
                        },
                        regexp: {
                    	   	regexp: /[0-9]+/,
                    	   	message: '名称中至少包含一个数字'
                               }
                    }
                },
                requirementdesc: {
                    validators: {
                        notEmpty: {
                            message: '内容不能为空'
                        }
                    }
                }
            }
        });
    });  
    
