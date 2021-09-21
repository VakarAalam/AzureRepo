<%@page import="java.util.Date"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head><title>Server Status Page</title></head>
<body>
    
    <h2>
    ${msg}
    	<c:forEach var="emp" items="${list}">
    		<c:out value="${emp.empId}"/>
    		<c:out value="${e.empName}"/>
    		<c:out value="${e.role}"/><br/>
    	</c:forEach>
			
		</h2>
</body>
</html>