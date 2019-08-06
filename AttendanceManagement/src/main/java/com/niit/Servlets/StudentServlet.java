package com.niit.Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.Models.Semester;
import com.niit.Service.SemesterService;
import com.niit.Service.StudentService;
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		SemesterService semser = new SemesterService();
    	List<Semester> list = semser.getAllSemesters();
    	request.setAttribute("semlist", list);
    	request.getRequestDispatcher("/addStudent.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{		
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String birthdate = request.getParameter("birthdate");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		String mobile = request.getParameter("mobile");
		String pmobile = request.getParameter("pmobile");
		String course = request.getParameter("course");
		int sem = Integer.parseInt(request.getParameter("sem"));
		StudentService student = new StudentService();
		student.insertStudent(name, email, address, birthdate, gender, city, mobile, pmobile, course,sem);
		request.getRequestDispatcher("/welcomeadmin.jsp").forward(request,response);
	}

}
