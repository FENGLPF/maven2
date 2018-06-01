/**
 * 
 */

var $,tab,skyconsWeather;
//获取当前网址，如： http://localhost:8083/myproj/view/my.jsp
var curWwwPath=window.document.location.href;
//获取主机地址之后的目录，如： myproj/view/my.jsp
var pathName=window.document.location.pathname;
var pos=curWwwPath.indexOf(pathName);
//获取主机地址，如： http://localhost:8083
var localhostPaht=curWwwPath.substring(0,pos);
//获取带"/"的项目名，如：/myproj
var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
//得到了 http://localhost:8083/myproj
var realPath=localhostPaht+projectName;

layui.config({
	base : realPath+"/js/mylayui/"
}).use(['bodyTab','form','element','layer','jquery'],function(){
	var form = layui.form(),
		layer = layui.layer,
		element = layui.element();
		$ = layui.jquery;
	
	$("#login").on("click",function(){
		var uName=document.getElementById("uName").value;
		var uPassword = document.getElementById("uPassword").value;
		console.log(uName+uPassword);
		if(uName!=""&&uPassword!=""){
			$.ajax({
				url:"/user/mylogin",
				type:"post",
				datatype: "json",
		        contentType: "application/json; charset=utf-8",
		        data:{"uName":uName,"uPassword":uPassword},
		        success:function(data){
		        	console.log(data.uName);
		        }
			});
		}
		else{
			alert("请输入账号密码");
		}
	});
	
	function jumpTo(){
		
	}
		
	
});