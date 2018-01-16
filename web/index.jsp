<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/9
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>用户登陆</title>
  <link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<form name="form1" method="post" action="login.do">
  <table width="300" border="0" align="center" cellpadding="4"
         cellspacing="1" bgcolor="#FF9900">
    <tr>
      <td height="24" colspan="2" align="center" bgcolor="#FFCC66">
        管理员登陆
      </td>
    </tr>
    <tr>
      <td width="77" height="24" align="center" bgcolor="#FFFFFF">
        管理账号
      </td>
      <td width="204" height="24" bgcolor="#FFFFFF">
        <input name="adminname" type="text" id="adminname" value="mwj" class="input1">
      </td>
    </tr>
    <tr>
      <td height="24" align="center" bgcolor="#FFFFFF">
        管理密码
      </td>
      <td height="24" bgcolor="#FFFFFF">
        <input name="adminpwd" type="password" value="123" id="adminpwd"
               class="input1">
      </td>
    </tr>
    <tr>
      <td height="24" align="center" bgcolor="#FFFFFF">
        管理级别
      </td>
      <td height="24" bgcolor="#FFFFFF">
        <input name="adminlevel" type="radio" value="1" checked>
        管理员
        <input name="adminlevel" type="radio" value="2">
        操作员
      </td>
    </tr>
    <tr>
      <td height="24" colspan="2" align="center" bgcolor="#FFFFFF">
        <input type="submit"  value="进入系统">
        &nbsp;&nbsp;
        <input type="hidden" name="targetURL" value="">
      </td>
    </tr>
  </table>
</form>
</body>
</html>
