<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All DATA OF Patient</title>
</head>
<body>
<form:form method="post" action="updation.do" modelAttribute="student">
<div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Patient</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Address</th>
                <th>Mobile Number</th>
                <th>Update</th>
                <th>Delete</th>
            </tr>
            <c:forEach var="stu" items="${listStu}">
                <tr>
                    <td><c:out value="${stu.id}" />${id}</td>
                    <td><c:out value="${stu.name}" />${name }</td>
                    <td><c:out value="${stu.address}" />${address }</td>
                    <td><c:out value="${stu.phone}" />${phone}</td>
                   <td> <a href="<c:url value="/upload.do?id=${stu.id}" />">Upload</a></td>
         <td> <a href="<c:url value="/delete.do?id=${stu.id}" />">Delete</a></td>
                </tr>
            </c:forEach>
            
        </table>
    </div>
   </form:form>
</body>
</html>