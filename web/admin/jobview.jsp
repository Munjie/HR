<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>职务数据</title>
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
            <table width="90%" border="0" cellpadding="5" cellspacing="1"
                   bgcolor="#CCCCCC">
                <tr>
                    <th width="16%" height="24" align="center" bgcolor="#FFCC00">
                        职务编号
                    </th>
                    <th width="21%" height="24" align="center" bgcolor="#FFCC00">
                        职务名称
                    </th>
                    <th width="23%" height="24" align="center" bgcolor="#FFCC00">
                        最低工资
                    </th>
                    <th width="24%" height="24" align="center" bgcolor="#FFCC00">
                        最高工资
                    </th>
                    <th width="16%" height="24" align="center" bgcolor="#FFCC00">
                        操作
                    </th>
                </tr>

                <!-- 显示职务数据 -->
                <c:forEach items="${job}" var="jo">
                <tr>
                    <td height="24" bgcolor="#FFFFFF">
                      ${jo.jobId}
                    </td>
                    <td height="24" bgcolor="#FFFFFF">
                            ${jo.jobTitle}
                    </td>
                    <td height="24" bgcolor="#FFFFFF">
                            ${jo.minSalary}
                    </td>
                    <td height="24" bgcolor="#FFFFFF">
                            ${jo.maxSalary}
                    </td>
                    <td height="24" bgcolor="#FFFFFF">
                        <input type="button" onclick="deletejob('${jo.jobId}')" value="删除">
                        <input type="button" onclick="updatejob('${jo.jobId}')" value="修改">
                        						</td>
                </tr>
                </c:forEach>
            </table>
            <p>
                <a href="admin/addjob.jsp">增加新职务种类</a>					</p>
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