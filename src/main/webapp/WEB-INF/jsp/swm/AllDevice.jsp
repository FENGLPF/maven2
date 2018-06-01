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
<style type="text/css">
	table.allSN {
         font-family: verdana,arial,sans-serif;
         font-size:15px;
         color:#333333;
         border-width: 1px;
         border-color: #666666;
         border-collapse: collapse;
     }
     table.allSN th {
         border-width: 1px;
         padding: 8px;
         border-style: solid;
         border-color: #666666;
         background-color: #dedede;
     }
     table.allSN td {
         border-width: 1px;
         padding: 8px;
        border-style: solid;
         border-color: #666666;
         background-color: #ffffff;
     }
</style>
<title>设备中心</title>
</head>
<body>
	<div>
		<table class="allSN">
			<tr>
				<th>设备SN号</th>
            	<th>型号</th>
            	<th>名称</th>
            	<th>ICCID</th>
            	<th>生产日期</th>
            	<th colspan="2">操作</th>
			</tr>
			<c:forEach items="${deviceList}" var="device" varStatus="status">
				<tr class="${device.dId}">
					<td data-sn>${device.dSn }</td>
	            	<td data-model>${device.mId }</td>
	            	<td data-name>${device.dName }</td>
	            	<td data-ICCID>${device.dCcidNo}</td>
	            	<td data-made-date>${device.dMadeDate}</td>
	            	<td id="detail${device.dId}"><a href="javascript:selectByDid(${device.dId})">详情</a></td>
	            	<td id="updateDeviceName"><a href="<%=basePath %>Device/toUpdateDeviceName">修改设备名称</a></td>
            	</tr>
			</c:forEach>
		</table>
		<div>
			<p>每页${page.pageSize}条 当前页${page.size }条 
				${page.pageNum }/${page.pages }页 记录数${page.total}
			</p>
			<c:if test="${page.isFirstPage==true }"><a>首页</a></c:if>
			<c:if test="${page.isFirstPage==false }">
				<a href="../Device/pageHelper?page=1">首页</a>
			</c:if>
			<c:if test="${page.hasPreviousPage==false }">
				<a>上一页</a>
			</c:if>
			<c:if test="${page.hasPreviousPage==true }">
				<a href="../Device/pageHelper?page=${page.prePage }">上一页</a>
			</c:if>
			<c:if test="${page.hasNextPage==false }">
				<a>下一页</a>
			</c:if>
			<c:if test="${page.hasNextPage==true }">
				<a href="../Device/pageHelper?page=${page.nextPage }">下一页</a>
			</c:if>
			<c:if test="${page.isLastPage==true }">
				<a>末页</a>
			</c:if>
			<c:if test="${page.isLastPage==false }">
				<a href="../Device/pageHelper?page=${page.pages }">末页</a>
			</c:if>
			跳转到
			<input type="text" style="width:30px" id="turnPage" 
				onkeyup="(this.v=function(){this.value=this.value.replace(/[^0-9-]+/,'');}).call(this)" 
				onblur="this.v();"/>
			<input type="button" onclick="startTurn()" value="跳转"/>
		</div>

	</div>
	<div>
		<table class="tab1 allSN"></table>
	</div>
	<div>
		<label id="lab1"></label>
	</div>
<script type="text/javascript">
	$(function (){
	});
	
	function startTurn(){
		var total = "${page.pages}";
		var turnPage=document.getElementById("turnPage").value;
		if(parseInt(turnPage)>parseInt(total)){
			turnPage=total;
		}
	    var shref="<%=basePath %>Device/pageHelper?page="+turnPage; 
	    window.location.href=shref;
	}
	
	//详情
	function selectByDid(dId){
		var str = "."+dId;
		console.log(dId);
		if(document.getElementById("detail"+dId).value=="收起"){
			document.getElementById("detail"+dId).value="详情";
			$(".detail"+dId).remove();
		}
		else{
			$.ajax({
				url:"../dataViewInfo/getByDid",
				type:"get",
				datatype:"json",
				data:{"dId":dId},
				contentType:"application/json;charset=utf-8",
				success:function(data){
					var xhtml ="";
					for(var i in data){
						console.log(i+":"+data[i]);
					}
					for(var i in data){
						xhtml+="<td class='detail"+dId+"'>"+i+
							" : "+data[i]+"</td>";
					}
					document.getElementById("detail"+dId).value="收起";
					$(str).append(xhtml);
				},
				error:function(data){
					console.log("error");
				}
			});
		}
		
	}
	
	function showAllSN(){
		$.ajax({
			url:"../Device/allDevice",
			type: "post",
            datatype: "json",
            contentType: "application/json; charset=utf-8",
            success:function(data){
            	var xhtml="";
            	xhtml+='<tr><th>设备SN号</th>>'+
            		'<th>型号</th>'+
            		'<th>名称</th>'+
            		'<th>ICCID</th>'+
            		'<th>生产日期</th><tr>';
            	for(var i=0;i<data.length;i++){
            		console.log(data[i].dCcidNo);
            		xhtml+='<tr><td data-sn='+data[i].dSn+'>'+data[i].dSn+'</td>'+
            			'<td data-model>'+data[i].mId+'</td>'+
            			'<td data-name>'+data[i].dName+'</td>'+
            			'<td data-ICCID>'+(data[i].dCcidNo==null?"--":data[i].dCcidNo)+'</td>'+
            			'<td data-made-date>'+core.timestampToTime(data[i].dMadeDate)+'</td>'+'</tr>';
            	}
            	$(".tab1").append(xhtml);
            }
		});
	}
	
	function test(){
		$.ajax({
			url:"../user/getName",
			type: "post",
            datatype: "json",
            contentType: "application/json; charset=utf-8",
            success:function(data){
            	document.getElementById("lab1").value=data.uName;
            	alert(data.uName);
            }
		});
	}
</script>
</body>
</html>