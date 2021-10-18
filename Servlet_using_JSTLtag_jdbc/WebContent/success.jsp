<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
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
		
			<c:forEach items="${ data}" var="list">
			<tr>
				<td><c:out value="${list.getUserid() }"></c:out></td>
				<td><c:out value="${ list.getPass()}"></c:out></td>
				<td><c:out value="${ list.getName()}"></c:out></td>
				<td><c:out value="${ list.getAddr()}"></c:out></td>
				<td><c:out value="${ list.getEmail()}"></c:out></td>
				</tr>
			</c:forEach>
		








	</table>

</body>
</html>