<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/5 0005
  Time: 下午 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<body>
<h1>这是注册页面</h1>

<form action="<%=basePath%>userRegister" method="post">
    username:<input type="text" name="username"/></br>
    password:<input type="password" name="password"/></br>
    fullName:<input type="text" name="fullname"/></br>
    <input type="submit" name="注册"/>

</form>



</body>
</html>
