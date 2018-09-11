

 //生成表格
    function buildGenenalCourseTable(pageNum,pageSize) {
    	var options=$("#courseclassificationId option:selected"); //获取课程类别选中的项
        var url =  urlRootContext + "/courseinfo/getGenenalCoursesByClassid.do?cultivationid="+
              $("#cultivationschemeId").val()+"&Classificationdesc="+options.text();
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
                                buildGenenalCourseTable(userName,page,PAGESIZE);//默认每页最多10条
                            }
                        }
                        $('#bottomTab').bootstrapPaginator("setOptions",newoptions); //重新设置总页面数目
                        dataList = data.gencourses;
                        $("#generalcoursetableBody").empty();//清空表格内容
                        if (dataList!=null && dataList.length > 0 ) {
                            console.info(dataList.length);
                            var index = 1;
                            var offset = (pageNum -1 )*pageSize;
                            $(dataList).each(function(){//重新生成                       	
                                var html ="<tr>";
                                html += '<td><input type="checkbox"'
        	        			 	+' id="ck'+this.coursid+'" value="'+this.coursid+';"/></td>';
                                html += '<td>' + this.coursecode + '</td>';
                                html += '<td>' + this.coursename + '</td>';
                                html += '<td>' + this.courseenglishname + '</td>';
                                html += '<td>' + courseType[this.coursetype] + '</td>';
                                html += '<td>' + this.totalcredit + '</td>';
                                html += '<td>' + this.theorycredit + '</td>';
                                html += '<td>' + this.practicalcredit + '</td>';
                                html += '<td>' + this.term + '</td>';
                                html += '<td>' + this.remark + '</td>';
                                html += '</tr>';
                                $("#generalcoursetableBody").append(html);
                                index++;
                            });
                        } else {
                            $("#generalcoursetableBody").append('<tr><th colspan ="10"><center>查询无数据</center></th></tr>');
                        }
                    }else{
                        alert("通识课程空");
                    }
                },
                error: function(data){
                    alert("查询通识课程失败:" + data.pages);
                }
            });
        });
    }
    
	//获取所有选中的通识课程并赋值给隐藏输入框gencourseitems
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
		$("#gencourseitems").val(new_items);
    }
    
    //提交选择的通识课
    function addGeneralCourseOP(){
    	getObjItemCheckbox();
    	  $.ajax({
              async : false,
              type : 'post',
              url : urlRootContext+'/courseinfo/addGenCourseOP.do?cultivationid='+
              $("#cultivationschemeId").val()+'&gencourseitems='+$("#gencourseitems").val(),
              success : function(data) {
                      alert("添加通识课成功");
                      $('#addGeneralCourse').modal('hide');
                      buildTable(1,10);
              },
              error : function(data) {
                  alert("添加通识课失败");
              }
          });
    }