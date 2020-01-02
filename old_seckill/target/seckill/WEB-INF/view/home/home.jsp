<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/20
  Time: 下午 04:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>用户主页</h3>
${user.useraccount} 欢迎登陆 <br>
<a href="/userRegister/toRegister">注册</a><br>
<a href="/userRegister/tologin">登陆</a><br>
<a href="/userRegister/logout">退出登录</a>
<a href="/order/findOrderById">查看订单</a>

<table border="1px">
    <c:forEach items="${skProductList}" var="item">
        <tr>
            <td>${item.producttitle}</td>
            <td>${item.productpicture}</td>
            <td>${item.seckillprice}</td>
            <td>${item.originalprice}</td>
            <td>${item.starttime}</td>
            <td>${item.endtime}</td>
            <td><a href="/home/toViewPage?productId=${item.id}">查看</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
