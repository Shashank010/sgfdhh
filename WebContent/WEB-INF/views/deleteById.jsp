<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Patient Record</title>
</head>
<body bgcolor="grey">
   <div align="center">
     
<form:form method="post" action="deleteId.do" modelAttribute="student">
Enter Id of student to delete record: <form:input path="id"/>
<br>
	<input type="submit" value="Delete Student Record">

		</form:form>
		</div>

</body>
</html>