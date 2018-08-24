<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<html>
<head>
<title>View Your Sessions And Update Your Sessions</title>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body >
	<div align="center">
		<h2>Scheduled Sessions</h2>
		<table border="5" width="50%" cellpadding="4"> 
		<body style="background-color:#FFA07A;">
		 <tr><th>Session Name</th><th>Duration(Days)</th><th>Faculty</th><th>Mode</th></tr>
			 <c:forEach var="SchedulerSession" items="${schedule}">  
			<tr>
		
			<td>${ SchedulerSession.name} </td>
			<td>${SchedulerSession.duration}</td>
			<td>${SchedulerSession.faculty}</td>
			<td>${SchedulerSession.mode1}</td>
			<td><a href="enroll/${SchedulerSession.id}">Enroll Me</a></td>
			 </c:forEach>
			
		</table>
	</div>
</body>
</html>