<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/11
  Time: 18:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>增加员工照片</title>
    <link rel="stylesheet" type="text/css" href="../css/style.css">
</head>

<body>

<form action="../up.do" method="post" enctype="multipart/form-data">

    <input type="file" name="myfile">
    <input type="submit" name="上传">
</form>
</body>
</html>
