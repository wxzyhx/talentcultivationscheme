<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
		<div class="navbar navbar-default" id="navbar">
			<script type="text/javascript">
				try{ace.settings.check('navbar' , 'fixed')}catch(e){}
			</script>

			<div class="navbar-container" id="navbar-container">
				<div class="navbar-header pull-left">
					<a href="#" class="navbar-brand">
						<small>
							<i class="icon-leaf"></i>
							培养方案后台管理系统
						</small>
					</a><!-- /.brand -->
				</div><!-- /.navbar-header -->
			
				<div class="navbar-header pull-right" role="navigation">
					<ul class="nav ace-nav">
	
						<li class="light-blue">
							<a data-toggle="dropdown" href="#" class="dropdown-toggle">
								<img class="nav-user-photo" src="${pageContext.request.contextPath}/assets/avatars/user.jpg" alt="Jason's Photo" />
								<span class="user-info">
									<small>欢迎光临,</small>
									<%edu.njxzc.tcs.bean.User user=(edu.njxzc.tcs.bean.User)
  										request.getSession().getAttribute("user"); %>
									<%=user.getName() %>
								</span>

								<i class="icon-caret-down"></i>
							</a>

							<ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
								<li>
									<a href="#">
										<i class="icon-cog"></i>
										设置
									</a>
								</li>

								<li>
									<a href="${pageContext.request.contextPath}/user/userinfo.jsp">
										<i class="icon-user"></i>
										个人资料
									</a>
								</li>

								<li class="divider"></li>

								<li>
									<a href="${pageContext.request.contextPath}/logout.do">
										<i class="icon-off"></i>
										退出
									</a>
								</li>
							</ul>
						</li>
					</ul><!-- /.ace-nav -->
				</div><!-- /.navbar-header -->
				<p></p>
				<div id="navbartop" class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li id="index" class="active"><a href="${pageContext.request.contextPath}/index.jsp">培养方案</a></li>
						<li id="report"><a href="${pageContext.request.contextPath}/report/coursereport.jsp">报表输出</a></li>
						<li ><a href="#">政策文件</a></li>
						<li><a href="#">帮助</a></li>
					</ul>
				</div>
			</div><!-- /.container -->
		</div>
		
		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

			<div class="main-container-inner">
				<a class="menu-toggler" id="menu-toggler" href="#">
					<span class="menu-text"></span>
				</a>

				<div class="sidebar" id="sidebar">
					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
					</script>

					<div class="sidebar-shortcuts" id="sidebar-shortcuts">
						<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
							<button class="btn btn-success">
								<i class="icon-signal"></i>
							</button>

							<button class="btn btn-info">
								<i class="icon-pencil"></i>
							</button>

							<button class="btn btn-warning">
								<i class="icon-group"></i>
							</button>

							<button class="btn btn-danger">
								<i class="icon-cogs"></i>
							</button>
						</div>

						<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
							<span class="btn btn-success"></span>

							<span class="btn btn-info"></span>

							<span class="btn btn-warning"></span>

							<span class="btn btn-danger"></span>
						</div>
					</div><!-- #sidebar-shortcuts -->

					<ul class="nav nav-list">
						<li class="active">
							<a href="${pageContext.request.contextPath}/index.jsp">
								<i class="icon-dashboard"></i>
								<span class="menu-text"> 培养方案基本信息 </span>
							</a>
						</li>
						
						<li id="objrequiresidebar">
							<a href="#" class="dropdown-toggle">
								<i class="icon-desktop"></i>
								<span class="menu-text">一、目标与要求 </span>
								<b class="arrow icon-angle-down"></b>
							</a>

							<ul class="submenu">
								<li id="objsidebar">
									<a href="${pageContext.request.contextPath}/objective/list_objective.jsp">
										<i class="icon-double-angle-right"></i>
										（一）培养目标
									</a>
								</li>

								<li id="requiresidebar">
									<a href="${pageContext.request.contextPath}/require/list_require.jsp">
										<i class="icon-double-angle-right"></i>
										（二）毕业要求
									</a>
								</li>
							</ul>
						</li>

						<li id="schooldegreesidebar">
							<a href="#" class="dropdown-toggle">
								<i class="icon-list"></i>
								<span class="menu-text"> 二、学制与学位 </span>

								<b class="arrow icon-angle-down"></b>
							</a>

							<ul class="submenu">
								<li id="degreesidebar">
									<a href="${pageContext.request.contextPath}/schoolsystemdegree/schoolsystemdegree.jsp">
										<i class="icon-double-angle-right"></i>
										学制 &amp; 学位
									</a>
								</li>
							</ul>
						</li>

						<li id="conditionsidebar">
							<a href="#" class="dropdown-toggle">
								<i class="icon-edit"></i>
								<span class="menu-text">三、毕业条件 </span>

								<b class="arrow icon-angle-down"></b>
							</a>

							<ul class="submenu">
								<li id="creditsidebar">
									<a href="${pageContext.request.contextPath}/totalcredit/totalcredit.jsp">
										<i class="icon-double-angle-right"></i>
										学分
									</a>
								</li>
							</ul>
						</li>
						
						<li id="coursesidebar">
							<a href="#" class="dropdown-toggle">
								<i class="icon-edit"></i>
								<span class="menu-text">四、课程体系结构</span>

								<b class="arrow icon-angle-down"></b>
							</a>

							<ul class="submenu">
								<li id="coursebasicsidebar">
									<a href="${pageContext.request.contextPath}/courseinfo/list_course.jsp">
										<i class="icon-double-angle-right"></i>
										课程基本信息
									</a>
								</li>
								<li id="course&requiresidebar">
									<a href="#">
										<i class="icon-double-angle-right"></i>
										课程关联毕业要求分解项
									</a>
								</li>
							</ul>
						</li>
					</ul><!-- /.nav-list -->

					<div class="sidebar-collapse" id="sidebar-collapse">
						<i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
					</div>

					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
					</script>
				</div>
				
				