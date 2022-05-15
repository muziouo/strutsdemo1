<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>登录失败</title>
</head>
<body>
  ${msg }<br>
  <%= request.getAttribute("msg")%><br>
    您的登录失败了，可能原因是用户名或密码不正确，请返回重新输入 
<a href="login.jsp">返回登录页面</a>
</body>
</html>
