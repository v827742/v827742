<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>

<title>Success Page</title>
</head>
<body>
<h1>Success page</h1>
<table border="1">
		<tr>
			<th>Roll No</th>
			<th>Name</th>
			<th>Address</th>
		</tr>

		

			<c:forEach items="${data}" var="l">
               <tr>
				<td><c:out value="${l.rollno}"></c:out></td>
				<td><c:out value="${l.name}"></c:out></td>
				<td><c:out value="${l.addr }"></c:out></td>
				</tr>
			</c:forEach>

		




	</table>
</body>
</html>