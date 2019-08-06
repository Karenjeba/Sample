package com.niit.Servlets;

import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.niit.Service.SemesterService;
@WebServlet("/SemesterServlet")
public class SemesterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SemesterService semser = new SemesterService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String semName = request.getParameter("semname");
		int noofsub = Integer.parseInt(request.getParameter("noofsub"));
		String startdate = request.getParameter("startdate");
		String enddate = request.getParameter("enddate");
		//int duration = Integer.parseInt(request.getParameter("duration"));
		LocalDate start = LocalDate.parse(startdate);
		LocalDate end = LocalDate.parse(enddate);
		semser.insertIntoSemester(semName,noofsub,start,end);
		request.getRequestDispatcher("/welcomeadmin.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
