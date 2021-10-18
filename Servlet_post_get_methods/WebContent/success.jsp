<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="D"%>
<html>

<head>
<title>login age</title>
</head>
<body>
<h1 align="center">fetch data successfully</h1>
<table border="1" align="center">
<tr>
<th>UserId</th>
<th>Password</th>
<th>Name</th>
<th>Address</th>
<th>Email</th>
</tr>
<D:forEach items="${data }" var="stu">
<tr>
<td><input type="radio"><D:out value="${stu.getUserid()}"></D:out></td>
<td><D:out value="${stu.getPass() }"></D:out></td>
<td><D:out value="${stu.getName() }"></D:out></td>
<td><D:out value="${stu.getAddr() }"></D:out></td>
<td><D:out value="${stu.getEmail() }"></D:out></td>
</tr>

</D:forEach>

</table>
<input type="submit" value="Update" >

<input type="submit" value="Delete">


</body>
</html>