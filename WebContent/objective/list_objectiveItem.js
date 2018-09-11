/**
 * wxz于2018-06-25 created
 * @author wxz
 *
 */
var PAGESIZE = 10;
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
        buildTable(userName,page,PAGESIZE);//默认每页最多10条
    }
}
  //生成表格
function buildTable(pageNum,pageSize) {
 
    var url =  urlRootContext + "/objective/getObjItemByObjId.do?objectiveId="+objectiveId; //请求的网址
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
                    dataList = data.objectiveitems;
                    $("#tableBody").empty();//清空表格内容
                    if (dataList!=null && dataList.length > 0 ) {
                        console.info(dataList.length);
                        var index = 1;
                        var offset = (pageNum -1 )*pageSize;
                        $(dataList).each(function(){//重新生成
                            var html ="<tr>";
                            html += '<td>' + this.objectiveitemname + '</td>';
                            html += '<td>' + this.objectiveitemdesc + '</td>';
                            html += '<td>';
                            html += '<button id="updateCourseButton" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#updateObjItem" onclick="updateObjItemById('+ this.objectiveitemid +');">修改</button>';
                            html += '<button type="button" id="del" class="btn btn-default btn-sm" onclick="delObjItemById('+ this.objectiveitemid +')">删除</button>';
                            html += '</td>';
                            html += '</tr>';
                            $("#tableBody").append(html);
                            index++;
                        });
                    } else {
                        $("#tableBody").append('<tr><td colspan ="3"><center>查询无数据</center></td></tr>');
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

//渲染完就执行
$(function() {
    //生成底部分页栏
//    $('#bottomTab').bootstrapPaginator(options);
//    buildTable(1,10);//默认空白查全部

});

//保存目标分解项
function addObjItemOP() {
    $.ajax({
        async : false,
        type : 'post',
        url : urlRootContext+'/objective/addObjItem.do',
        data : $('#addObjItemForm').serialize(),
        success : function(data) {
            if (data.result == 'SUCCESS') {
                alert("目标项添加成功【" + data.result + "】");      
                var pageNum = $("#bottomTab li[class='active']").text(); // 获取添加前的页码
                $('#addObjItem').modal('hide');
                formReset();
                getCultivationSchemes();
            } else {
                //alert("添加失败【" + data.result + "】");
            }
        },
        error : function(data) {
            alert("目标项添加失败!");
        }
    });
}

//删除目标分解项
function delObjItemById(ObjItemId) {
    if (confirm('确定删除?')) {
        $.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/objective/delObjItemById.do',
            data : "id=" + ObjItemId,
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


//修改目标分解项
function updateObjItemById(ObjItemId) {
        $.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/objective/updateObjItem.do',
            data : "id=" + ObjItemId,
            success : function(data) {
            	if(data.objItem!=null){
            		$("#updateObjItemForm input[ name='objectiveitemid']").val(
            				ObjItemId);
            		$("#updateObjItemForm input[ name='objectiveId']").val(
            			data.objItem.objectiveId);
            		$("#updateObjItemForm input[ name='objectiveitemname']").val(
                        data.objItem.objectiveitemname);
            		$("#updateObjItemForm textarea[ name='objectiveitemdesc']").val(
                		data.objItem.objectiveitemdesc);
            	}
            },
            error : function(data) {
                 alert("打开修改目标分解项错误");
            }
        });
}

//保存修改后的目标分解项
function updateObjItemOP() {
    $.ajax({
        async : false,
        type : 'post',
        url : urlRootContext+'/objective/updateObjItemOp.do',
        data : $('#updateObjItemForm').serialize(),
        success : function(data) {
            if (data.result == 'SUCCESS') {
                alert("目标项修改成功【" + data.result + "】");      
                var pageNum = $("#bottomTab li[class='active']").text(); // 获取添加前的页码
                $('#updateObjItem').modal('hide');
                formReset();
                getCultivationSchemes();
            } else {
                //alert("添加失败【" + data.result + "】");
            }
        },
        error : function(data) {
            alert("目标项修改失败!");
        }
    });
}