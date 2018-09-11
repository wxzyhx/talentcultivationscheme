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
                	alert("请先添加培养方案！");
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
            	            url : urlRootContext+'/totalcredit/getCoursesByCulid.do?cultivationid='+data.cul.cultivationid,
            	            dataType : 'json', 
            	            success : function(data) {
            	            	$("#generalcompulsory").html(data.generalCompulsoryCredits+"&nbsp;分");
            	            	$("#generalelective").html(data.generalElectiveCredits+"&nbsp;分");
            	            	$("#professionalcompulsory").html(data.professionalCompulsoryCredits+"&nbsp;分");
            	            	$("#professionaldirection").html(data.professionalDirectionCredits+"&nbsp;分");
            	            	$("#interdisciplinaryelective").html(data.interdisciplinaryElectiveCredits+"&nbsp;分");
            	            	$("#totalcredit").html(data.totalcredit+"&nbsp;分");
            	            	/* 学分规则*/
            	            	$("#generalcompulsoryrule").html("最高&nbsp;"+data.generalCompulsoryCreditsRule+"&nbsp;分");
            	            	$("#generalelectiverule").html("最高&nbsp;"+data.generalElectiveCreditsRule+"&nbsp;分");
            	            	$("#professionalcompulsoryrule").html("最高&nbsp;"+data.professionalCompulsoryCreditsRule+"&nbsp;分");
            	            	$("#professionaldirectionrule").html("最高&nbsp;"+data.professionalDirectionCreditsRule+"&nbsp;分");
            	            	$("#interdisciplinaryelectiverule").html("最高&nbsp;"+data.interdisciplinaryElectiveCreditsRule+"&nbsp;分");
            	            	$("#totalcreditrule").html("最高&nbsp;"+data.totalcreditRule+"&nbsp;分");
            	            },
            	            error : function(data) {
            	                alert("获取学分出错！");
            	            }
            		 });
                }
            },
            error : function(data) {
                alert("获取当前培养方案出错！");
            }
        });
    }
  