<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.7.0/css/all.css' integrity='sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ' crossorigin='anonymous'>
<link rel='stylesheet' href = "CSS/student.css">

</head>
<body>
<jsp:include page="welcomeadmin.jsp" flush="true"></jsp:include>
<h1>Attendance Management System</h1>
<form action="StudentServlet" method="post" >
  <h2>Add Student</h2>
  <div class="input-container">
    <i class="fa fa-user icon"></i>
    <input class="input-field" type="text" placeholder="Full Name" name="name">

  </div>

  <div class="input-container">
    <i class="fa fa-envelope icon"></i>
    <input class="input-field" type="text" placeholder="Email" name="email">
  </div>
  

  <div class="input-container">
    <i class="fas fa-home icon"></i>
    <input class="input-field" type="text" placeholder="Address" name="address">
  </div>

 <div class="input-container">
    <i class="fa fa-calendar icon"></i>
    <input class="input-field" type="date"  name="birthdate">

<i class="fa fa-venus-mars icon"></i>
 <select id="country" name="gender">
      <option value="select">Select the Gender</option>
      <option value="male">Male</option>
      <option value="female">Female</option>
      </select>
  </div>


  <div class="input-container">
    <i class="fa fa-institution icon"></i>
    <input class="input-field" type="text" placeholder="City" name="city">

  </div>

  <div class="input-container">
    <i class="fa fa-mobile icon"></i>
    <input class="input-field" type="text" placeholder="Phone Number" name="mobile">
  </div>

 <div class="input-container">
    <i class="fa fa-mobile icon"></i>
    <input class="input-field" type="text" placeholder="Parent Phone Number" name="pmobile">
  </div>

<div class="input-container">
<i class="fas fa-book-reader icon"></i>
<select id="Course" name="course">
      <option value="select">Select the Course</option>
      <option value="cs">Computer Science Engg</option>
      <option value="ec">Electrical and Communication Engg</option>
      <option value="Is">Information Science Engg</option>
</select>

<i class="fas fa-marker icon"></i>
<select id="sem" name="sem">      
      <c:forEach items='${semlist}' var="sems">
      	<option value='${sems.semID}'>${sems.semName}</option>
</c:forEach>
</select>

</div>

<button type="button" class="btn">Back</button><button type="submit" class="btn">Add Student</button>
</form>
</body>
</html>
