<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Subjects</title>
<link rel="stylesheet" type="text/css" href="CSS/dropdowns.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script>
function getsemname()
{
	var k = document.getElementById("sem");
	  var keyval =k.options[k.selectedIndex].text;
	  console.log(keyval);
	  var s = document.getElementById("semester");
	    s.setAttribute('value',keyval);
}
var textbox = 0;
function addTextBox()
{
	textbox=textbox+1;
   var howmany = document.getElementById("sem").value;
   console.log(howmany);
   var k = document.getElementById("sem");
  var keyval =k.options[k.selectedIndex].text;
  console.log(keyval);
	var div = document.getElementById('textdiv');
    div.innerHTML="";
    for(var i =0 ;i<howmany;i++)
    {
        var newdiv = document.createElement('div');
    	newdiv.setAttribute('id','subText'+textbox);
     newdiv.innerHTML = 
    	 "Text "+textbox+":<input type='text' id='"+textbox +"' name='"+"sub"+textbox+"'/>'";
	div.appendChild(newdiv);
	}
    console.log(keyval);
    var s = document.getElementById("semester");
    s.setAttribute('value',keyval);
}
</script>
</head>
<body>
<jsp:include page="welcomeadmin.jsp" flush="true"></jsp:include>
<h1>Add Subjects to Semester </h1>
<form action="SubjectServlet" method="post">
<div class="form">
<label>Semesters</label>
<select name="semesterName" id="sem">
		<option selected >Select A Semester</option>
 <c:forEach items="${semlist}" var="sems">
 		<option value="${sems.semID}">${sems.semName}</option>
</c:forEach>
</select>
<div>
<label>Enter a Subject</label>
<input type="text" name ="subjectname"/></div>
<div id = "textdiv">
<input type ="hidden" id="semester" name ="semsubject"/>
<button class="w3-button w3-blue-grey w3-round-xlarge"type="submit">Add</button>
</div>
</div>
</form>
</body>
</html>