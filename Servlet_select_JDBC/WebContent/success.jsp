<%@page import="com.cjc.model.Register"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>success page</title>
</head>
<body>
<h1 align="center"><font color="red">Congratulation Fetch your data from Register Table </font></h1>
<table border="3" align="center">
<tr>
<th>UserId</th>
<th>Password</th>
<th>name</th>
<th>address</th>
<th>Email</th>
</tr>
<tr>
<%List<Register> l=(List)request.getAttribute("data"); 

for(Register s:l)
{%>

<td><%=s.getUserid()%></td>
<td><%=s.getPass() %></td>
<td><%=s.getName()%></td>
<td><%=s.getAddr() %></td>
<td><%=s.getEmail() %></td>
</tr>
<%} %>








</table>

</body>
</html>