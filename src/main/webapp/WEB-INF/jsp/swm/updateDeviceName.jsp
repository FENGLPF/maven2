<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
 String path = request.getContextPath();
 String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
   + path + "/";
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<%=basePath %>js/jquery-3.2.0.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/core.js"></script>
<title>修改设备名称</title>
</head>
<body>
<form action="<%=basePath%>Device/updateDeviceName" method="post">
	<table border="2">
		<tr>
			<td>设备名称</td>
			<td><input type="text" name="dName"/></td>
		</tr>
		<tr>
			<td>SN号</td>
			<td><input type="text" name="dSn"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="修改"/></td>
		</tr>
	</table>
</form>
</body>
</html>