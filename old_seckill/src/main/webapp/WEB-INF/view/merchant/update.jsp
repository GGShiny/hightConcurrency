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
    <form action="update" method="post">
        <input name="id" value="${merchant.id}" type="hidden" />
        商家姓名:<input name="merchantname" value="${merchant.merchantname}"><br>
        店铺名称:<input name="merchantshopname" value="${merchant.merchantshopname}"><br>
        商家账号:<input name="merchantaccount" value="${merchant.merchantaccount}"><br>
        商家密码:<input name="merchantpassword" value="${merchant.merchantpassword}"><br>
        经营范围:<input name="merchantscope" value="${merchant.merchantscope}"><br>
        <input type="button" value="提交" onclick="submit(this)">
    </form>
</body>

<script type="text/javascript">
    function submit(obj) {
        obj.parent.submit();
    }
</script>
</html>
