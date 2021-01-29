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
    <form action="my/some.do" method="post" >
        姓名<input type="text" name="name"><br/>
        年龄<input type="text" name="age"><br/>
        <input type="submit" value="提交">
    </form>

    <form action="my/receive.do" method="post" >
        姓名<input type="text" name="rname"><br/>
        年龄<input type="text" name="rage"><br/>
        <input type="submit" value="提交">
    </form>

    <form action="my/receiveObject.do" method="post" >
        姓名<input type="text" name="name"><br/>
        年龄<input type="text" name="age"><br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
