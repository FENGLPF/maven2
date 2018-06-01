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
</head>
<body>
<form name="form1" action="../user/getUser" method="post">
	<input type="text" name="id"/>
	<input type="submit" value="submit"/>
</form>
<form name="form2">
	<input type="text" id="id1"/>
	<input type="button" value="提交" onclick="upload()"/>
</form>

<div style="display: none;">
	<label id="lab1"></label>
</div>

<script type="text/javascript">
	
	function upload(){
		var id = document.getElementById("id1").value;
		var info ={
			"uId":id,
			"uName":"张三",
			"uPassword":"123456"
		};
		$.ajax({
			url:"getUser2",
			type: "post",
            datatype: "json",
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify(info),
			success:function(data){
				alert(data.uName);
			},
            error:function(data,type,err){
            	alert(type);
            	alert(err);
            }
		});
	}
</script>

</body>
</html>