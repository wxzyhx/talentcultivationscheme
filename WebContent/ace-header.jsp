<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix='fmt' %> 
 <%@ page isELIgnored ="false" %>
<head>
<!--导入bootstrap样式-->
<!--  <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">-->
	<meta name="viewpoint" content="width=device-width initial-scale=1.0">
		<link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/font-awesome.min.css" />
		
<!-- ace styles -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/ace.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/ace-rtl.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/ace-skins.min.css" />
		
<!--导入bootstrap插件
 <!-- <script src="js/jquery-3.2.1.min.js"></script> 
<script scr="js/bootstrap.min.js"></script>-->
<!-- ace settings handler -->
		<script src="${pageContext.request.contextPath}/assets/js/ace-extra.min.js"></script>
		
		
		<script type="text/javascript">
			window.jQuery || document.write("<script src='${pageContext.request.contextPath}/assets/js/jquery-2.0.3.min.js'>"+"<"+"script>");
		</script>

		<!-- <![endif]-->

	<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='${pageContext.request.contextPath}/assets/js/jquery.mobile.custom.min.js'>"+"<"+"script>");
		</script>
		<script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/typeahead-bs2.min.js"></script>

		<!-- page specific plugin scripts -->

		<!--[if lte IE 8]>
		  <script src="assets/js/excanvas.min.js"></script>
		<![endif]-->
		<script src="${pageContext.request.contextPath}/assets/js/jquery-ui-1.10.3.custom.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/jquery.ui.touch-punch.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/jquery.slimscroll.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/jquery.easy-pie-chart.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/jquery.sparkline.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/flot/jquery.flot.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/flot/jquery.flot.pie.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/flot/jquery.flot.resize.min.js"></script>

		<!-- ace scripts -->
		<script src="${pageContext.request.contextPath}/assets/js/ace-elements.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/ace.min.js"></script>

		<!-- inline scripts related to this page -->
		
		<script type="text/javascript">
		$(function() {//单击菜单更新选中状态
	    	$("#navbartop li").click(function() {  
	        	$(this).siblings('li').removeClass('active');    
	        	$(this).addClass('active');   
			});
		});
		/*$(function() {//单击菜单更新选中状态
	    	$(".submenu").click(function() {  
	        	$(this).siblings('li').removeClass('active');    
	        	$(this).addClass('active');   
			});
		});*/
	</script>	
	<script type="text/javascript">
	/*$(function() {
		$('.dropdown-toggle a.removefromcart').click(function(e) {
	    	e.stopPropagation();
		});
	});*/
		</script>
</head>