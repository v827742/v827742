<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="third">

First Data:<%=session.getAttribute("fd") %>
<br>
second data:<%=session.getAttribute("sd") %>
<br>
Third data:<input type="text" name="t3">

<input type="submit" value="ok">
</form>
</body>
</html>