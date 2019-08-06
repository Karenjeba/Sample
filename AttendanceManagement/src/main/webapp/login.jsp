<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="CSS/login.css">
</head>
<body>
<div class="container">

<form action="LoginServlet" method='Post'>

<div class="box">
<h1>Login</h1>
    <label for="username"><b>Enter Username</b></label>
    <input type="text" name="username" />
    
    <label for="password"><b>Enter Password</b></label>
    <input type="password" name="password"/>
	    
    <button type="submit" class="btn">Login</button>
  
 </div>

</form>
 </div> 
</body>
</html>