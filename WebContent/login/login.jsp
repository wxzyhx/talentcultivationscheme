<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<%@include file="../header.jsp"%>
<title>登录</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Trendy Tab Login Form template Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrapValidator.min.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/index.css" />
<!-- //Custom Theme files -->
<!-- web font -->
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'><!--web font-->
<!-- //web font -->
<!-- js -->
<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
<script src="login/login.js" type="text/javascript"></script>
<!-- //js -->

  </head>

<body>
	<!-- main -->
	<div class="main">
		<h1>登录</h1>
		<div class="login-form">
			<div class="sap_tabs w3ls-tabs">
				<div id="horizontalTab"
					style="display: block; width: 100%; margin: 0px;">
					<ul class="resp-tabs-list">
						<li class="resp-tab-item" aria-controls="tab_item-0" role="tab"><span>专业负责人</span></li>
<!--  					<li class="resp-tab-item" aria-controls="tab_item-1" role="tab"><span>管理员</span></li>-->	
					</ul>
					<div class="clear"></div>
					<div class="resp-tabs-container">
						<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
							<div class="modal-body">
								<form class="form-horizontal" id="loginform" action="<%=request.getContextPath() %>/userLogin.do" method="post">
									<div class="form-group">
									  <label class="col-sm-4 control-label">工   号</label>
									  	<div class="col-sm-6">
						  					<input class="form-control" name="sn" id="sn" type="text" size="16">
									  	</div>
									  </div>
									<div class="form-group">
									  <label class="col-sm-4 control-label">密    码 </label>
									  	<div class="col-sm-6">
						  					<input class="form-control" name="password" id="password"  type="password" size="16">
									  	</div>
									  </div>
									 <p><c:out value="${loginInfo}" /></p>
									<div class="form-group">
										<label  class="col-sm-4 control-label">专业类别</label>
										<div class="col-sm-6">
											<select class="form-control" name="speciaclassid" id="speciaclassid">
											</select>
										</div>
									</div>
									<div class="form-group">
										<label  class="col-sm-4 control-label">专    业</label>
										<div class="col-sm-6">
											<select class="form-control" name="specialityid" id="specialityid">
											</select>
										</div>
									</div>
									<input type="submit" value="LOGIN">
								</form>
							</div>
						</div>
				<!--	<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-1">
							<div class="modal-body">
								<form class="form-horizontal" id="adminform" action="<%=request.getContextPath() %>/adminLogin.do" method="post">
									<div class="form-group">
									  <label class="col-sm-4 control-label">工   号</label>
									  	<div class="col-sm-6">
						  					<input class="form-control" name="sn"  type="text" size="16">
									  	</div>
									  </div>
									<div class="form-group">
									  <label class="col-sm-4 control-label">密    码 </label>
									  	<div class="col-sm-6">
						  					<input class="form-control" name="password"  type="password" size="16">
									  	</div>
									  </div>
									<input type="submit" value="LOGIN">
								</form>
							</div>
						</div>  -->	
					</div>
				</div>
			</div>
			<!-- ResponsiveTabs js -->
			<script type="text/javascript">
				$(document).ready(function () {
					$('#horizontalTab').easyResponsiveTabs({
						type: 'default', //Types: default, vertical, accordion           
						width: 'auto', //auto or any width like 600px
						fit: true   // 100% fit in a container
					});
				});
			</script>
			<!-- //ResponsiveTabs js -->
		</div>
	</div>
	<!-- //main -->
	<!-- copyright -->
	<div class="copyright">
		<p>© njxzc</p>
	</div>
	<!-- //copyright -->
</body>
</html>
