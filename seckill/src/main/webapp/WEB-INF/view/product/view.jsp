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
    <form action="/product/updateProduct">
        商品id:${skProduct.productid}<br>
        商品标题:${skProduct.producttitle}<br>
        商品图片:${skProduct.productpicture}<br>
        秒杀价格:${skProduct.seckillprice}<br>
        原价格:${skProduct.originalprice}<br>
        商家id:${skProduct.merchantid}<br>
        秒杀开始时间:${skProduct.starttime}<br>
        秒杀结束时间:${skProduct.endtime}<br>
        秒杀商品数:${skProduct.productcount}<br>
        商品库存数:${skProduct.stockcount}<br>
        商品描述信息:${skProduct.desciption}<br>
        秒杀商品申请时间:${skProduct.applydate}<br>
        秒杀商品审核时间:${skProduct.auditdate}<br>
        秒杀商品审核状态:${skProduct.auditstate}<br>
    </form>
</body>
</html>
