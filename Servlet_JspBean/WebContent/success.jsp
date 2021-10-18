<jsp:useBean id="data" class="com.cjc.model.Student" scope="request"/>
<html>
<head>

<title>success page</title>
</head>
<body>
<h1>success page</h1>

Roll No:${data.rollno}

<br>

Name: ${data.name}
<br>
Address:${data.addr}


</body>
</html>
