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
<script type="text/javascript" src="<%=basePath %>js/jquery-3.2.0.min.js"></script>
<link rel="stylesheet" href="<%=basePath %>css/layui/layui.css">
</head>
<body>
<form name="fileupload" action="common/showfileUpLoad" method="post">
	<input type="submit" value="文件上传"/>
</form>
<div></div>
<form name="login" action="user/login" method="post">
	<table border="2">
		<tr>
			<td>用户名</td>
			<td><input type="text" name="uName"/></td>
		</tr>
		<tr>
			<td>密码</td>
			<td><input type="password" name="uPassword"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="登录"/></td>
		</tr>
	</table>
</form>
<form name="register" action="user/register" method="post">
	<table border="2">
		<tr>
			<td>用户名</td>
			<td><input type="text" name="uName"/></td>
		</tr>
		<tr>
			<td>密码</td>
			<td><input type="password" name="uPassword"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="注册"/></td>
		</tr>
	</table>
</form>
<a href="<%=basePath %>testLayui/page/main.html">跳转</a>
<div style="display: none;">
	<label id="lab1"></label>
</div>
<script src="js/layui/layui.js"></script>
<script type="text/javascript">
	
</script>

</body>
</html>