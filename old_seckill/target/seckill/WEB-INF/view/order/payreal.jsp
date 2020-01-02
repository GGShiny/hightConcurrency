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
<form action="payWithOrder" method="post">
    支付方式
    支付宝<input type="radio" name="payType" value="1">
    微信<input type="radio" name="payType" value="2">
    银联<input type="radio" name="payType" value="3">
    支付金额:${payAmount}
    订单流水号:${tradeserialnumber}
    <input type="hidden" name="id" value="${id}">
    <input type="hidden" name="tradeserialnumber" value="${tradeserialnumber}">
    <input type="hidden" name="payAmount" value="${payAmount}">

    <input type="button" value="立即付款" onclick="submit(this)">
</form>

</body>

<script type="text/javascript">
    function submit(obj) {
        obj.parent.submit();
    }
</script>
</html>
