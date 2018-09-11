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
		<link rel="stylesheet" href="${pageContext.request.contextPath}/require/require.css" />
		<script src="${pageContext.request.contextPath}/assets/js/fuelux/fuelux.spinner.min.js"></script>
		<script src="${pageContext.request.contextPath}/courseinfo/list_course.js"></script>
		<script src="${pageContext.request.contextPath}/courseinfo/list_genenalcourse.js"></script>		
		<script src="${pageContext.request.contextPath}/courseinfo/list_course&require.js"></script>
 <!-- 控制宽度的自动适应 -->  
<style type="text/css">  
	.comments {  
 		width:100%;/*自动适应父布局宽度*/  
 		overflow:auto;  
		 word-break:break-all;  
	} 
	.form-horizontal .control-label {
    	text-align: left;
    	margin-right: 0px;
    	padding: 0px;
	} 
	.table{
	    table-layout: fixed;/*表格宽度固定*/
	    text-align: center;
	}
</style> 
<script type="text/javascript">
	$(function() {
			//设置当前选中菜单样式
			$("#coursesidebar").siblings('li').removeClass('active');    
        	$("#coursesidebar").addClass('active open'); 
        	$("#coursebasicsidebar").addClass('active'); 
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
							<li class="active">课程体系结构</li>
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
								课程体系结构
								<small>
									<i class="icon-double-angle-right"></i>
									 课程基本信息
								</small>
							</h1>
						</div><!-- /.page-header -->

						<div id="page-body" class="row">
							<div class="col-sm-10">
								<!-- PAGE CONTENT BEGINS -->
							<div class="form-group">
								<label class="col-sm-2 control-label">方案制定年份：</label>
								<div class="col-sm-2">
								<select class="form-control" name="culcreatetime" id="culcreatetime">	
								</select>
								</div>
							</div>
							<br>
							 <input class="form-control" type="hidden"  name="cultivationschemeId" id="cultivationschemeId"/>
							<br>	
							<br/>
							<div class="form-group">
								<label class="col-sm-2 control-label">课程信息：</label>
								<div class="col-sm-3">
									<select class="form-control" id="courseclassificationId"></select>
								</div>
								<div class="col-sm-2 col-md-offset-3">
								<button type="button" class="btn btn-xs" id="addItemBtn" data-toggle="modal" 
								 	onclick="toAddCourse()">添加</button>
								</div>
							<br/>
							</div>
							<br>
							
			<!--  课程信息列表 -->
					<div class="row">
						<div class="col-md-30 text-left">
							<table class="table table-hover table-bordered">
								<thead>
									<tr>
										<th class="text-center" width="80">课程编码</th>
										<th class="text-center" width="130">课程名称</th>
										<th class="text-center" width="240">课程英文名称 </th>
										<th class="text-center" width="90">课程类别</th>
										<th class="text-center" width="20">专业核心课</th>
										<th class="text-center"width="20">双语课</th>
										<th class="text-center"width="20">英文授课</th>
										<th class="text-center"width="20">行业课</th>
										<th class="text-center"width="20">国际课</th>
										<th class="text-center"width="50">课程类型</th>
										<th class="text-center" width="30">课程学分 </th>
										<th class="text-center" width="30">理论课学分</th>
										<th class="text-center" width="30">实践课学分 </th>
										<th class="text-center"width="30">开课学期</th>	
										<th class="text-center"width="60">备注</th>	
										<th class="text-center"  width="50">关联毕业要求项</th>
										<th class="text-center"  width="100">操作</th>									
									</tr>
								</thead>
								<tbody id="tableBody">
								</tbody>
							</table>
					<!-- 底部分页按钮 -->
							<nav style="text-align: center">
								<ul class="pagination" id="bottomTab"></ul>
							</nav>
						</div>
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

			
	<!--添加课程模态框 -->
		<div class="modal fade" id="addCourse" tabindex="-1" role="dialog"
	 		aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>
						<h4 class="modal-title" id="myModalLabel">添加课程</h4>
					</div>
				<div class="modal-body">
				<form id="addCourseForm" role="form" class="form-horizontal" action="" method="post">
					<fieldset>
					<input class="form-control" type="hidden"  name="cultivationschemeId"/>
					<div class="form-group" >
					<div class="rowGroup">
						<label class="col-sm-2 control-label">课程编号</label>
						<div class="col-sm-2">
							<input class="form-control" type="text"  name="coursecode"/>
						</div>
					</div>	
					</div>
					<div class="form-group">
					<div class="rowGroup">
						<label class="col-sm-2 control-label">课程名称</label>
						<div class="col-sm-4">
							<input class="form-control" type="text"  name="coursename"/>
						</div>
					</div>
					</div>
					<div class="form-group">
					<div class="rowGroup">
						<label class="col-sm-2 control-label">英文名称</label>
						<div class="col-sm-4">
							<input class="form-control" type="text"  name="courseenglishname"/>
						</div>
					</div>
					</div>
					<div class="form-group">
					<div class="rowGroup">
						<label class="col-sm-2 control-label">课程类别</label>
						<div class="col-sm-3">
						  <select class="form-control" name="courseclassificationId" ></select>
						</div>
					</div>
					<div class="rowGroup">
						<label for="courseTypeId" class="col-sm-2 control-label col-md-offset-1">子课程类别</label>
						<div class="col-sm-3">
						  <select class="form-control" name="childcourseclassificationId">
						  </select>
						</div>
					</div>
					</div>
					<div class="form-group sr-only">					
						<label class="col-sm-3 control-label">工程课程类别</label>
						<div class="col-sm-3">
						  <select class="form-control" name="engineercourseclassificationId"  disabled="disabled"></select>
						</div>
					</div>
					<div class="form-group sr-only">
						<label class="col-sm-3 control-label">师范课程类别</label>
						<div class="col-sm-3">
						  <select class="form-control" name="teachingcourseclassificationId"  disabled="disabled"></select>
						</div>
					</div>
					<div class="form-group">
					<div class="rowGroup">
						<label class="col-sm-3 control-label">是否核心课</label>
						<label class="col-sm-1 control-label">
						    <input  type="radio" name="ismajor" id="ismajor" value="1" />是
						</label>
						<label class="col-sm-1 control-label">
							<input  type="radio" name="ismajor" id="ismajor" value="0" />否
						</label>
					</div>
					<div class="rowGroup">
						<label class="col-sm-3 control-label col-md-offset-1">是否双语课</label>
						<label class="col-sm-1 control-label">
						    <input  type="radio" name="isbilingual" id="isbilingual" value="1" />是
						</label>
						<label class="col-sm-1 control-label">
							<input  type="radio" name="isbilingual" id="isbilingual" value="0" checked="checked"/>否
						</label>
					</div>						
					</div>
					<div class="form-group">
					<div class="rowGroup">
						<label class="col-sm-3 control-label">是否英文授课</label>
						<label class="col-sm-1 control-label">
						    <input  type="radio" name="isenglish" id="isenglish" value="1" />是
						</label>
						<label class="col-sm-1 control-label">
							<input  type="radio" name="isenglish" id="isenglish" value="0" checked="checked"/>否
						</label>
					</div>
					<div class="rowGroup">
						<label class="col-sm-3 control-label col-md-offset-1">是否行业课</label>
						<label class="col-sm-1 control-label">
						    <input  type="radio" name="isindustry" id="isindustry" value="1" />是
						</label>
						<label class="col-sm-1 control-label">
							<input  type="radio" name="isindustry" id="isindustry" value="0" checked="checked"/>否
						</label>
					</div>						
					</div>		
					<div class="form-group">
						<div class="rowGroup">
						<label class="col-sm-3 control-label">是否国际课</label>
						<label class="col-sm-1 control-label">
						    <input  type="radio" name="isinternational" id="isinternational" value="1" />是
						</label>
						<label class="col-sm-1 control-label">
							<input  type="radio" name="isinternational" id="isinternational" value="0" checked="checked"/>否
						</label>
						</div>	
						<div class="rowGroup">
						<label for="courseTypeId" class="col-sm-2 control-label col-md-offset-1">课程类型</label>
						<div class="col-sm-3">
						  <select class="form-control" name="coursetype">
							<option value="">——请选择——</option>
							<option value="0">必修</option>
							<option value="1">选修</option>
						  </select>
						</div>
					</div>					
					</div>													
					<div class="form-group">
					<div class="rowGroup">
						<label class="col-sm-2 control-label">课程总学分</label>
						<div class="col-sm-2">
							<input class="form-control" type="text"  name="totalcredit" value="0"  readonly="readonly"/>
						</div>
					</div>
					<div class="rowGroup">
						<label class="col-sm-2 control-label col-md-offset-1">理论课学分</label>
						<div class="col-sm-2">
							<input class="form-control" type="text"  name="theorycredit"  value="0"/>
						</div>
					</div>
					</div>
					<div class="form-group">

					</div>
					<div class="form-group">
					<div class="rowGroup">
						<label class="col-sm-2 control-label">实践课学分</label>
						<div class="col-sm-2">
							<input class="form-control" type="text"  name="practicalcredit"  value="0"/>
						</div>
					</div>
					<div class="rowGroup">					
						<label class="col-sm-2 control-label  col-md-offset-1">开课学期</label>
						<div class="col-sm-2">
							<input class="form-control" type="text"  name="term"/>
						</div>	
					</div>						
					</div>	
					<div class="form-group">
					<div class="rowGroup">		
						<label class="col-sm-2 control-label">备注</label>
						<div class="col-sm-6">
							<input class="form-control" type="text"  name="remark"/>
						</div>	
					</div>	
					</div>				
					<%java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");%>
					<input class="form-control" type="hidden" name="gmtCreate"  value="<%=df.format(new java.util.Date())%>"/>
					<input class="form-control" type="hidden" name="gmtModified"  value="<%=df.format(new java.util.Date())%>"/>	
					<input class="form-control" type="hidden" name="createdUserSn"  value="<%=user.getSn()%>"/>
					<input class="form-control" type="hidden" name="modifiedUserSn"  value="<%=user.getSn()%>"/>																			
				</fieldset>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-primary"
						onclick="addCourseOP()">提交</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>


<!--添加已有通识课或跨专业选修课选择模态框 -->
		<div class="modal fade" id="addGeneralCourse" tabindex="-1" role="dialog"
	 		aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog" style="width:1000px">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>
						<h4 class="modal-title" id="myModalLabel">选择通识课程或跨专业选修课</h4>
					</div>
					<div class="modal-body">
		<!--  通识课程信息列表 -->
					<div class="row">
						<div class="col-md-26 text-left">
							<table class="table table-hover table-bordered">
								<thead>
									<tr>
										<th class="text-center">选择</th>	
										<th class="text-center" width="100">课程编码</th>
										<th class="text-center" width="170">课程名称</th>
										<th class="text-center" width="350">课程英文名称 </th>
										<th class="text-center">课程类型</th>
										<th class="text-center">课程学分 </th>
										<th class="text-center">理论课学分</th>
										<th class="text-center">实践课学分 </th>
										<th class="text-center">开课学期</th>	
										<th class="text-center"width="60">备注</th>	
									</tr>
								</thead>
								<tbody id="generalcoursetableBody">
								</tbody>
							</table>
					<input class="form-control" type="hidden"  id="gencourseitems"/>
					<!-- 底部分页按钮 -->
							<nav style="text-align: center">
								<ul class="pagination" id="bottomTab"></ul>
							</nav>
						</div>
					</div>				
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
						<button type="button" class="btn btn-primary"
						onclick="addGeneralCourseOP()">提交</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>

			
<!--修改课程模态框 -->
		<div class="modal fade" id="updateCourse" tabindex="-1" role="dialog"
	 		aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>
					<h4 class="modal-title" id="myModalLabel">修改课程</h4>
				</div>
				<div class="modal-body">

				<form id="updateCourseForm" role="form" class="form-horizontal" action="" method="post">
					<input class="form-control" type="hidden"  name="cultivationschemeId"/>
					<input class="form-control" type="hidden" name="coursid"/>
					<div class="form-group" >
					<div class="rowGroup">
						<label class="col-sm-2 control-label">课程编号</label>
						<div class="col-sm-2">
							<input class="form-control" type="text"  name="coursecode"/>
						</div>
					</div>	
					</div>
					<div class="form-group">
					<div class="rowGroup">
					<div class="rowGroup">
						<label class="col-sm-2 control-label">课程名称</label>
						<div class="col-sm-4">
							<input class="form-control" type="text"  name="coursename"/>
						</div>
					</div>
					</div>
					</div>
					<div class="form-group">
					<div class="rowGroup">
						<label class="col-sm-2 control-label">英文名称</label>
						<div class="col-sm-4">
							<input class="form-control" type="text"  name="courseenglishname"/>
						</div>
					</div>
					</div>
					<div class="form-group">
					<div class="rowGroup">
						<label class="col-sm-2 control-label">课程类别</label>
						<div class="col-sm-3">
						  <select class="form-control" name="courseclassificationId" ></select>
						</div>
					</div>
					<div class="rowGroup">
						<label for="courseTypeId" class="col-sm-2 control-label col-md-offset-1">子课程类别</label>
						<div class="col-sm-3">
						  <select class="form-control" name="childcourseclassificationId">
						  </select>
						</div>
					</div>
					</div>
					<div class="form-group sr-only">					
						<label class="col-sm-3 control-label">工程课程类别</label>
						<div class="col-sm-3">
						  <select class="form-control" name="engineercourseclassificationId"  disabled="disabled"></select>
						</div>
					</div>
					<div class="form-group sr-only">
						<label class="col-sm-3 control-label">师范课程类别</label>
						<div class="col-sm-3">
						  <select class="form-control" name="teachingcourseclassificationId"  disabled="disabled"></select>
						</div>
					</div>
					<div class="form-group">
					<div class="rowGroup">
						<label class="col-sm-3 control-label">是否核心课</label>
						<label class="col-sm-1 control-label">
						    <input  type="radio" name="ismajor" id="ismajor" value="1" />是
						</label>
						<label class="col-sm-1 control-label">
							<input  type="radio" name="ismajor" id="ismajor" value="0" />否
						</label>
					</div>
					<div class="rowGroup">
						<label class="col-sm-3 control-label col-md-offset-1">是否双语课</label>
						<label class="col-sm-1 control-label">
						    <input  type="radio" name="isbilingual" id="isbilingual" value="1" />是
						</label>
						<label class="col-sm-1 control-label">
							<input  type="radio" name="isbilingual" id="isbilingual" value="0" checked="checked"/>否
						</label>
					</div>						
					</div>
					<div class="form-group">
					<div class="rowGroup">
						<label class="col-sm-3 control-label">是否英文授课</label>
						<label class="col-sm-1 control-label">
						    <input  type="radio" name="isenglish" id="isenglish" value="1" />是
						</label>
						<label class="col-sm-1 control-label">
							<input  type="radio" name="isenglish" id="isenglish" value="0" checked="checked"/>否
						</label>
					</div>
					<div class="rowGroup">
						<label class="col-sm-3 control-label col-md-offset-1">是否行业课</label>
						<label class="col-sm-1 control-label">
						    <input  type="radio" name="isindustry" id="isindustry" value="1" />是
						</label>
						<label class="col-sm-1 control-label">
							<input  type="radio" name="isindustry" id="isindustry" value="0" checked="checked"/>否
						</label>
					</div>						
					</div>		
					<div class="form-group">
						<div class="rowGroup">					
						<label class="col-sm-3 control-label">是否国际课</label>
						<label class="col-sm-1 control-label">
						    <input  type="radio" name="isinternational" id="isinternational" value="1" />是
						</label>
						<label class="col-sm-1 control-label">
							<input  type="radio" name="isinternational" id="isinternational" value="0" checked="checked"/>否
						</label>
						</div>		
						<div class="rowGroup">
						<label for="courseTypeId" class="col-sm-2 control-label col-md-offset-1">课程类型</label>
						<div class="col-sm-3">
						  <select class="form-control" name="coursetype">
							<option value="">——请选择——</option>
							<option value="0">必修</option>
							<option value="1">选修</option>
						  </select>
						</div>
						</div>								
					</div>													
					<div class="form-group">
					<div class="rowGroup">
						<label class="col-sm-2 control-label">课程总学分</label>
						<div class="col-sm-2">
							<input class="form-control" type="text"  name="totalcredit" readonly="readonly"/>
						</div>
					</div>
					<div class="rowGroup">
						<label class="col-sm-2 control-label col-md-offset-1">理论课学分</label>
						<div class="col-sm-2">
							<input class="form-control" type="text"  name="theorycredit"/>
						</div>
					</div>
					</div>
					<div class="form-group">
					</div>
					<div class="form-group">
					<div class="rowGroup">
						<label class="col-sm-2 control-label">实践课学分</label>
						<div class="col-sm-2">
							<input class="form-control" type="text"  name="practicalcredit"/>
						</div>
					</div>
					<div class="rowGroup">					
						<label class="col-sm-2 control-label  col-md-offset-1">开课学期</label>
						<div class="col-sm-2">
							<input class="form-control" type="text"  name="term"/>
						</div>	
					</div>						
					</div>	
					<div class="form-group">
					<div class="rowGroup">		
						<label class="col-sm-2 control-label">备注</label>
						<div class="col-sm-6">
							<input class="form-control" type="text"  name="remark"/>
						</div>	
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
						onclick="updateCourseOP()">提交</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>

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
		}); 
		
		$(function () {
			$('#spinner3').ace_spinner({value:1,min:1,max:20,step:1, on_sides: true,
				icon_up:'icon-plus smaller-75', icon_down:'icon-minus smaller-75', 
				btn_up_class:'btn-success' , btn_down_class:'btn-danger'
			});
		});
			

	</script>
</html>