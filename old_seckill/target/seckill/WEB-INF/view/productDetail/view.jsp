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
<form action="add" method="post">
    商品产地:${productDetail.productplace}<br>
    商品名称:${productDetail.productname}<br>
    品牌信息:${productDetail.brandname}<br>
    商品重量:${productDetail.productweight}<br>
    规格和包装:${productDetail.specification}<br>
    商品详情图片地址:${productDetail.productdetailpicture}
</form>
</body>

<script type="text/javascript">
    function submit(obj) {
        obj.parent.submit();
    }
</script>
</html>
