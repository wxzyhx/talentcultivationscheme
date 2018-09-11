<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <% request.setAttribute("sysEnvironment",edu.njxzc.tcs.util.ConstantUtils.obj.getSysEnvironment()); %>
    <title>${sysEnvironment.SystemTitle}</title>
    <link href="<%=request.getContextPath()%>/css/font.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<script type="text/javascript">
    alert("${errorSimpleMsg}");
    try{
        parent.window.focus();
    }catch(e){}
    <%--alert("${className}");--%>
    <%--alert("${ex}");--%>
</script>
<font class="fontred">${errorMsg}</font>
</body>
</html>