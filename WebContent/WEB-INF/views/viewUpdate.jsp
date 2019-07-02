<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body bgColor="cyan">
   <div align="center">
     
<form:form method="post" action="updateId.do" modelAttribute="student">
Enter Id: <form:input path="id"/>
<br>
	<input type="submit" value="Register">

		</form:form>
		</div>

</body>
</html>