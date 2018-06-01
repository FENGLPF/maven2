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
<script type="text/javascript" src="<%=basePath %>js/jquery-3.2.0.min.js"></script>
<script type="text/javascript" src="<%=basePath %>js/mylayui/layui.js"></script>
<script type="text/javascript" src="<%=basePath %>js/mylayui/mylogin.js"></script>
<link rel="stylesheet" href="<%=basePath %>css/layui/layui.css">
<title>登录</title>
</head>
<body>
<form name="login" action="<%=basePath %>user/mylogin" method="post">
	<table border="2">
		<tr>
			<td>用户名</td>
			<td><input type="text" name="uName" id="uName1"/></td>
		</tr>
		<tr>
			<td>密码</td>
			<td><input type="password" name="uPassword" id="uPassword1"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="登录"/></td>
		</tr>
	</table>
</form>

<script type="text/javascript">
	var msg="${msg}";
	if(msg!=""||msg!=undefine){
		alert(msg);
	}
</script>
</body>
</html>