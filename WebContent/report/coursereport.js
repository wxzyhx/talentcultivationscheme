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
    var culId=null;//定义保存当前培养方案Id的全局变量
    
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
                	alert("尚未创建培养方案");
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
            		culId=data.cul.cultivationid;
            		$("#reportFrame").attr("src","/WebReport/ReportServer?reportlet=/tcs/culturescheme.cpt&culid="+data.cul.cultivationid+"&scid="+$("#scid").val());
            		$("#reportFrame").show();
                   // $("#modifybtn").removeAttr("disabled");  //启用修改按钮
                }
            },
            error : function(data) {
                alert("根据日期获取培养方案出错！");
            }
        });
    }
    


