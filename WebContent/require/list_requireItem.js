/**
 * wxz于2018-06-25 created
 * modified at 2018-06-28 by wxz
 * @author wxz
 *
 */

   var options = {
	        currentPage: 1,  //当前页数
	        totalPages: 1,  //总页数，这里只是暂时的，后头会根据查出来的条件进行更改
	        size:"normal",
	        bootstrapMajorVersion: 3,
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
	            var userName = $("#textInput").val(); //取内容
	            buildItemTable(userName,page,PAGESIZE);//默认每页最多10条
	        }
	    }
   
  //生成毕业要求分解项表格
function buildItemTable(pageNum,pageSize) {
    var url =  urlRootContext + "/require/getReqItemByReqId.do?requireId="+$('#requirementId').val(); //请求的网址
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
                            buildItemTable(userName,page,PAGESIZE);//默认每页最多10条
                        }
                    }
                    $('#bottomTab').bootstrapPaginator("setOptions",newoptions); //重新设置总页面数目
                    dataList = data.reqItems;
                    $("#tableBody").empty();//清空表格内容
                    if (dataList!=null && dataList.length > 0 ) {
                        console.info(dataList.length);
                        var index = 1;
                        var offset = (pageNum -1 )*pageSize;
                        $(dataList).each(function(){//重新生成
                            var html ="<tr>";
                            html += '<td>' + this.requirementitemsn + '</td>';
                            html += '<td>' + this.requirementitemdesc + '</td>';
                            html += '<td>';
                            html += '<button id="updateReqItemButton" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#updateReqItem" onclick="toUpdateReqItem('+ this.requirementitemid +');">修改</button>';
                            html += '<button type="button" id="del" class="btn btn-default btn-sm" onclick="delReqItemById('+ this.requirementitemid +')">删除</button>';
                            html += '</td>';
                            html += '</tr>';
                            $("#tableBody").append(html);
                            index++;
                        });
                    } else {
                        $("#tableBody").append('<tr><th colspan ="3"><center>查询无数据</center></th></tr>');
                    }
                }else{
                    alert(data.errorMsg);
                }
            },
            error: function(data){
                alert("查询毕业要求分解项失败:" + data.pages);
            }
        });
    });
}
   //根据培养要求id获取培养要求
   function listReqByReqId(reqId){
	   $.ajax({
           async : false,
           type : 'post',
           url : urlRootContext+'/require/getReqByReqId.do?requireId='
           		+reqId,//根据毕业要求id查询分解项
           dataType : 'json', 
           success : function(result) {
           	if(result.req!=null){
           		$("label [name='requirementname']").html(result.req.requirementname);//把当前毕业要求名称赋值给label标签
          		$("label [name='requirementdesc']").html(result.req.requirementdesc);//把当前毕业要求内容赋值给label标签
          		$("input [name='requirementId']").val(result.req.requirementid);//把当前毕业要求id赋值给input标签
          		listReqItemByReqId(result.req.requirementid); //根据培养要求id获取分解项
               }
           },
           error : function(result) {
               alert("获取毕业要求出错！");
           }
       });
   }
   
   function addReqItemOP(){
	 //进行表单验证
       var bv =  $("#addReqItemForm").data('bootstrapValidator');
       bv.validate();
       if (bv.isValid()) {
       $.ajax({
           async : false,
           type : 'post',
           url : urlRootContext+'/require/addReqItem.do',
           data : $('#addReqItemForm').serialize(),
           success : function(data) {
                   alert("添加成功");
                   $('#addReqItem').modal('hide');
                   formReset();
                   $('#addReqItemForm').bootstrapValidator('resetForm');//清除验证状态
                   listReqItemByReqId("");
           },
           error : function(data) {
               alert("添加失败");
           }
       });
       }
   }
   
   //删除毕业要求分解项
   function delReqItemById(reqItemId) {
       if (confirm('确定删除?')) {
           $.ajax({
               async : false,
               type : 'post',
               url : urlRootContext+'/require/delReqItemById.do',
               data : "id=" + reqItemId,
               success : function(data) {
                   if (data.result == 'SUCCESS') {
                     alert("删除成功【" + data.result + "】");
                   } else {
                     alert("删除失败【" + data.result + "】");
                   }
                   var pageNum = $("#bottomTab li[class='active']").text(); // 获取删除前的页码
                   listReqItemByReqId("");//重新生成分解项表格
               },
               error : function(data) {
                    alert(data.result);
               }
           });
       }
   }
   
 //打开修改毕业要求分解项模态框
   function toUpdateReqItem(reqItemId) {
           $.ajax({
               async : false,
               type : 'post',
               url : urlRootContext+'/require/updateReqItem.do',
               data : "id=" + reqItemId,
               success : function(data) {
               	if(data.reqItem!=null){
               		$("#updateReqItemForm input[ name='requirementitemid']").val(
               				data.reqItem.requirementitemid);
               		$("#updateReqItemForm input[ name='requirementitemsn']").val(
               			data.reqItem.requirementitemsn);
               		$("#updateReqItemForm textarea[ name='requirementitemdesc']").val(
                   		data.reqItem.requirementitemdesc);
               	}
               },
               error : function(data) {
                    alert("打开毕业要求分解项模态框错误");
               }
           });
   }
   
   // 保存修改后的毕业要求分解项
   function updateReqItemOP() {
       $.ajax({
           async : false,
           type : 'post',
           url : urlRootContext+'/require/updateReqItemOp.do',
           data : $('#updateReqItemForm').serialize(),
           success : function(data) {
                   alert("修改成功");
                   $('#updateReqItem').modal('hide');
                   formReset();
                   listReqItemByReqId("");//重新生成分解项表格
           },
           error : function(data) {
               alert("修改失败");
           }
       });
   }
   
   //根据培养要求id生成分解项表格
   function listReqItemByReqId(reqId){
		$('#bottomTab').bootstrapPaginator(options);
		buildItemTable(1,10);// 根据毕业要求id生成分解项表格
    }


 //创建毕业要求分解项单验证
   $(function () {
       $("#addReqItemForm").bootstrapValidator({
           message: 'This value is not valid',
           feedbackIcons: {
               valid: 'glyphicon glyphicon-ok',
               invalid: 'glyphicon glyphicon-remove',
               validating: 'glyphicon glyphicon-refresh'
           },
           fields: {
        	   requirementitemsn: {
                   validators: {
                       notEmpty: { message: '分解项序号不能为空' },
                       regexp: {
                    	   	regexp: /^(\d+)-(\d+)$/,
                    	   	message: '格式必须如“1-2”'
                               }
                   }
               },
               requirementitemdesc: {
                   validators: {
                       notEmpty: {
                           message: '内容不能为空'
                       }
                   }
               }
           }
       });
   }); 
