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
    <form action="add">
        商家姓名:${merchant.merchantname}<br>
        店铺名称:${merchant.merchantshopname}<br>
        商家账号:${merchant.merchantaccount}<br>
        商家密码:${merchant.merchantpassword}<br>
        经营范围:${merchant.merchantscope}<br>
    </form>
</body>
</html>
