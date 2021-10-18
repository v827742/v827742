<%@page import="java.util.List"%>
<%@page import="com.login.cls.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<center>
<body>
<h1>Edit data from register table</h1>
<form action="update">
<table border="2">

<tr>
<th>UserId</th>
<th>Password</th>
<th>name</th>
<th>address</th>
<th>Email</th>
</tr>

<tr>
<%Register r=(Register)request.getAttribute("data");%>

<td><input type="hidden" name="userid" value="<%=r.getUserid()%>"><br></td>
<td><input type="password" name="pass" value="<%=r.getPass()%>"><br></td>
<td><input type="text" name="name" value="<%=r.getName()%>"><br></td>
<td><input type="text" name="Addr" value="<%=r.getAddr() %>"><br></td>
<td><input type="text" name="email" value="<%=r.getEmail()%>"><br></td>
</tr>



</table>
<input type="submit" value="update">
</form>
</body>
</html>