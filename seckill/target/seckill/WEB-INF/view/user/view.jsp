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
<%
%>
    <form action="add">
        用户姓名:${user.username}<br>
        用户密码:${user.userpassword}<br>
        用户性别:${user.usersex}<br>
        用户年龄:${user.userage}<br>
        用户地址:${user.useraddress}<br>
        用户邮箱:${user.useremail}
    </form>
</body>
</html>
