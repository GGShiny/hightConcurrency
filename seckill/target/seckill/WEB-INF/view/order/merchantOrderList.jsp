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
                <td><c:if test="${item.paystatus == 1}">未支付</c:if><c:if test="${item.paystatus == 2}">支付完成</c:if><c:if test="${item.paystatus == 3}">退款成功</c:if>
                    <c:if test="${item.paystatus == 4}"><a href="javascript:void(0)" onclick="auditRefund('${item.tradeserialnumber}','${item.payamount}','${item.id}','3','${item.paytype}')">同意退款</a>||<a href="javascript:void(0)" onclick="auditRefund('${item.tradeserialnumber}','${item.payamount}','${item.id}','5','${item.paytype}')">拒绝退款</a></c:if>
                    <c:if test="${item.paystatus == 5}">已拒绝申请退款</c:if></td>
            </tr>
        </c:forEach>
    </table>


</body>
<script type="text/javascript">
    function auditRefund(tradeserialnumber, payamount, orderId, paystatus, paytype) {
        window.location.href="auditRefund?tradeserialnumber"+tradeserialnumber+"&payAmount="+payamount+"&orderId="+orderId+"&paystatus="+paystatus+"&paytype="+paytype
    }
</script>
</html>
