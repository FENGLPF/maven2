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
<title>切换图片</title>
</head>
<body>
<script type="text/javascript">
	var curIndex=0;
	var timeInterval = 2000;
	var arr = new Array();
	arr[0]="<%=basePath %>file/picture/test/userface1.jpg"; 
	arr[1]="<%=basePath %>file/picture/test/userface2.jpg"; 
	arr[2]="<%=basePath %>file/picture/test/userface3.jpg"; 
	arr[3]="<%=basePath %>file/picture/test/userface4.jpg"; 
	setInterval(changeItem,timeInterval);
	function changeItem(){
		var obj = document.getElementById("obj");
		if(curIndex==arr.length-1){
			curIndex=0;
		}
		else{
			curIndex+=1;
		}
		obj.src=arr[curIndex];
	}
</script>
<img id="obj" src="<%=basePath %>file/picture/test/userface1.jpg" border="0"/>
</body>
</html>