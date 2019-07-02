<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body bgColor="cyan">
  <form:form action="loginMatch.do" method="POST" modelAttribute="login">
<div align="center">
<table>
<tr>
<td> Enter User Name:</td>
<td><input type="text" name="txtName" /></td>
</tr>
<tr>
<td>Enter Password:</td>
<td><input type="password" name="txtPwd" /></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Login to Acess Library Management System" /></td>
</tr>
</table>

</div>
</form:form>
</body>
</html>