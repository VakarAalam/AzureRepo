<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="cp" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Details</h1>
	
	
	<c:forEach var="emp" items="${list}">
		<c:out value="${emp.empId}"/>
		<c:out value="${emp.empName}"/>
	</c:forEach>
	
</body>
</html>