package com.niit.Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.Models.Faculty;
import com.niit.Models.Subject;
import com.niit.Service.AdminService;
import com.niit.Service.SubjectService;


@WebServlet("/AssignServlet")
public class AssignServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		SubjectService subject = new SubjectService();
		List<Subject> slist = subject.getAllSubjects();
		request.setAttribute("sublist", slist);
    	AdminService admin = new AdminService();
    	List<Faculty> flist = admin.getAllFaculty();
    	request.setAttribute("factlist", flist);
    	request.getRequestDispatcher("/assignSubjects.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int factID = Integer.parseInt(request.getParameter("faculty"));
		int subID = Integer.parseInt(request.getParameter("subject"));
		AdminService admin = new AdminService();
		SubjectService sub = new SubjectService();
		Subject subject = sub.getBySubjectID(subID);
		Faculty f = admin.getFacultyByID(factID);
		System.out.println("faculty "+f);
		boolean b = admin.updateFaculty(factID, subject);
		System.out.println("updated faculty");	
		if(b)
			request.getRequestDispatcher("/welcomeadmin.jsp").forward(request, response);
		else
			request.getRequestDispatcher("/assignSubjects.jsp").forward(request, response);
			
	}
}



