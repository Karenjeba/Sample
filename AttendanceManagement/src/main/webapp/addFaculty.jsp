<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.7.0/css/all.css' integrity='sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ' crossorigin='anonymous'>
<link rel="stylesheet" type="text/css" href="CSS/addfaculty.css">
<title>Faculty Page</title>
</head>
<body>
<jsp:include page="welcomeadmin.jsp" flush="true"></jsp:include>
<h1>Attendance Management System</h1>
 
<form action="AdminServlet" style="max-width:500px;margin:auto" method="post">
  <h2>Faculty Credentials</h2>
  <div class="input-container">
    <i class="fa fa-user icon"></i>
    <input class="input-field" type="text" placeholder="Full Name" name="fname">
  </div>

  <div class="input-container">
    <i class="fa fa-envelope icon"></i>
    <input class="input-field" type="text" placeholder="Email" name="femail">
  </div>
  
<div class="input-container">
    <i class="fas fa-key icon"></i>
    <input class="input-field" type="password" placeholder="Password" name="fpwd">
  </div>

  <div class="input-container">
    <i class="fas fa-home icon"></i>
    <input class="input-field" type="text" placeholder="Address" name="faddress">
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
    <i class="fas fa-graduation-cap icon"></i>
    <input class="input-field" type="text" placeholder="Qualification" name="qualification">
  </div>


<button type="button" class="btn">Back</button><button type="submit" class="btn">Add Faculty</button>
</form>
</body>
</html>