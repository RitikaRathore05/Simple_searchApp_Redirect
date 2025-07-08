<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>${ student }</h1>
<h1>Name is: ${student.name }</h1>
<h1>Id is: ${student.id }</h1>
<h1>DOB is: ${student.date }</h1>
<h1> courses is: ${student.courses } </h1>
<h1>type is: ${student.type }</h1>
<h1>gender is: ${student.gender }</h1>

<hr>

<h1>Address is : ${student.address.street }</h1>
</body>
</html>