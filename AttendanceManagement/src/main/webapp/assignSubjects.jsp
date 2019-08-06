<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel='stylesheet' href = "CSS/dropdowns.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<meta charset="ISO-8859-1">
<title>Assign Subjects</title>
</head>
<body>
<jsp:include page="welcomeadmin.jsp" flush="true"></jsp:include>
<div class="form">
<form action="AssignServlet" method = "Post">
<h1>Assign Subject to Faculty</h1>
<div>
Select Subject :
<select name="subject" id="sub">
 <c:forEach items="${sublist}" var="s">
		<option value="${s.subId}">${s.subName}</option>
</c:forEach>
</select>
</div>
<div>
Select Faculty :   
<select name="faculty" id="fac">
 <c:forEach items="${factlist}" var="fact">
		<option value="${fact.facultyID}">${fact.factName}</option>
</c:forEach>
</select>
</div>
<div>
<button class="w3-button w3-blue-grey w3-round-xlarge"type="submit">Assign Subject</button>
</div>
</form>
</div>
</body>
</html>