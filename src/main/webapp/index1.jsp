<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
 String path = request.getContextPath();
 String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
   + path + "/";
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/layui/layui.css"/>
<script type="text/javascript" src="<%=basePath%>js/layui/layui.js"></script>
<title>主页</title>
</head>
<body>
	<div class="layui-side layui-bg-black" id="admin-side">
		<div class="layui-side-scroll" id="admin-navbar-side">

		</div>
	</div>
	
	<script type="text/javascript" src="<%=basePath%>js/datas/nav.js"></script>  <!--显示左侧模块-->
	<script src="<%=basePath%>js/index.js"></script>
</body>
</html>