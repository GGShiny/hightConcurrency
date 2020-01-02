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
        用户姓名:<input name="username"><br>
        用户账号:<input name="useraccount"><br>
        用户密码:<input name="userpassword"><br>
        用户性别:<input name="usersex"><br>
        用户年龄:<input name="userage"><br>
        用户地址:<input name="useraddress"><br>
        用户邮箱:<input name="useremail"><br>
        <input type="button" value="提交" onclick="submit(this)">
    </form>
</body>

<script type="text/javascript">
    function submit(obj) {
        obj.parent.submit();
    }
</script>
</html>
