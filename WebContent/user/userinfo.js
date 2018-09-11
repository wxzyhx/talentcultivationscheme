/**
 * wxz于2018-07-03 created
 * @author wxz
 *
 */
  
// 保存修改后的用户密码
    function updateUserPwd() {
      	//进行表单验证
        var bv =  $("#updatePwdForm").data('bootstrapValidator');
        bv.validate();
        if (bv.isValid()) {
        $.ajax({
            async : false,
            type : 'post',
            url : urlRootContext+'/updatePassword.do',
            data : $('#updatePwdForm').serialize(),
            success : function(data) {
                    alert("修改成功");
                    $('#updatePwdForm').bootstrapValidator('resetForm');
                    formReset();
            },
            error : function(data) {
                alert("修改失败");
            }
        });
        }
    }
    
  //创建毕业要求表单验证
    $(function () {
        $("#updatePwdForm").bootstrapValidator({
            message: 'This value is not valid',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
            	password: {
                    validators: {
                        notEmpty: {
                            message: '密码不能为空'
                        }
                    }
                },
                secpassword: {
                    validators: {
                        notEmpty: {
                            message: '重复密码不能为空'
                        }
                    }
                },
                password: {
                    validators: {
                        identical: {
                            field: 'secpassword',
                            message: '两次输入的密码不相符'
                        }
                    }
                },
                secpassword: {
                    validators: {
                        identical: {
                            field: 'password',
                            message: '两次输入的密码不相符'
                        }
                    }
                }
            }
        });
    });  