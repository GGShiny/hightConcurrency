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
<h3>商家主页</h3>
${merchant.merchantaccount} 欢迎登陆 <br>
<a href="/merchantRegister/toRegister">注册</a><br>
<a href="/merchantRegister/tologin">登陆</a><br>
<a href="/merchantRegister/logout">退出登录</a>
<a href="/order/findOrderByMerchantId">查看订单</a>
</body>
</html>
