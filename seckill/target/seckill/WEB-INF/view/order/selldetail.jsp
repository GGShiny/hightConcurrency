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

<form action="/order/toPayOrder">

    购买数量:<input type="text" name="num">

    <input type="hidden" name="id" value="${skProduct.id}">

    <table border="1px">
    <tr>
        <td>标题</td>
        <td>图片</td>
        <td>秒杀价格</td>
        <td>原价</td>
        <td>秒杀开始时间</td>
        <td>秒杀结束时间</td>
        <td>秒杀商品数</td>
        <td>库存数</td>
    </tr>
    <tr>
        <td>${skProduct.producttitle}</td>
        <td>${skProduct.productpicture}</td>
        <td>${skProduct.seckillprice}</td>
        <td>${skProduct.originalprice}</td>
        <td>${skProduct.starttime}</td>
        <td>${skProduct.endtime}</td>
        <td>${skProduct.productcount}</td>
        <td>${skProduct.stockcount}</td>
    </tr>

</table>

    <table border="1px">
        <tr>
            <td>商品产地</td>
            <td>商品名称</td>
            <td>品牌信息</td>
            <td>商品重量</td>
            <td>规格和包装</td>
            <td>商品详情图片地址</td>
        </tr>
        <tr>
            <td>${skProductDetail.productplace}</td>
            <td>${skProductDetail.productname}</td>
            <td>${skProductDetail.brandname}</td>
            <td>${skProductDetail.productweight}</td>
            <td>${skProductDetail.specification}</td>
            <td>${skProductDetail.productdetailpicture}</td>
        </tr>

    </table>

    <input type="button" value="立即购买" onclick="submit(this)">
</form>
</body>

<script type="text/javascript">
    function submit(obj) {
        obj.parent.submit();
    }
</script>
</html>
