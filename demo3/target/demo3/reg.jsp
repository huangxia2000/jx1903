<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/28
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="user/uploads.action" method="post" enctype="multipart/form-data">
    用户名：<input type="text" name="user.uname" /><br/>
    密码：<input type="password" name="user.upwd" /><br/>
     文件：
    <input type="file" name="uploadImage"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
