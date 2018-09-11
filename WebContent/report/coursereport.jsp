<%@page import="edu.njxzc.tcs.bean.SpecialityClassification"%>
<%@page import="edu.njxzc.tcs.bean.Speciality"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>培养方案报表</title>
 <%@include file="../header.jsp"%>
 <%@include file="../ace-header.jsp"%>

 <!-- page specific plugin styles -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/jquery-ui-1.10.3.custom.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/chosen.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrapValidator.min.css" rel="stylesheet" />
<script src="${pageContext.request.contextPath}/report/coursereport.js"></script>
<script type="text/javascript">
	$(function() {
			//设置当前选中菜单样式
			$("#report").siblings('li').removeClass('active');    
        	$("#report").addClass('active'); 
	});
	
</script>
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
							<li class="active">报表</li>
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
								报表
								<small>
									<i class="icon-double-angle-right"></i>
									 培养方案报表
								</small>
							</h1>
						</div><!-- /.page-header -->

						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->
							<div class="form-group">
								<label class="col-sm-2 control-label">方案制定年份：</label>
								<div class="col-sm-2">
								<select class="form-control" name="culcreatetime" id="culcreatetime">	
										<option value="">&nbsp;</option>
								</select>
								</div>
							</div>
							<input class="form-control" type="hidden"  name="cultivationschemeId" id="cultivationschemeId"/>
							<br>
							<div class="form-group">
								<label class="col-sm-2 control-label">专&nbsp;&nbsp;&nbsp;业：</label>
								<label class="col-sm-3 control-label">
								<%edu.njxzc.tcs.bean.Speciality speciality=(edu.njxzc.tcs.bean.Speciality)
  										request.getSession().getAttribute("speciality"); %>
									<%=speciality.getSpecialityname() %>
								</label>
							</div>
							<br>
							<input class="form-control" type="hidden"  id="scid" value="<%=speciality.getSpeciaclassId()%>"/>
							<iframe id="reportFrame" frameborder="0" width="1248" height="900" style="display:none;"
 							src=""></iframe>  
			
								<!-- PAGE CONTENT ENDS -->
							</div><!-- /.col -->
						</div><!-- /.row -->
					</div><!-- /.page-content -->
				</div><!-- /.main-content -->
 <%@include file="../ace-settings-container.jsp"%>
			</div><!-- /.main-container-inner -->		
			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="icon-double-angle-up icon-only bigger-110"></i>
			</a>
	</div><!-- /.main-container -->
	
	

		
</body>
		<!--[if !IE]> -->

  <script type="text/javascript">
		/* 日历插件  只选择年份*/
		$(".form_datetime").datetimepicker({
			format: "yyyy-mm",
			autoclose: true,
			showMeridian: true,
			changeYear:true,
			pickerPosition: "bottom-left",
			language: 'zh-CN',//中文，需要引用zh-CN.js包
			startView: 2,//月视图
			minView: 2,//日期时间选择器所能够提供的最精确的时间选择视图
		}).on('hide',function(e) {  
            $('#addSchemeForm').data('bootstrapValidator')  
            .updateStatus('culcreatetime', 'NOT_VALIDATED',null)  
            .validateField('culcreatetime');  
    }); 
	</script>
</html>