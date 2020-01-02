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
            <td>支付金额</td>
            <td>创建时间</td>
            <td>支付状态</td>
            <td>收货地址</td>
            <td>收货人电话</td>
            <td>收货人名称</td>
            <td>交易流水号</td>
            <td>购买数</td>
            <td>操作</td>
        </tr>

        <c:forEach items="${orderList}" var="item">
            <tr>
                <td>${item.payamount}</td>
                <td>${item.createtime}</td>
                <td>${item.paystatus}</td>
                <td>${item.recivingaddress}</td>
                <td>${item.recivingphone}</td>
                <td>${item.recivingname}</td>
                <td>${item.tradeserialnumber}</td>
                <td>${item.num}</td>
                <td><c:if test="${item.paystatus == 1}"><a href="/order/toPayWithOrder?id=${item.id}&tradeserialnumber=${item.tradeserialnumber}&payAmount=${item.payamount}">继续支付</a></c:if><c:if test="${item.paystatus == 2}">支付完成</c:if><c:if test="${item.paystatus == 3}">退款成功</c:if><c:if test="${item.paystatus == 4}">退款申请中</c:if>
                    <c:if test="${item.paystatus == 5}">已拒绝申请退款</c:if></td>
                <td><input type="button" value="申请退款" onclick="applyRefund('${item.id}', '${item.paytype}')"></td>
            </tr>
        </c:forEach>
    </table>

</body>
<script type="text/javascript">
    function applyRefund(orderId, paytype) {
        window.location.href="applyRefund?orderId="+orderId+"&paytype="+paytype
    }
</script>
</html>