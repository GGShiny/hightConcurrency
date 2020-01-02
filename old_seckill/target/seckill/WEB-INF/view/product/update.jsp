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
    <form action="/product/toUpdateProductState" method="post">
        <input name="id" value="${skProduct.id}" type="hidden" />
        商品标题:<input name="producttitle" value="${skProduct.producttitle}"><br>
        商品图片:<input name="productpicture" value="${skProduct.productpicture}"><br>
        秒杀价格:<input name="seckillprice" value="${skProduct.seckillprice}"><br>
        原价格:<input name="originalprice" value="${skProduct.originalprice}"><br>
        秒杀开始时间:<input name="startTimeStr" value="${skProduct.startTimeStr}"><br>
        秒杀结束时间:<input name="endTimeStr" value="${skProduct.endTimeStr}"><br>
        秒杀商品数:<input name="productcount" value="${skProduct.productcount}"><br>
        商品库存数:<input name="stockcount" value="${skProduct.stockcount}"><br>
        商品描述信息:<input name="desciption" value="${skProduct.desciption}"><br>
        <input type="button" value="提交" onclick="submit(this)">
    </form>
</body>

<script type="text/javascript">
    function submit(obj) {
        obj.parent.submit();
    }
</script>
</html>
