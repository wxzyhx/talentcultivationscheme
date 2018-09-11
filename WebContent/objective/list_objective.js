/**
 * wxz于2018-06-22 created
 *  wxz于2018-06-25 modified toDisplayCultivationScheme(cultime)
 *  wxz于2018-07-13 modified 若培养目标还没创建则清空培养目标分解项
 * @author wxz
 *
 */
  //渲染完就执行
    $(function() {
    	getCultivationSchemes();//获取所有培养方案
    });
    
    var culcreatetime=null;//定义保存当前培养方案创建日期的全局变量
    var objectiveId=null;//定义保存当前目标Id的全局变量
    
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
            	            url : urlRootContext+'/objective/getObjectiveByCulid.do?cultivationid='
            	            		+data.cul.cultivationid,//根据培养方案id获取培养目标
            	            dataType : 'json', 
            	            success : function(result) {
            	            	if(result.obj!=null){
            	            		$("#cultivationschemeId").val(data.cul.cultivationid);//把当前方案id赋值给input标签
            	            		//把当前方案id赋值给修改模态框input标签
            	            		$("#updateObjForm input[name='cultivationschemeId']").val(data.cul.cultivationid);
            	            		$("#objectivecontent").html(result.obj.objectivecontent);//培养目标内容
            	            		objectiveId=result.obj.objectiveid;//保存目标Id
            	            		$("#updateObjForm input[name='objectiveid']").val(result.obj.objectiveid); //修改目标模态框培养目标id
            	            		$("#addObjItemForm input[name='objectiveId']").val(result.obj.objectiveid); //目标分解项模态框培养目标id
            	            		$("#updateObjForm textarea[name='objectivecontent']").val(result.obj.objectivecontent);//培养目标内容
            	                    $("#addItemBtn").removeAttr("disabled");  //启用添加目标分解项按钮
            	                    $("#modifyBtn").removeAttr("disabled");  //启用修改按钮
            	                    $("#createBtn").attr("disabled","true"); //禁用创建按钮
            	                    $('#bottomTab').bootstrapPaginator(options);
            	                    buildTable(1,10);//查询全部目标分解项
            	                }else{
            	            		//把当前方案id赋值给添加模态框input标签
            	                	$("#addObjForm input[name='cultivationschemeId']").val(data.cul.cultivationid);
            	                    $("#tableBody").empty();//清空表格内容
            	                	alert("培养目标还没创建，请创建！");
            	                	$("#createBtn").removeAttr("disabled");  //没有培养方案，启用创建按钮
            	                    $("#modifyBtn").attr("disabled","true");  //禁用修改按钮
            	                    $("#objectivecontent").html("");//培养目标内容清空
            	                    $("#addItemBtn").attr("disabled","true");  //禁用添加目标分解项按钮
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
    
//
// 保存培养目标
    function addObjOP() {
        $.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/objective/addObjOP.do',
            data : $('#addObjForm').serialize(),
            success : function(data) {
                    alert("添加成功");
                    $('#addObj').modal('hide');
                    formReset();
                    getCultivationSchemes();
            },
            error : function(data) {
                alert("添加失败");
            }
        });

    }

   
 // 保存修改后的培养方案
    function updateObjOP() {
        $.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/objective/updateObj.do',
            data : $('#updateObjForm').serialize(),
            success : function(data) {
                    alert("修改成功");
                    $('#updateObj').modal('hide');
                    formReset();
                    getCultivationSchemes();
            },
            error : function(data) {
                alert("修改失败");
            }
        });

    }