/**
 * wxz于2018-06-23 created
 * wxz于2018-08-29 modified
 * @author wxz
 *
 */   

function getClassifications() {//获取专业类别列表
        $.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/getClassifications.do',
            dataType : 'json', 
            success : function(data) {
            	if(data.specialitieclasses!=null){
                	$("select[name='speciaclassid']").empty();
                    $("select[name='speciaclassid']").append('<option value="">——请选择——</option>');
                    for(var i=0;i<data.specialitieclasses.length;i++){
                        var html ='<option value="'+data.specialitieclasses[i].speciaclassid+'">';
                        html +=data.specialitieclasses[i].speciaclassname + '</option>';
                        $("select[name='speciaclassid']").append(html);
                    }
                    $("select[name='speciaclassid']").bind("change", function(obj){
                    	toListSpecialities($("select[name='speciaclassid']").val()) ;
                    })
                }
            },
            error : function(data) {
                alert(data.result);
            }
        });
    }
    
    function toListSpecialities(speciaclassid) {//根据专业类别id获取专业
        $.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/getSpecialitiesByClassificationId.do?speciaclassid='+speciaclassid,
            dataType : 'json', 
            success : function(data) {
            	if(data.specialities!=null){
                	$("select[name='specialityid']").empty();
                    $("select[name='specialityid']").append('<option value="">——请选择——</option>');
                    for(var i=0;i<data.specialities.length;i++){
                        var html ='<option value="'+data.specialities[i].specialityid+'">';
                        html +=data.specialities[i].specialityname + '</option>';
                        $("select[name='specialityid']").append(html);
                    }
                }
            },
            error : function(data) {
                alert(data.result);
            }
        });
    }
   
   
  //渲染完就执行
    $(function() {
    	if(judgeNavigator()){
        	getClassifications();//获取所有专业类别
    	}//判断用户浏览器类型
    });
    
    //登录表单验证
    $(function () {
        $("#loginform").bootstrapValidator({
            message: 'This value is not valid',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
            	specialityid: {
                    validators: {
                        notEmpty: {
                            message: '专业不能为空'
                        }
                    }
                },
                sn:{
                    validators: {
                        notEmpty: {
                            message: '工号不能为空'
                        },
                        remote:{
                        	type:"POST",
                        	message:'工号不存在',
                        	url:urlRootContext+'/sncheck.do',
                        	delay:2000,
                        	data:''
                        }
                    }
                },
                password:{
                    validators: {
                        notEmpty: {
                            message: '密码不能为空'
                        },
                        remote:{
                        	type:"POST",
                        	message:'密码不正确',
                        	url:urlRootContext+'/pwdcheck.do',
                        	delay:2000,
                        	data:{                 
                        	    sn:function(){return $("#sn").val()},  
                        	    password:function(){return $("#password").val()}
                        	}
                        }
                    }
                }
            }
        });
    });
    
  