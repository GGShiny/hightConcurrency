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
    <form action="update" method="post">
        <input type="hidden" name="merchantid" value="${productDetail.merchantid}">
        <input type="hidden" name="productid" value="${productid}">
        商品产地:<input name="productplace" value="${productDetail.productplace}"><br>
        商品名称:<input name="productname" value="${productDetail.productname}"><br>
        品牌信息:<input name="brandname" value="${productDetail.brandname}"><br>
        商品重量:<input name="productweight" value="${productDetail.productweight}"><br>
        规格和包装:<input name="specification" value="${productDetail.specification}"><br>
        商品详情图片地址:<input name="productdetailpicture" value="${productDetail.productdetailpicture}"><br>
        <input type="button" value="提交" onclick="submit(this)">
    </form>
</body>

<script type="text/javascript">
    function submit(obj) {
        obj.parent.submit();
    }
</script>
</html>
