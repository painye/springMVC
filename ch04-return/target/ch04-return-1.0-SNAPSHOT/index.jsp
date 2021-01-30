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
    <script src="js/jquery-3.3.1.min.js" type="text/javascript" ></script>
    <script type="text/javascript">
        $(function () {
            $("button").click(function () {
                //alert("click");
               $.ajax({
                   //提交给后台的地址
                   url: "my/returnStudentList.do",
                   //提交携带的信息
                   data:{name:"张三", age:20},
                   //提交的方式
                   type:"post",
                   //提交数据的类型
                   dataType: "json",
                   //回调函数， resp后台携带的数据
                   success:function (resp) {
                       //resp从服务器端返回的是一个json格式的字符串{"name": 张三, "age":20}
                       //jquer会把字符串转换为json对象赋值给resp；
                        alert(resp.name+"   "+resp.age)
                   }

               })
            })

        })
    </script>
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
    <br/>
    <button id="btn">发起ajax请求</button>
</body>
</html>
