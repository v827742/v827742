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
<h1><font  color="red" align="center">successfully update data...</font> </h1>

<table border="1" align="center" >
<tr>
<th>UserId</th>
<th>Password</th>
<th>name</th>
<th>address</th>
<th>Email</th>

</tr>


<tr>
<%Register r=(Register)request.getAttribute("updatedata");%>

<td><%=r.getUserid()%><br></td>
<td><%=r.getPass()%><br></td>
<td><%=r.getName()%><br></td>
<td><%=r.getAddr() %><br></td>
<td><%=r.getEmail()%><br></td>
</tr>




</table>

</body>
</html>