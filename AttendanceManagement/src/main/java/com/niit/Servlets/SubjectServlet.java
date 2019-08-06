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
import com.niit.Service.SubjectService;


@WebServlet("/SubjectServlet")
public class SubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	SemesterService semser = new SemesterService();
    	List<Semester> list = semser.getAllSemesters();
    	request.setAttribute("semlist", list);
    	request.getRequestDispatcher("/addSubjects.jsp").forward(request, response);        	
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in subject servlet");
    	SubjectService subser = new SubjectService();
    	int semID = Integer.parseInt(request.getParameter("semesterName"));
    	Semester semester = subser.getBySemester(semID);
    	String subName = request.getParameter("subjectname");
    	subser.insertIntoSubject(subName, semester);    	    	
    	request.getRequestDispatcher("/welcomeadmin.jsp").forward(request, response);
	}

}
