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
<form action="/order/payOrder">
    购买数量:${productnum}
    支付金额:${payAmount}
    <input type="hidden" name="productid" value="${skProduct.id}">
    <input type="hidden" name="userid" value="${userid}">
    <input type="hidden" name="merchantid" value="${skProduct.merchantid}">
    <input type="hidden" name="payamount" value="${payAmount}">
    <input type="hidden" name="num" value="${productnum}">

    收货地址:<input type="text" name="recivingaddress"><br>
    收货人电话:<input type="text" name="recivingphone"><br>
    收货人名称:<input type="text" name="recivingname"><br>
    <input type="button" value="立即付款" onclick="submit(this)">
</form>

</body>

<script type="text/javascript">
    function submit(obj) {
        obj.parent.submit();
    }
</script>
</html>
