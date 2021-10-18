<!DOCTYPE html>

<%@page import="com.cjc.pojo.Student"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success page</title>
</head>
<body>
<h1> <font color="red">Success page</font></h1>
<br>
Welcome to success page......
<br>
<% Student stu=(Student)request.getAttribute("data"); %>
<br>
Roll No: <%=stu.getRollno() %>
<br>
Name: <%=stu.getName() %>
<br>
Address:<%=stu.getAddr() %>

</body>
</html>