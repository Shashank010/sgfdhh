<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>search by id</title>
</head>
<body bgColor="cyan">
   <div align="center">
     
<form:form method="post" action="findId.do" modelAttribute="student">
Enter Id: <form:input path="id"/>
<br>
	<input type="submit" value="Register">

		</form:form>
		</div>

</body>
</html>