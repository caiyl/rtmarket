<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/28
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String contextPath =  request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
%>
<html>
<head>
    <title></title>



    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="<%=contextPath%>/bootstrap/css/bootstrap.min.css">

    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="<%=contextPath%>/bootstrap/css/bootstrap-theme.min.css">

    <link rel="stylesheet" href="<%=contextPath%>/css/index.css">


    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="<%=contextPath%>/jquery/jquery-3.1.1.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="<%=contextPath%>/bootstrap/js/bootstrap.min.js"></script>

    <script>

        function SetWinHeight(obj) {
            var win = obj;
            if (document.getElementById) {
                if (win && !window.opera) {
                    if (win.contentDocument && win.contentDocument.body.offsetHeight)
                        win.height = win.contentDocument.body.offsetHeight;
                    else if (win.Document && win.Document.body.scrollHeight)
                        win.height = win.Document.body.scrollHeight;
                }
            }
        }

        function submitForm(){
            document.saveForm.submit();
        }
    </script>
</head>
<body>


<nav id="topbar" role="navigation" style="margin-bottom: 0; z-index: 2;background-color: #a6d5fb"
     class="navbar  navbar-fixed-top">
    <img src="images/logo.gif" style="margin-left: -50px">
    <div class="navbar-header">

        <button type="button" data-toggle="collapse" data-target=".sidebar-collapse" class="navbar-toggle"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
        </button><a id="logo" href="index.html" class="navbar-brand"><span class="fa fa-rocket"></span><span class="logo-text"></span><span style="display: none" class="logo-text-icon">µ</span></a>
    </div>
    <span style="font-size: 20px"> 实时营销</span>

</nav>


<div class="container-fluid" style="margin-top: 51px;margin-bottom: 51px">
    <div class="row">
        <div class="col-md-2" style="border-right: 1px solid;border-color: #97c0ff" >
    <!--BEGIN SIDEBAR MENU-->
    <%--<nav id="sidebar" role="navigation" class="nav nav-list bs-docs-sidenav affix-top" style="background-color: #FFFFFF;"  >--%>

            <ul id="main-nav" class="nav nav-tabs nav-stacked" style="">
                <li>
                    <a href="#">
                        <i class="glyphicon glyphicon-th-large"></i>
                        首页
                    </a>
                </li>
                <li>
                    <a href="#systemSetting" class="nav-header collapsed" data-toggle="collapse">
                        <i class="glyphicon glyphicon-cog"></i>
                        系统管理
                        <span class="pull-right glyphicon glyphicon-chevron-down"></span>
                    </a>
                    <ul id="systemSetting" class="nav nav-list collapse secondmenu" style="height: 0px;">
                        <li><a href="#"><i class="glyphicon glyphicon-user"></i>用户管理</a></li>
                        <li><a href="#"><i class="glyphicon glyphicon-th-list"></i>菜单管理</a></li>
                        <li><a href="#"><i class="glyphicon glyphicon-asterisk"></i>角色管理</a></li>
                        <li><a href="#"><i class="glyphicon glyphicon-edit"></i>修改密码</a></li>
                        <li><a href="http://ruyo-net-demo.qiniudn.com/Bootstrap_left_menu.html#"><i class="glyphicon glyphicon-eye-open"></i>日志查看</a></li>
                    </ul>
                </li>

                <li>
                    <a href="#configManage" class="nav-header collapsed" data-toggle="collapse">
                        <i class="glyphicon glyphicon-globe"></i>
                        配置管理
                        <span class="pull-right glyphicon glyphicon-chevron-down"></span>
                    </a>

                    <ul id="configManage" class="nav nav-list collapse secondmenu" style="height: 0px;">
                        <li><a href="<%=contextPath%>/bussEvent/list.do#" target="mainContent"><i class="glyphicon glyphicon-user"></i>事件列表</a></li>
                        <li><a href="#"><i class="glyphicon glyphicon-th-list"></i>规则管理</a></li>
                        <li><a href="#"><i class="glyphicon glyphicon-asterisk"></i>菜单映射管理</a></li>
                        <li><a href="#"><i class="glyphicon glyphicon-edit"></i>指标管理</a></li>
                    </ul>

                </li>

                <li>
                    <a href="#">
                        <i class="glyphicon glyphicon-credit-card"></i>
                        数据管理
                        <span class="label label-warning pull-right">5</span>
                    </a>
                </li>

                <li>
                    <a href="#">
                        <i class="glyphicon glyphicon-calendar"></i>
                        图表统计
                    </a>
                </li>
                <li>
                    <a href="#">
                        <i class="glyphicon glyphicon-fire"></i>
                        关于系统
                    </a>
                </li>

            </ul>


    <%--</nav>--%>
    <!--END SIDEBAR MENU-->
    <!--BEGIN CHAT FORM-->

    <!--END CHAT FORM-->
    <!--BEGIN PAGE WRAPPER-->

        </div>

        <div class="col-md-10" style="">
            <%--主窗口--%>
            <iframe id="mainContent" name="mainContent"  onload="Javascript:SetWinHeight(this)" scrolling="no" frameborder="0" style="width: 100%; "></iframe>
        </div>
    </div>
</div>
    <!--BEGIN FOOTER-->

    <!--END FOOTER-->

</div>

<footer id="footer" style="clear:both;text-align:center;">
    <nav class="navbar navbar-fixed-bottom" style="background-color:#d7eeff;">
        <div class="navbar-inner navbar-content-center">
            <p class="text-muted credit" style="padding: 10px;">
                版权 © www.sunline.cn
            </p>
        </div>
    </nav>
    </footer>

</body>

</html>
