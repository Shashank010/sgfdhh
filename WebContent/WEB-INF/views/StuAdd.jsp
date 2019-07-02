<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Addition in record</title>
<style type="text/css">
.msg
 {
background-color:black;
	color: white;
	font-style: italic;
}
</style>
</head>

<body>
     <div align="center">
     
<form:form method="post" action="addition.do" modelAttribute="student">
Enter Patient Name: <form:input path="name"/>
<form:errors path="name" cssClass="msg" />
<br>
Enter Patient Address: <form:input path="address"/>
<form:errors path="address" cssClass="msg" />

<br>
Enter Patient Phone: <form:input path="phone"/>
<form:errors path="phone" cssClass="msg" />

<br><form:label path="course">Select Course:</form:label>
			<form:select path="course">
				<form:option value="">Select Course</form:option>
				<c:forEach items="${applicationScope.course}" var="cat">
					<form:option value="${cat}">${cat}</form:option>
				</c:forEach>
			</form:select>
			<form:errors path="course" cssClass="msg" />
			<br>

			<input type="submit" value="Add Patient">

		</form:form>
		</div>
</body>
</html>