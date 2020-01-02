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
    <center><a href="/product/toApplySkProduct">申请秒杀商品</a></center>
    <table border="1px">
        <tr>
            <td>商品id</td>
            <td>商品标题</td>
            <td>图片地址</td>
            <td>秒杀价格</td>
            <td>秒杀原价</td>
            <td>商家id</td>
            <td>申请时间</td>
            <td>审核状态</td>
            <td>秒杀开始时间</td>
            <td>秒杀结束时间</td>
            <td>秒杀商品数</td>
            <td>秒杀商品库存</td>
            <td>商品描述</td>
            <td>操作</td>
        </tr>

        <c:forEach items="${list}" var="item">
            <tr>
                <td>${item.productid}</td>
                <td>${item.producttitle}</td>
                <td>${item.productpicture}</td>
                <td>${item.seckillprice}</td>
                <td>${item.originalprice}</td>
                <td>${item.merchantid}</td>
                <td>${item.applydate}</td>
                <td>${item.auditstate}</td>
                <td>${item.starttime}</td>
                <td>${item.endtime}</td>
                <td>${item.productcount}</td>
                <td>${item.stockcount}</td>
                <td>${item.desciption}</td>
                <td><a href="toUpdateProduct?id=${item.id}">修改</a>||<a href="del?id=${item.id}">删除</a>
                    ||<a href="findSkProductById?id=${item.id}">查看</a>||<a href="toUpdateProductState?id=${item.id}">审核</a>
                ||<a href="/skProductDetail/toAdd?productid=${item.id}&&merchantid=${item.merchantid}">添加商品详情</a>
                ||<a href="/skProductDetail/findById?productid=${item.id}">查看商品详情</a>
                ||<a href="/skProductDetail/toUpdate?productid=${item.id}">修改商品详情</a></td>
            </tr>
        </c:forEach>
    </table>


</body>
</html>
