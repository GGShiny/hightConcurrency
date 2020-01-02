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
    <form action="applySkProduct" method="post">
        商品id:<input name="productid"><br>
        商品标题:<input name="producttitle"><br>
        商品图片:<input name="productpicture"><br>
        秒杀价格:<input name="seckillprice"><br>
        原价格:<input name="originalprice"><br>
        商家id:<input name="merchantid"><br>
        秒杀开始时间:<input name="startTimeStr"><br>
        秒杀结束时间:<input name="endTimeStr"><br>
        秒杀商品数:<input name="productcount"><br>
        商品库存数:<input name="stockcount"><br>
        商品描述信息:<input name="desciption"><br>
        <input type="button" value="提交" onclick="submit(this)">
    </form>
</body>
<script type="text/javascript">
    function submit(obj) {
        obj.parent.submit();
    }
</script>
</html>
