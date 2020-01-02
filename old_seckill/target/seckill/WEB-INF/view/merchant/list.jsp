<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/15
  Time: 下午 01:39
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center><a href="toAdd">添加商家</a></center>
    <table border="1px">
        <tr>
            <td>商家姓名</td>
            <td>店铺名称</td>
            <td>商家账号</td>
            <td>商家密码</td>
            <td>经营范围</td>
            <td>操作</td>
        </tr>

        <c:forEach items="${merchantList}" var="item">
            <tr>
                <td>${item.merchantname}</td>
                <td>${item.merchantshopname}</td>
                <td>${item.merchantaccount}</td>
                <td>${item.merchantpassword}</td>
                <td>${item.merchantscope}</td>
                <td><a href="toUpdate?id=${item.id}">修改</a>||<a href="del?id=${item.id}">删除</a>||<a href="findMerchantById?id=${item.id}">查看</a></td>
            </tr>
        </c:forEach>
    </table>


</body>
</html>
