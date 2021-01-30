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
    <!--外部导入这个库-->
    <script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
</head>
<body>
    <p>第一个springmvc项目</p>
    <form action="my/some.du" method="post" >
        姓名<input type="text" name="name"><br/>
        年龄<input type="text" name="age"><br/>
        <input type="submit" value="提交">
    </form>
    <br/>
    <img src="imag/p1.jpg" alt="我是一个静态资源不能显示">
</body>
</html>
