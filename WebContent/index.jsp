<%@page import="edu.njxzc.tcs.bean.SpecialityClassification"%>
<%@page import="edu.njxzc.tcs.bean.Speciality"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

 <%@include file="header.jsp"%>
 <%@include file="ace-header.jsp"%>

 <!-- page specific plugin styles -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/jquery-ui-1.10.3.custom.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/chosen.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrapValidator.min.css" rel="stylesheet" />
<script src="${pageContext.request.contextPath}/basic/schemeFunction.js"></script>
</head>

<body>
 <%@include file="sidebar.jsp"%>
	
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
							<li class="active">培养方案</li>
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
								培养方案
								<small>
									<i class="icon-double-angle-right"></i>
									 基本信息
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
							<div class="form-group">
								<label class="col-sm-2 control-label">部&nbsp;&nbsp;&nbsp;门：</label>
								<label class="col-sm-3 control-label" id="departmentId"></label>
							</div>
							<br>
							<div class="form-group">
								<label class="col-sm-2 control-label">部门负责人：</label>
								<label class="col-sm-3 control-label" id="departmenthead"></label>
							</div>
							<br>
							<div class="form-group">
								<label class="col-sm-2 control-label">专业负责人：</label>
								<label class="col-sm-3 control-label" id="specialityprincipal"></label>
							</div>
							<br>
							<div class="form-group">
								<label class="col-sm-2 control-label">审核人：</label>
								<label class="col-sm-3 control-label" id="reviewer"></label>
							</div>
							<br>
							<div class="form-group">
								<label class="col-sm-2 control-label">校&nbsp;&nbsp;&nbsp;长：</label>
								<label class="col-sm-3 control-label" id="president"></label>
							</div>
							<br>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<button type="button" class="btn-sx btn-primary" data-toggle="modal" 
							data-target="#addScheme" onclick="addScheme()">添加</button>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<button type="button" class="btn-sx btn-primary" id="modifybtn" data-toggle="modal" 
							data-target="#updateScheme"onclick="updateScheme()" disabled="disabled">修改</button>
								<!-- PAGE CONTENT ENDS -->
							</div><!-- /.col -->
						</div><!-- /.row -->
					</div><!-- /.page-content -->
				</div><!-- /.main-content -->
 <%@include file="ace-settings-container.jsp"%>
			</div><!-- /.main-container-inner -->		
			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="icon-double-angle-up icon-only bigger-110"></i>
			</a>
	</div><!-- /.main-container -->
	
	<!--添加培养方案模态框 -->
		<div class="modal fade" id="addScheme" tabindex="-1" role="dialog"
	 		aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>
					<h4 class="modal-title" id="myModalLabel">添加培养方案</h4>
					</div>
				<div class="modal-body">

				<form id="addSchemeForm" role="form" class="form-horizontal" action="" method="post">
					
					<div class="form-group">
					    <label  for="" class="col-sm-4 control-label">培养方案制定日期：</label>
					    <div class="col-sm-3">
						  <input class="form_datetime form-control" name="culcreatetime"  type="text" size="16">
						</div>
					</div>
					<%edu.njxzc.tcs.bean.SpecialityClassification speClassification=(edu.njxzc.tcs.bean.SpecialityClassification)
  										request.getSession().getAttribute("speclassification"); %>
					<input class="form-control" type="hidden" name="specialityclassificationId" id="specialityclassificationId" value="<%=speClassification.getSpeciaclassid()%>"/>				
					<input class="form-control" type="hidden" name="specialityId" id="specialityId" value="<%=speciality.getSpecialityid()%>"/>
					<input class="form-control" type="hidden" name="cultivationname" id="cultivationname" value="<%=speciality.getSpecialityname()%>专业人才培养方案"/>
					<div class="form-group">
						<label class="col-sm-4 control-label">部&nbsp;&nbsp;&nbsp;门：</label>
						<div class="col-sm-3">
						  <select class="form-control" name="departmentId" ></select>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">部门负责人：</label>
						<div class="col-sm-3">
						  <input class="form-control"  name="departmenthead" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">专业负责人：</label>
						<div class="col-sm-3">
						  <input class="form-control"  name="specialityprincipal"  />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">审核人：</label>
						<div class="col-sm-3">
						  <input class="form-control"  name="reviewer" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">校&nbsp;&nbsp;&nbsp;长：</label>
						<div class="col-sm-3">
						  <input class="form-control"  name="president"  />
						</div>
					</div>	
					<%java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");%>
					<input class="form-control" type="hidden" name="gmtCreate"  value="<%=df.format(new java.util.Date())%>"/>
					<input class="form-control" type="hidden" name="gmtModified"  value="<%=df.format(new java.util.Date())%>"/>	
					<input class="form-control" type="hidden" name="createdUserSn"  value="<%=user.getSn()%>"/>
					<input class="form-control" type="hidden" name="modifiedUserSn"  value="<%=user.getSn()%>"/>																			
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-primary"
						onclick="addSchemeOP()">提交</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>

<!--修改培养方案模态框 -->
		<div class="modal fade" id="updateScheme" tabindex="-1" role="dialog"
	 		aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>
					<h4 class="modal-title" id="myModalLabel">修改培养方案</h4>
					</div>
				<div class="modal-body">

				<form id="upateSchemeForm" role="form" class="form-horizontal" action="" method="post">
					<input class="form-control" type="hidden" name="cultivationid"  /> <!-- 培养方案id -->
					<div class="form-group">
					    <label  for="" class="col-sm-4 control-label">培养方案制定日期：</label>
					    <div class="col-sm-3">
						  <input class="form_datetime form-control" name="culcreatetime"  type="text" size="16">
						</div>
					</div>
					<input class="form-control" type="hidden" name="specialityclassificationId" id="specialityclassificationId" value="<%=speClassification.getSpeciaclassid()%>"/>				
					<input class="form-control" type="hidden" name="specialityId" id="specialityId" value="<%=speciality.getSpecialityid()%>"/>
					<input class="form-control" type="hidden" name="cultivationname" id="cultivationname" value="<%=speciality.getSpecialityname()%>专业人才培养方案"/>
					<div class="form-group">
						<label class="col-sm-4 control-label">部&nbsp;&nbsp;&nbsp;门：</label>
						<div class="col-sm-3">
						  <select class="form-control" name="departmentId" ></select>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">部门负责人：</label>
						<div class="col-sm-3">
						  <input class="form-control"  name="departmenthead"  />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">专业负责人：</label>
						<div class="col-sm-3">
						  <input class="form-control"  name="specialityprincipal" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">审核人：</label>
						<div class="col-sm-3">
						  <input class="form-control"  name="reviewer"  />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">校&nbsp;&nbsp;&nbsp;长：</label>
						<div class="col-sm-3">
						  <input class="form-control"  name="president" />
						</div>
					</div>	
					<input class="form-control" type="hidden" name="gmtCreate"  value="<%=df.format(new java.util.Date())%>"/>
					<input class="form-control" type="hidden" name="gmtModified"  value="<%=df.format(new java.util.Date())%>"/>	
					<input class="form-control" type="hidden" name="createdUserSn"  value="<%=user.getSn()%>"/>
					<input class="form-control" type="hidden" name="modifiedUserSn"  value="<%=user.getSn()%>"/>	
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-primary"
						onclick="updateSchemeOP()">提交</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>
<!-- /.modal -->

		
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