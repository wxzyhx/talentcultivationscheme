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
<script src="${pageContext.request.contextPath}/totalcredit/totalcredit.js"></script>
<script type="text/javascript">
	$(function() {
			//设置当前选中菜单样式
			$("#conditionsidebar").siblings('li').removeClass('active');    
        	$("#conditionsidebar").addClass('active open'); 
        	$("#creditsidebar").addClass('active'); 
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
							<li class="active">毕业条件</li>
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
								毕业条件
								<small>
									<i class="icon-double-angle-right"></i>
									 学分
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
								<div class="form-group">
								<label class="col-sm-8 control-label" style="color:#FF0000;font-weight:bold;">
								说明：本页面所有学分信息由培养方案的课程自动汇总</label>
							</div>
							</div>
							<input class="form-control" type="hidden"  id="cultivationschemeId"/>
							<br>
							<br>
							<div class="form-group">
								<label class="col-sm-3 control-label">毕业总学分：</label>
								<label class="col-sm-1 control-label" id="totalcredit"></label>
								<label class="col-sm-3 control-label" id="totalcreditrule"></label>
							</div>
							<br>
							<br>
							<div class="form-group">
								<label class="col-sm-3 control-label">通识必修课学分：</label>
								<label class="col-sm-1 control-label" id="generalcompulsory"></label>
								<label class="col-sm-3 control-label" id="generalcompulsoryrule"></label>
							</div>
							<br>
							<br>
							<div class="form-group">
								<label class="col-sm-3 control-label">通识选修课学分：</label>
								<label class="col-sm-1 control-label" id="generalelective"></label>
								<label class="col-sm-3 control-label" id="generalelectiverule"></label>
							</div>
							<br>
							<br>
							<div class="form-group">
								<label class="col-sm-3 control-label">专业必修课学分：</label>
								<label class="col-sm-1 control-label" id="professionalcompulsory"></label>
								<label class="col-sm-3 control-label" id="professionalcompulsoryrule"></label>
							</div>
							<br>
							<br>
							<div class="form-group">
								<label class="col-sm-3 control-label">专业方向课学分：</label>
								<label class="col-sm-1 control-label" id="professionaldirection"></label>
								<label class="col-sm-3 control-label" id="professionaldirectionrule"></label>
							</div>
							<br>
							<br>
							<div class="form-group">
								<label class="col-sm-3 control-label">跨专业选修课学分：</label>
								<label class="col-sm-1 control-label" id="interdisciplinaryelective"></label>
								<label class="col-sm-3 control-label" id="interdisciplinaryelectiverule"></label>
							</div>
							<br>
							<br>

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