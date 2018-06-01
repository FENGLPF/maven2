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
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.2.0.min.js"></script>
<link rel="stylesheet" href="css/layui/layui.css">
</head>
<body>
<div class="layui-side layui-bg-black" id="admin-side">
	<div class="layui-side-scroll" id="admin-navbar-side">
		
	</div>
</div>
<div style="display: none;">
	<label id="lab1"></label>
</div>
<script src="js/layui/layui.js"></script>
<script type="text/javascript" src="js/index.js"></script>
<script type="text/javascript">
	//一般直接写在一个js文件中
	layui.use(['layer', 'form'], function(){
		var $ = layui.jquery,
		var layer = layui.layer,
		form = layui.form;
		
	});
</script>

</body>
</html>