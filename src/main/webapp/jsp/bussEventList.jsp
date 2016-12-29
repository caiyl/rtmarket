<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/29
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<%--<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>--%>

<%
    String contextPath =  request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
%>
<html>
<head>
    <title>Title</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="<%=contextPath%>/bootstrap/css/bootstrap.min.css">

    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="<%=contextPath%>/bootstrap/css/bootstrap-theme.min.css">



    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="<%=contextPath%>/jquery/jquery-3.1.1.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="<%=contextPath%>/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>



    <table class="table table-hover table-striped table-bordered table-advanced tablesorter">
        <thead>
        <tr>
            <th width="3%">
                <input type="checkbox" class="checkall" />
            </th>
            <th width="9%">序号</th>
            <th>事件名</th>
            <th width="10%">事件来源</th>
            <th width="10%">事件类型</th>
            <th width="7%">操作人</th>
            <th width="12%">操作时间</th>
            <th width="10%">Price</th>
            <th width="9%">Status</th>
            <th width="12%">Actions</th>
        </tr>
        <tbody>
        <c:forEach var="bussEvent" items="${page.content}">
            <tr>
                <td>
                    <input type="checkbox" />
                </td>
                <td>1</td>
                <td>${bussEvent.eventName}</td>
                <td>United States</td>
                <td>Male</td>
                <td>32</td>
                <td>20-05-2014</td>
                <td>$240.50</td>
                <td><span class="label label-sm label-success">Approved</span>
                </td>
                <td>
                    <button type="button" class="btn btn-default btn-xs"><i class="fa fa-edit"></i>&nbsp; Edit
                    </button>
                </td>
            </tr>
        </c:forEach>


        </tbody>
        </thead>
    </table>

</body>
</html>
