<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/20
  Time: 下午 04:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${error}
<form action="/merchantRegister/login" method="post">
    商家账号:<input name="merchantaccount"><br>
    商家密码:<input name="merchantpassword"><br>
    <input type="button" value="提交" onclick="submit(this)">
</form>

</body>
<script type="text/javascript">
    function submit(obj) {
        obj.parent.submit();
    }
</script>
</html>
