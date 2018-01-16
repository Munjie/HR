<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/11
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>员工数据</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.0.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/job.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/emp.js"></script>
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
            <table width="98%" border="0" cellpadding="5" cellspacing="1"
                   bgcolor="#CCCCCC">
                <tr>
                    <td width="7%" height="24" bgcolor="#FFCC00">
                        员工编号
                    </td>
                    <td width="11%" height="24" bgcolor="#FFCC00">
                        员工姓名
                    </td>
                    <td width="16%" height="24" bgcolor="#FFCC00">
                        邮箱
                    </td>
                    <td width="16%" height="24" bgcolor="#FFCC00">
                        电话
                    </td>
                    <td width="12%" height="24" bgcolor="#FFCC00">
                        入职时间
                    </td>
                    <td width="9%" height="24" bgcolor="#FFCC00">
                        职务
                    </td>
                    <td width="9%" height="24" bgcolor="#FFCC00">
                        工资
                    </td>
                    <td width="7%" height="24" bgcolor="#FFCC00">
                        部门
                    </td>
                    <td width="13%" height="24" bgcolor="#FFCC00">
                        操作
                    </td>
                </tr>
               <c:forEach items="${emp}" var="e">
                <tr>
                    <td height="24" bgcolor="#FFFFFF">
                      ${e.EMPLOYEE_ID}
                    </td>
                    <td height="24" bgcolor="#FFFFFF">
                            ${e.EMP_NAME}
                    </td>
                    <td height="24" bgcolor="#FFFFFF">
                            ${e.EMAIL}
                    </td>
                    <td height="24" bgcolor="#FFFFFF">
                            ${e.PHONE_NUMBER}
                    </td>
                    <td height="24" bgcolor="#FFFFFF">
                        <fmt:formatDate  value="${e.HIRE_DATE}" pattern="yyyy-MM-dd" ></fmt:formatDate>
                    </td>
                    <td height="24" bgcolor="#FFFFFF">
                            ${e.JOB_TITLE}
                    </td>
                    <td height="24" bgcolor="#FFFFFF">
                            ${e.SALARY}
                    </td>
                    <td height="24" bgcolor="#FFFFFF">
                            ${e.DEPARTMENT_NAME}
                    </td>
                    <td height="24" bgcolor="#FFFFFF">
                      <input type="button"  value="修改" onclick="updateemp('${e.EMPLOYEE_ID}')">
                        <input type="button" value="删除" onclick="deleteEmp('${e.EMPLOYEE_ID}')">
                        <input type="button" value="照片" onclick="photo('${e.EMPLOYEE_ID}')">
                </tr>
               </c:forEach>
            </table>

            <!-- 分页显示用界面 -->
            <table width="95%" border="0" align="center" cellpadding="0"
                   cellspacing="0">
                <tr>
                    <td height="24" align="center">
                        共4条数据，每页显示9条，
                        共1页，当前是第1页
                    </td>
                </tr>
                <tr>
                    <td height="24" align="center">
                        <a href="?pagenum=1">首页</a>
                        <a href="?pagenum=0">上页</a>
                        <a href="?pagenum=2">下页</a>
                        <a href="?pagenum=1">末页</a>
                    </td>
                </tr>
                <tr>
                    <td height="24" align="center">



                        <font color="red"><b>1</b>
                        </font>


                    </td>
                </tr>
            </table>
            <p>
                <a href="addemp.do">增加新员工</a>					</p>
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
