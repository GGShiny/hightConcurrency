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
    <form action="/merchantRegister/register" method="post">
        商家姓名:<input name="merchantname"><br>
        店铺名称:<input name="merchantshopname"><br>
        商家账号:<input name="merchantaccount"><br>
        商家密码:<input name="merchantpassword"><br>
        经营范围:<input name="merchantscope"><br>
        <input type="button" value="提交" onclick="submit(this)">
    </form>
</body>


<script type="text/javascript">
    function submit(obj) {
        obj.parent.submit();
    }
</script>
</html>
