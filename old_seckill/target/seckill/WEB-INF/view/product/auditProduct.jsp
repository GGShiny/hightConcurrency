<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/15
  Time: 下午 01:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/product/updateProductState" method="post">
        <input name="id" value="${skProduct.id}" type="hidden" />
        商品id:${skProduct.producttitle}<br>
        商家id:${skProduct.producttitle}<br>
        商品标题:${skProduct.producttitle}<br>
        商品图片:${skProduct.productpicture}<br>
        秒杀价格:${skProduct.seckillprice}<br>
        原价格:${skProduct.originalprice}<br>
        秒杀开始时间:${skProduct.startTimeStr}<br>
        秒杀结束时间:${skProduct.endTimeStr}<br>
        秒杀商品数:${skProduct.productcount}<br>
        商品库存数:${skProduct.stockcount}<br>
        商品描述信息:${skProduct.desciption}<br>
        审核通过:<input type="radio" name="state" value="2">审核不通过:<input type="radio" name="state" value="3">
        <input type="button" value="提交" onclick="submit(this)">
    </form>
</body>

<script type="text/javascript">
    function submit(obj) {
        obj.parent.submit();
    }
</script>
</html>
