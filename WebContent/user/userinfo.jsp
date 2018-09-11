<%@page import="edu.njxzc.tcs.bean.SpecialityClassification"%>
<%@page import="edu.njxzc.tcs.bean.Speciality"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <%@include file="../header.jsp"%>
 <%@include file="../ace-header.jsp"%>
 <!-- page specific plugin styles -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/jquery-ui-1.10.3.custom.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/chosen.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrapValidator.min.css" rel="stylesheet" />
<script type="text/javascript">
	//设置用户工号变量
	//var usersn="";
</script>
<script src="${pageContext.request.contextPath}/user/userinfo.js"></script>

</head>

<body>
 <%@include file="../sidebar.jsp"%>

				<div class="main-content">
					<div class="breadcrumbs" id="breadcrumbs">
						<script type="text/javascript">
							try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
						</script>

						<ul class="breadcrumb">
							<li>
								<i class="icon-home home-icon"></i>
								<a href="#">首页</a>
							</li>
							<li class="active">个人信息</li>
						</ul><!-- .breadcrumb -->

						<div class="nav-search" id="nav-search">
							<form class="form-search">
								<span class="input-icon">
									<input type="text" placeholder="Search ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
									<i class="icon-search nav-search-icon"></i>
								</span>
							</form>
						</div><!-- #nav-search -->
					</div>

					<div class="page-content">
						<div class="page-header">
							<h1>
								个人信息
								<small>
									<i class="icon-double-angle-right"></i>
									 修改密码
								</small>
							</h1>
						</div><!-- /.page-header -->

						<div class="row">
							<div class="col-sm-10">
								<!-- PAGE CONTENT BEGINS -->
							<br>
						<form id="updatePwdForm" role="form" class="form-horizontal" action="" method="post">
							<input class="form-control" type="hidden"  name="sn" value="<%=user.getSn()%>"/>
							<br>
							<br>
							<div class="form-group">
								<label class="col-sm-2 control-label">新密码：</label>
								<div class="col-sm-3">
									<input class="form-control" name="password"/>	
								</div>
							</div>
							<br>
							<br>
							<div class="form-group">
								<label class="col-sm-2 control-label">再输一次密码：</label>
								<div class="col-sm-3">
									<input class="form-control" name="secpassword"/>	
								</div>
							</div>
						</form>
							<br>
							<br>
							<div class="col-sm-3  col-md-offset-1">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<button type="button" class="btn-sx btn-primary" id="modifybtn" onclick="updateUserPwd()" >修改</button>
							</div>
								<!-- PAGE CONTENT ENDS -->
							</div><!-- /.col -->
						</div><!-- /.row -->
					</div><!-- /.page-content -->
				</div><!-- /.main-content -->

				
			</div><!-- /.main-container-inner -->

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="icon-double-angle-up icon-only bigger-110"></i>
			</a>

		</div><!-- /.main-container -->
		
</body>
		<!--[if !IE]> -->
</html>