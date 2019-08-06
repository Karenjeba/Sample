<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Semester</title>
<link rel="stylesheet" type="text/css" href="CSS/semester.css">
</head>
<body>
<jsp:include page="welcomeadmin.jsp" flush="true"></jsp:include>
<form action = "SemesterServlet" method="post">
<div class="box">
<h1>Add Semester </h1>
Enter Semester Name  <input type = "text" name="semname"/>
Enter No of Subjects <input type = "text" name="noofsub"/>
Enter StartDate <input type = "date" name="startdate"/>
Enter EndDate <input type = "date" name="enddate"/>
<button class="button" type="Submit">Submit</button>
</div>
</form>
</body>
</html>