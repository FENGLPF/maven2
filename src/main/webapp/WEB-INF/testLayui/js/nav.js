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

var navs = [{
	"title" : "后台首页",
	"icon" : "icon-computer",
	"href" : realPath+"/jsp/testLayui/page/main.html",
	"spread" : false
},{
	"title" : "文章列表",
	"icon" : "icon-text",
	"href" : realPath+"/jsp/testLayui/page/news/newsList.html",
	"spread" : false
},{
	"title" : "友情链接",
	"icon" : "icon-text",
	"href" : realPath+"/jsp/testLayui/page/links/linksList.html",
	"spread" : false
},{
	"title" : "404页面",
	"icon" : "&#xe61c;",
	"href" : realPath+"/jsp/testLayui/page/404.html",
	"spread" : false
},{
	"title" : "系统基本参数",
	"icon" : "&#xe631;",
	"href" : realPath+"/jsp/testLayui/page/systemParameter/systemParameter.html",
	"spread" : false
},{
	"title" : "二级菜单演示",
	"icon" : "&#xe61c;",
	"href" : "",
	"spread" : false,
	"children" : [
		{
			"title" : "二级菜单1",
			"icon" : "&#xe631;",
			"href" : "",
			"spread" : false
		},
		{
			"title" : "二级菜单2",
			"icon" : "&#xe631;",
			"href" : "",
			"spread" : false
		}
	]
}]