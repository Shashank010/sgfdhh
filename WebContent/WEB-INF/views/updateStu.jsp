<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student Record</title>
<style type="text/css">
.msg {
	color: red;
	font-style: italic;
}
</style>
</head>
<body>
     <div align="center">
     
<form:form method="post" action="updation.do" modelAttribute="student">
	 ID: ${stuid }<br>
	
	
	Enter Name: <form:input path="name"/>
	<form:errors path="name" cssClass="msg" value="${stu.name }"/><br>
	
	Enter Address: <form:input path="address" value="${stu.adress }"/>
	<form:errors path="address" cssClass="msg" /><br>

	Enter Phone: <form:input type="text" path="phone" value="${stu.phone }"/>
	<form:errors path="phone" cssClass="msg" /><br>
	
	<form:label path="course">Select Course:</form:label>
		<form:select path="course">
				<form:option value="">Select Course</form:option>
				<c:forEach items="${applicationScope.course}" var="cat">
					<form:option value="${cat}">${cat}</form:option>
				</c:forEach>
			</form:select>
			<form:errors path="course" cssClass="msg" />
			<br>

			<input type="submit" value="Update Student Record">

		</form:form>
		</div>
</body>
</html>