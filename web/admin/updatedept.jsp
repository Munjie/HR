<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/10
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>更新部门数据</title>
    <link rel="stylesheet" type="text/css" href="../css/style.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/adddept.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.0.js"></script>
<body>
<!-- 页面头部 -->
<table width="950" border="0" align="center" cellpadding="0"
       cellspacing="0">
    <tr>
        <td height="80" bgcolor="#FFFFFF"><img src="../img/bannal.jpg" width="950"
                                               height="80"> </td>
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

            <form id="formdept" method="post" >

                <table width="500" border="0" cellpadding="5" cellspacing="1"
                       bgcolor="#CCCCCC">
                    <c:forEach items="${deptinfo}" var="de">
                    <tr>
                        <td height="24" colspan="2" align="center" bgcolor="#FFCC00">
                            修改部门信息
                        </td>
                    </tr>
                    <tr>
                        <td width="120" height="24" bgcolor="#FFFFFF">
                            部门编号
                        </td>
                        <td width="357" height="24" bgcolor="#FFFFFF">
                            <input name="departmentId"  type="text" id="department_id" value="${de.departmentId}">

                        </td>
                    </tr>
                    <tr>
                        <td height="24" bgcolor="#FFFFFF">
                            部门名称
                        </td>
                        <td height="24" bgcolor="#FFFFFF">
                            <input name="departmentName" type="text" id="department_name" value="${de.departmentName}">

                        </td>
                    </tr>
                    <tr>
                        <td height="24" bgcolor="#FFFFFF">
                            部门地址
                        </td>
                        <td height="24" bgcolor="#FFFFFF">
                            <input name="locationName" type="text" id="location_name" value="${de.locationName}">

                        </td>
                    </tr>
                    <tr>
                        <td height="24" colspan="2" align="center" bgcolor="#FFFFFF">
                            <input type="button" onclick="updateDept()" value="更新">
                        </td>
                    </tr>
                    </c:forEach>
                </table>
            </form>
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
