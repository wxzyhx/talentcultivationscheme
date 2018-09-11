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
		<script src="${pageContext.request.contextPath}/require/list_require.js"></script>
		<script src="${pageContext.request.contextPath}/require/list_requireItem.js"></script>
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
        	$("#requiresidebar").addClass('active'); 
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
							<li class="active">毕业要求</li>
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
								毕业要求
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
							<br/>
							<div class="form-group">
								<label class="col-sm-3 control-label">毕业要求：</label>
								<div class="col-sm-2 col-md-offset-7">
								<button type="button" class="btn btn-xs" id="addItemBtn" data-toggle="modal" 
							data-target="#addRequire" onclick="loadObjItemToCheckbox()">添加</button>
								</div>
							</div>
							
							
			<!--  毕业要求列表 -->
					<div class="row">
						<div class="col-md-16 text-left">
							<table class="table table-hover table-bordered">
								<thead>
									<tr>
										<th class="text-center">名称</th>
										<th class="text-center"  width="500">内容</th>
										<th class="text-center"  width="70">分解项 </th>
										<th class="text-center">操作</th>
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

				
 <%@include file="../ace-settings-container.jsp"%>
			</div><!-- /.main-container-inner -->		
			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="icon-double-angle-up icon-only bigger-110"></i>
			</a>
	</div><!-- /.main-container -->
	
	
	<!--添加毕业要求模态框 -->
		<div class="modal fade" id="addRequire" tabindex="-1" role="dialog"
	 		aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>
					<h4 class="modal-title" id="myModalLabel">添加毕业要求</h4>
				</div>
				<div class="modal-body">

				<form id="addRequireForm" role="form" class="form-horizontal" action="" method="post">
					<input class="form-control" type="hidden"  name="cultivationschemeId"/>
					<input class="form-control" type="hidden"  name="objectiveitems"/>
					<div class="form-group">
						<label class="col-sm-3 control-label">毕业要求名称：</label>
						<div class="col-sm-6">
							<input class="form-control" type="text"  name="requirementname"/>
						</div>
					</div>
					<div class="form-group col-md-offset-1" style="color:#FF0000;">名称格式如：“毕业要求1”或“毕业要求1：工程知识”</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">毕业要求内容：</label>
						<textarea class="form-control"  name="requirementdesc" 
						rows=14  cols=27  type="comments" ></textarea>
					</div>
					<div class="form-group">
						<label class="col-sm-5 control-label">毕业要求关联培养目标分解项：</label>
						<div class="col-sm-12" name="ckb_objectives"></div>
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
						onclick="addReqOP()">提交</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>

			
<!--修改毕业要求模态框 -->
		<div class="modal fade" id="updateRequire" tabindex="-1" role="dialog"
	 		aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>
					<h4 class="modal-title" id="myModalLabel">修改毕业要求</h4>
				</div>
				<div class="modal-body">

				<form id="updateRequireForm" role="form" class="form-horizontal" action="" method="post">
					<input class="form-control" type="hidden"  name="cultivationschemeId"/>
					<input class="form-control" type="hidden"  name="requirementid"/>
					<input class="form-control" type="hidden"  name="objectiveitems"/>
					<div class="form-group">
						<label class="col-sm-3 control-label">毕业要求名称：</label>
						<div class="col-sm-6">
							<input class="form-control" type="text"  name="requirementname"/>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label">毕业要求内容：</label>
						<textarea class="form-control"  name="requirementdesc" 
						rows=14  cols=27  type="comments" ></textarea>
					</div>
					<div class="form-group">
						<label class="col-sm-6 control-label">毕业要求关联培养目标分解项：</label>
						<div class="col-sm-12" name="ckb_objectives"></div>
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
						onclick="updateReqOP()">提交</button>
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