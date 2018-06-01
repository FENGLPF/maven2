var navs = [{
    "title": "经销商管理",
    "icon": "fa-users",
    "href": "CompanyInfo.aspx"
}, {
    "title": "设置与库存",
    "icon": "fa-cube",
    "href": "",
    "children": [{
        "title": "产品设置",
        //"icon": "fa-line-chart",
        "href": "Prods.aspx"
       
    }, {
        "title": "库存管理",
        //"icon": "fa-area-chart",
        "href": "ProdTwo.aspx"
    }]
}, {
    "title": "内部管理",
    "icon": "fa-file-text",
    "href": "UserInfo.aspx"
//}, {
//    "title": "库存管理",
//    "icon": "fa-cube",
//    "href": "MateModel.aspx"
}, {
    "title": "终端管理",
    "icon": "fa-life-bouy",
    "href": "EndUserInfo.aspx"
}, {
    "title": "用户管理",
    "icon": " fa-user",
    "href": "UserInfoEnd.aspx"
}, {
    "title": "数据分析",
    "icon": "fa-bar-chart",
    "href": "",
    "children": [{
        "title": "设备分析",
        "icon": "fa-area-chart",
        "href": "BigDataList.aspx"
    }, {
        "title": "用户趋势",
        "icon": "fa-line-chart",
        "href": "BigdataUser.aspx"
    }, {
        "title": "工单分析",
        "icon": "fa-align-left",
        "href": "BigdataServer.aspx"
    }]
} ,{
    "title": "售后服务",
    "icon": "fa-heartbeat",
    "spread": false,
    "href": "",
    "children": [
     {
         "title": "待维护",
         "icon": "fa fa-random",
         "href": "MaintainInfo.aspx"
     },
     {

         "title": "待维修",
         "icon": "fa fa-wrench",
         "href": "ServerInfo.aspx"
     },
     {

         "title": "维护工单",
         "icon": "fa fa-file-text-o",
         "href": "MaintainList.aspx"
     }, {
         "title": "维修工单",
         "icon": "fa fa-file-text-o",
         "href": "ServerList.aspx"
     }
    ]
}, {
    "title": "财务管理",
    "icon": "fa-user",
    "href": "OrderInfo.aspx"
}, {
    "title": "物联网卡",
    "icon": "fa-user",
    "href": "CardInfo.aspx"
}, {
    "title": "角色权限设置",
    "icon": "fa-gears",
    "href": "AuthorityInfo.aspx"
}];