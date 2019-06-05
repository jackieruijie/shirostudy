<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/4 0004
  Time: 下午 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<body>
<h1>登陆</h1>
<form action="<%=basePath%>login" method="post">
    用户名： <input type="text" name="username"></br>
    密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"></br>
    <input type="submit" value="登陆">
</form>


<%--<h1>注册</h1>--%>
<a href="<%=basePath%>register">没有账号？请先注册！！！</a>

</body>
</html>
