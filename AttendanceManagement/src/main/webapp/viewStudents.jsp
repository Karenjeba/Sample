<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Student Details</title>
<link rel="stylesheet" type="text/css" href="CSS/attendance.css">
</head>
<body>
<jsp:include page="welcomefaculty.jsp" flush="true"></jsp:include>
<form action="FacultyServlet" method="post">
<div class = "form" >
        <table border="1" id="students">
            <caption>List of Students</caption>
            <thead>
             <tr>
                <th>Name</th>
                <th>Attendance for the day</th>
                
             </tr>
             </thead>
             <tbody>
            <c:forEach var = "student" items = '${studentList}'>
            <tr>
                    <td><c:out value='${student.studentName}'/></td>
                    <td><input type ="checkbox" name="check" value='${student.studentID}'/></td>                  
                         
             </tr>
            </c:forEach>
            </tbody>
            <tfoot>
             <tr><td>Enter the date :</td>
             <td><input type="date" name="dateatt"/></td></tr>
            </tfoot>
           
        </table>
         <button type="Submit" class="btn btn1" >Submit</button>
         <button type="reset" class="btn btn2">Reset</button>
    </div>
</form>   
</body>
</html>