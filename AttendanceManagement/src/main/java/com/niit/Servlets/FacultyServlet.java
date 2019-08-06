package com.niit.Servlets;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.niit.Models.Faculty;
import com.niit.Models.Student;
import com.niit.Models.Subject;
import com.niit.Service.AdminService;
import com.niit.Service.AttendanceService;
import com.niit.Service.StudentService;
@WebServlet("/FacultyServlet")
public class FacultyServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{		
		StudentService ser = new StudentService();
		HttpSession session = request.getSession();
		String factname = (String)session.getAttribute("username");
		List<Student> student = ser.getFacultyOfStudent(factname);
		request.setAttribute("studentList", student);
		request.getRequestDispatcher("/viewStudents.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		String [] students = request.getParameterValues("check");
		int studentId = 0;
		String d = request.getParameter("dateatt");
		LocalDate date = LocalDate.parse(d);
		System.out.println(students.toString());
		DayOfWeek satsun = date.getDayOfWeek();
		System.out.println(satsun);
		HttpSession session = request.getSession();
		String factname = (String)session.getAttribute("username");
		AdminService admin = new AdminService();
		List<Faculty> fact = admin.getFactByName(factname);
		Subject sub = new Subject();
		
		for(String s: students)
		{
			studentId = Integer.parseInt(s);
			StudentService student = new StudentService();
			System.out.println("in for loop");
			Student st = student.getStudentById(studentId);
			System.out.println(st.getSemester().getStartDate());
			//List<Student> slist = stdao.getStudentByName(s);
			//for(Student st : slist)
			//{
			
				if(date.isBefore(st.getSemester().getStartDate()) && date.isAfter(st.getSemester().getEndDate()) && satsun.name().equals("Sunday"))
				{
					System.out.println("invalid date to mark attendance");
					//request.getRequestDispatcher("/errorpage.jsp").forward(request,response);
				}
				else
				{
					//insert into attendance table
					for(Faculty f: fact)
					{
					sub = f.getSubject();
					String pora = "Y";
					AttendanceService attendance = new AttendanceService();
					attendance.insertAttendance(date, pora, f, st, sub);
					}
					request.getRequestDispatcher("/welcomefaculty.jsp").forward(request,response);
				}
			//}
			//get the start and end date from semester table
			//if attendance date is not between this, and if it is saturday or sunday msg--> cant mark attendance
			//check if first entry, if yes insert into the attendance table else update the table
			//update in attendance table
			
		}
	
	}

}
