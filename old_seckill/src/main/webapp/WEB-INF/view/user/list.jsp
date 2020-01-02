<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/15
  Time: 下午 01:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center><a href="/user/toAdd">添加用户</a></center>
    <table border="1px">
        <tr>
            <td>用户姓名</td>
            <td>用户账号</td>
            <td>用户密码</td>
            <td>用户性别</td>
            <td>用户年龄</td>
            <td>用户地址</td>
            <td>用户邮箱</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${seckillUserList}" var="item">
            <tr>
                <td>${item.username}</td>
                <td>${item.useraccount}</td>
                <td>${item.userpassword}</td>
                <td>${item.usersex}</td>
                <td>${item.userage}</td>
                <td>${item.useraddress}</td>
                <td>${item.useremail}</td>
                <td><a href="toUpdate?id=${item.id}">修改</a>||<a href="del?id=${item.id}">删除</a>||<a href="findById?id=${item.id}">查看</a></td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
