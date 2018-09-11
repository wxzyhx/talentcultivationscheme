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

		<link rel="stylesheet" href="${pageContext.request.contextPath}/objective/objective.css" />
		<script src="${pageContext.request.contextPath}/assets/js/fuelux/fuelux.spinner.min.js"></script>
		<script src="${pageContext.request.contextPath}/objective/list_objective.js"></script>
		<script src="${pageContext.request.contextPath}/objective/list_objectiveItem.js"></script>
 <!-- 控制宽度的自动适应 -->  
<style type="text/css">  
	.comments {  
 		width:100%;/*自动适应父布局宽度*/  
 		overflow:auto;  
		 word-break:break-all;  
	}  
		
	.table{
	    table-layout: fixed;/*表格宽度固定*/
	}
</style> 
<script type="text/javascript">
	$(function() {
			//设置当前选中菜单样式
			$("#objrequiresidebar").siblings('li').removeClass('active');    
        	$("#objrequiresidebar").addClass('active open'); 
        	$("#objsidebar").addClass('active'); 
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
								<a href="#">一、目标与要求</a>
							</li>
							<li class="active">培养目标</li>
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
								培养目标
								<small>
									<i class="icon-double-angle-right"></i>
									 基本信息
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
							<div class="form-group">
								<label class="col-sm-2 control-label">培养目标：</label>
								<label class="col-sm-8 control-label" id="objectivecontent"></label>
							</div>
							<br/>
							<br/>
							<div  class="col-sm-10 col-md-offset-4">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<button type="button" class="btn-sx btn-primary"  id="createBtn" data-toggle="modal" 
							data-target="#addObj"  disabled="disabled">添加</button>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<button type="button" class="btn-sx btn-primary" id="modifyBtn" data-toggle="modal" 
							data-target="#updateObj"onclick="updateObj()" disabled="disabled">修改</button>
							</div>
							<br/>
							<div class="form-group">
								<label class="col-sm-3 control-label">目标分解项：</label>
								<div class="col-sm-2 col-md-offset-7">
								<button type="button" class="btn btn-xs" id="addItemBtn" data-toggle="modal" 
							data-target="#addObjItem" disabled="disabled">添加</button>
								</div>
							</div>
							
							
			<!--  目标分解项 -->
					<div class="row">
						<div class="col-md-12 text-left">
							<table class="table table-hover table-bordered">
								<thead>
									<tr>
										<th class="text-center" width="6%">序号</th>
										<th class="text-center" width="74%">分解项内容</th>
										<th class="text-center" width="20%">操作</th>
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
			
	<!--添加目标模态框 -->
		<div class="modal fade" id="addObj" tabindex="-1" role="dialog"
	 		aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>
					<h4 class="modal-title" id="myModalLabel">添加培养目标</h4>
					</div>
				<div class="modal-body">

				<form id="addObjForm" role="form" class="form-horizontal" action="" method="post">
					<input class="form-control" type="hidden"  name="cultivationschemeId"/>
					<div class="form-group">
						<label class="col-sm-3 control-label">培养目标：</label>
						<textarea class="form-control"  name="objectivecontent" 
						rows=14  cols=27  type="comments" ></textarea>
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
						onclick="addObjOP()">提交</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>

<!--修改培养目标模态框 -->
		<div class="modal fade" id="updateObj" tabindex="-1" role="dialog"
	 		aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>
					<h4 class="modal-title" id="myModalLabel">修改培养目标</h4>
					</div>
				<div class="modal-body">

				<form id="updateObjForm" role="form" class="form-horizontal" action="" method="post">
					<input class="form-control" type="hidden"  name="objectiveid"/>
					<input class="form-control" type="hidden"  name="cultivationschemeId"/>
					<div class="form-group">
						<label class="col-sm-3 control-label">培养目标：</label>
						<textarea class="form-control"  name="objectivecontent" 
							rows=14  cols=27  type="comments" ></textarea>
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
						onclick="updateObjOP()">提交</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>
<!-- /.modal -->

<!-- 添加培养目标分解项 -->
<div class="modal fade" id="addObjItem" tabindex="-1" role="dialog"
	 		aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>
					<h4 class="modal-title" id="myModalLabel">添加培养目标分解项</h4>
					</div>
				<div class="modal-body">

				<form id="addObjItemForm" role="form" class="form-horizontal" action="" method="post">
					<input class="form-control" type="hidden"  name="objectiveId"/>
					<div class="form-group">
						<label class="control-label col-sm-3">目标项序号：</label>
						<input type="text" class="input-mini" id="spinner3" name="objectiveitemname" />
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">内&nbsp;&nbsp;&nbsp;容：</label>
						<textarea class="form-control"  name="objectiveitemdesc" 
						rows=14  cols=27  type="comments" ></textarea>
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
						onclick="addObjItemOP()">提交</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>

<!-- 修改培养目标分解项 -->
<div class="modal fade" id="updateObjItem" tabindex="-1" role="dialog"
	 		aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>
					<h4 class="modal-title" id="myModalLabel">修改培养目标分解项</h4>
					</div>
				<div class="modal-body">

				<form id="updateObjItemForm" role="form" class="form-horizontal" action="" method="post">
					<input class="form-control" type="hidden"  name="objectiveitemid"/>
					<input class="form-control" type="hidden"  name="objectiveId"/>
					<div class="form-group">
						<label class="control-label col-sm-3">目标项序号：</label>
						<input type="text" class="input-mini" id="spinner3" name="objectiveitemname" />
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">内&nbsp;&nbsp;&nbsp;容：</label>
						<textarea class="form-control"  name="objectiveitemdesc" 
						rows=14  cols=27  type="comments" ></textarea>
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
						onclick="updateObjItemOP()">提交</button>
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
		}); 
		
		$(function () {
			$('#spinner3').ace_spinner({value:1,min:1,max:20,step:1, on_sides: true,
				icon_up:'icon-plus smaller-75', icon_down:'icon-minus smaller-75', 
				btn_up_class:'btn-success' , btn_down_class:'btn-danger'
			});
		});
			

	</script>
</html>