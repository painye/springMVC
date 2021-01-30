<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/1/29
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>第一个springmvc项目</p>
    <p><a href="${pageContext.request.contextPath}/my/some.do">发起some.do的get请求</a></p><br/>
    <form action="${pageContext.request.contextPath}/my/other.do" method="post">
        <input type="submit" value="发起other.do"的post请求>
    </form>
</body>
</html>
