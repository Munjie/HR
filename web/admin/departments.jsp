<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/9
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>部门数据</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/adddept.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.0.js"></script>
</head>

<body>
<!-- 页面头部 -->
<table width="950" border="0" align="center" cellpadding="0"
       cellspacing="0">
    <tr>
        <td height="80" bgcolor="#FFFFFF"><img src="../img/bannal.jpg" width="950" height="80"> </td>
    </tr>
    <tr>
        <td height="24" align="right" bgcolor="#FFFFFF"><a href="default.jsp.html">首页</a> <a href="DeptViewServlet.html">部门查询</a> <a href="JobsViewServlet.html">职务查询</a> <a href="EmpViewServlet.html">员工查询</a> <a href="logout.jsp.html">退出登陆</a> </td>
    </tr>
    <tr>
        <td height="24" align="right" bgcolor="#0099CC"> 当前用户：admin 身份：

            管理员 </td>
    </tr>
</table>
<!-- 页面内容 -->
<table border="0" width="950" height="350" bgcolor="#ffffff"
       align="center">
    <tr>
        <td align="center" valign="top">
            <table width="90%" border="0" cellpadding="5" cellspacing="1"
                   bgcolor="#CCCCCC">
                <tr>
                    <th width="17%" bgcolor="#FFCC00">
                        部门编号
                    </th>
                    <th width="25%" bgcolor="#FFCC00">
                        部门名称
                    </th>
                    <th width="37%" bgcolor="#FFCC00">
                        部门地址
                    </th>
                    <th width="21%" bgcolor="#FFCC00">
                        操作
                    </th>
                </tr>
                <!-- 循环输出部门记录 -->
                <c:forEach items="${dept}" var="de">
                <tr>

                    <td bgcolor="#FFFFFF">${de.departmentId}</td>
                    <td bgcolor="#FFFFFF">${de.departmentName}</td>
                    <td bgcolor="#FFFFFF">${de.locationName}</td>
                    <td bgcolor="#FFFFFF"><input type="button"  value="删除" onclick="deletedept('${de.departmentId}')"><input type="button"  value="修改" onclick="updatedept('${de.departmentId}')"></td>

                </tr>
                </c:forEach>
            </table>
            <p>
                <a href="admin/adddept.jsp">增加新部门</a>
            </p>
        </td>
    </tr>
</table>

<!-- 页面底部 -->

<table width="950" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
    <tr>
        <td><hr></td>
    </tr>
    <tr>
        <td align="center">©版权所有</td>
    </tr>
    <tr>
        <td>&nbsp;</td>
    </tr>
    <tr>
        <td>&nbsp;</td>
    </tr>
</table>
</body>
</html>
