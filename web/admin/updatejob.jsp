<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改职务</title>
    <link rel="stylesheet" type="text/css" href="../css/style.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/job.js"></script>
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
            <form method="post"  id="updatejobform">
                <table width="500" border="0" cellpadding="5" cellspacing="1"
                       bgcolor="#CCCCCC">
                    <c:forEach items="${job}" var="jo">
                    <tr>
                        <td height="24" colspan="2" align="center" bgcolor="#FFCC00">
                            请修改职务类型信息
                        </td>
                    </tr>
                    <tr>
                        <td width="130" height="24" bgcolor="#FFFFFF">
                            职务编号
                        </td>
                        <td width="347" height="24" bgcolor="#FFFFFF">
                            <input name="jobId" type="text" id="job_id" readonly
                                    value=" ${jo.jobId}">

                        </td>
                    </tr>
                    <tr>
                        <td height="24" bgcolor="#FFFFFF">
                            职务名称
                        </td>
                        <td height="24" bgcolor="#FFFFFF">
                            <input name="jobTitle" type="text" id="job_title"
                                   value=" ${jo.jobTitle}">

                        </td>
                    </tr>
                    <tr>
                        <td height="24" bgcolor="#FFFFFF">
                            最低工资
                        </td>
                        <td height="24" bgcolor="#FFFFFF">
                            <input name="minSalary" type="text" id="min_salary"
                                   value=" ${jo.minSalary}">

                        </td>
                    </tr>
                    <tr>
                        <td height="24" bgcolor="#FFFFFF">
                            最高工资
                        </td>
                        <td height="24" bgcolor="#FFFFFF">
                            <input name="maxSalary" type="text" id="max_salary"
                                   value="${jo.maxSalary}">

                        </td>
                    </tr>
                    <tr>
                        <td height="24" colspan="2" align="center" bgcolor="#FFFFFF">
                            <input type="button" value="更新"  onclick="updateJob()">
                            <input type="button" name="Submit2" value="取消"
                                   onclick="history.back()">
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