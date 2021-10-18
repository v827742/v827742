<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>success page</title>
<script type="text/javascript">
function update() {
	alert("Going for Update");
	document.operation.action="edit";
	document.operation.submit();
}
function delt() {
	alert("Going for delete");
	document.operation.action="delete";
	document.operation.submit();
}

</script>

</head>
<center>
<body bgcolor="silver">
<form name="operation">

<h1 align="center"><font color="red"> Employee Table </font></h1>
<table border="1" align="center"   bgcolor="white">
<tr>
<th>UserId</th>
<th>Password</th>
<th>name</th>
<th>address</th>
<th>Email</th>

</tr>

<c:forEach  items="${data }" var="s">

<tr>
<td><input type="radio" name="userid" value="${s.getUserid()}" >
 <c:out value="${ s.getUserid()}"></c:out></td>
 <td><c:out value="${s.getPass()}"></c:out></td>
<td><c:out value="${s.getName()}"></c:out></td>
<td><c:out value="${s.getAddr()}"></c:out></td>
<td><c:out value="${s.getEmail()}"></c:out></td>
</tr>

</c:forEach>

</table>

<input  type="button"  value="update" onclick="update()" >
<input type="button"  value="delete"  onclick="delt()" >
<a href="index.html">home page</a>

</form>
</body>
</html>