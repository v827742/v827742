<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page errorPage="error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String n1=request.getParameter("no1"); %>
<%String n2=request.getParameter("no2"); %>

<% int a=Integer.parseInt(n1);%>
<% int b=Integer.parseInt(n2);%>

<% try{
int c=a/b; 
out.println("value is:="+c);
}
catch(ArithmeticException e)
{
	out.println("please enter non zero value");
}
%>
</body>
</html>