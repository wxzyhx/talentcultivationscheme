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
<script src="${pageContext.request.contextPath}/schoolsystemdegree/schoolsystemdegree.js"></script>
<script type="text/javascript">
	$(function() {
			//设置当前选中菜单样式
			$("#schooldegreesidebar").siblings('li').removeClass('active');    
        	$("#schooldegreesidebar").addClass('active open'); 
        	$("#degreesidebar").addClass('active'); 
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
							<li class="active">学制与学位</li>
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
								学制与学位
								<small>
									<i class="icon-double-angle-right"></i>
									 基本信息
								</small>
							</h1>
						</div><!-- /.page-header -->

						<div class="row">
							<div class="col-sm-10">
								<!-- PAGE CONTENT BEGINS -->
							<div class="form-group">
								<label class="col-sm-2 control-label">方案制定年份：</label>
								<div class="col-sm-2">
									<select class="form-control" name="culcreatetime" id="culcreatetime">	
										<option value="">&nbsp;</option>
									</select>
								</div>
							</div>
							<input class="form-control" type="hidden"  id="cultivationschemeId"/>
							<br>
							<br>
							<div class="form-group">
								<label class="col-sm-2 control-label">学&nbsp;&nbsp;&nbsp;制：</label>
								<label class="col-sm-1 control-label" name="schoolsystem" 
									id="schoolsystem"></label><label class="col-sm-1 control-label">年</label>
							</div>
							<br>
							<br>
							<div class="form-group">
								<label class="col-sm-2 control-label">修业年限：</label>
								<label class="col-sm-1 control-label"  name="loweryears" 
									id="loweryears"></label><label class="col-sm-1 control-label">年</label>
								<label class="col-sm-1 control-label">~</label>
								<label class="col-sm-1 control-label"  name="upperyears" 
									id="upperyears"></label><label class="col-sm-1 control-label">年</label>
							</div>
							<br>
							<div class="form-group">
								<label class="col-sm-2 control-label">授予学位：</label>
								<label class="col-sm-2 control-label" name="degreeId" id="degreeId"></label>
							</div>
							<br>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<button type="button" class="btn-sx btn-primary" id="addbtn" data-toggle="modal" 
							data-target="#addSchoolsysDegree" onclick="getDegrees()">添加</button>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<button type="button" class="btn-sx btn-primary" id="modifybtn" data-toggle="modal" 
							data-target="#updateSchoolsysDegree"onclick="updateSchoolsysDegree()" disabled="disabled">修改</button>
								<!-- PAGE CONTENT ENDS -->
							</div><!-- /.col -->
						</div><!-- /.row -->
					</div><!-- /.page-content -->
				</div><!-- /.main-content -->

				
			</div><!-- /.main-container-inner -->

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="icon-double-angle-up icon-only bigger-110"></i>
			</a>
			

	<!--添加学制学位模态框 -->
		<div class="modal fade" id="addSchoolsysDegree" tabindex="-1" role="dialog"
	 		aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>
					<h4 class="modal-title" id="myModalLabel">添加学制学位</h4>
					</div>
				<div class="modal-body">

				<form id="addSchoolsysDegreeForm" role="form" class="form-horizontal" action="" method="post">
					<input class="form-control" type="hidden"  name="cultivationschemeId"/>
					<div class="form-group" style="margin-left:0;">
						<label class="col-sm-2 control-label">学&nbsp;&nbsp;&nbsp;制：</label>
						<div class="col-sm-2">
						  <input class="form-control" name="schoolsystem"/>
						</div>
						<label class="col-sm-1 control-label">年</label>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">修业年限：</label>
						<div class="col-sm-2">
						  <input class="form-control"  name="loweryears" />
						</div>
						<label class="col-sm-1 control-label">年</label>
						<label class="col-sm-1 control-label">~</label>
						<div class="col-sm-2">
							<input class="form-control"  name="upperyears" />
						</div>
						<label class="col-sm-1 control-label">年</label>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">授予学位：</label>
						<div class="col-sm-4">
							<select class="form-control" name="degreeId">	
									<option value="">&nbsp;</option>
							</select>
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
						onclick="addSchoolsysDegreeOP()">提交</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>

	<!--修改学制学位模态框 -->
		<div class="modal fade" id="updateSchoolsysDegree" tabindex="-1" role="dialog"
	 		aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>
					<h4 class="modal-title" id="myModalLabel">修改学制学位</h4>
					</div>
				<div class="modal-body">

				<form id="updateSchoolsysDegreeForm" role="form" class="form-horizontal" action="" method="post">
					<input class="form-control" type="hidden" name="schoolsystemdegreeid" />
					<input class="form-control" type="hidden"  name="cultivationschemeId"/>
					<div class="form-group" style="margin-left:0;">
						<label class="col-sm-2 control-label">学&nbsp;&nbsp;&nbsp;制：</label>
						<div class="col-sm-2">
						  <input class="form-control" name="schoolsystem"/>
						</div>
						<label class="col-sm-1 control-label">年</label>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">修业年限：</label>
						<div class="col-sm-2">
						  <input class="form-control"  name="loweryears" />
						</div>
						<label class="col-sm-1 control-label">年</label>
						<label class="col-sm-1 control-label">~</label>
						<div class="col-sm-2">
							<input class="form-control"  name="upperyears" />
						</div>
						<label class="col-sm-1 control-label">年</label>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">授予学位：</label>
						<div class="col-sm-4">
							<select class="form-control" name="degreeId">	
									<option value="">&nbsp;</option>
							</select>
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
						onclick="updateSchoolsysDegreeOP()">提交</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>


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