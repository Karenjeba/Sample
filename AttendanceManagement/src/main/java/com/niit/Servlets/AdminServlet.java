package com.niit.Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.Models.Semester;
import com.niit.Service.AdminService;
import com.niit.Service.SemesterService;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("fname");
		String pwd = request.getParameter("fpwd");
		String email = request.getParameter("femail");
		String dob = request.getParameter("birthdate");
		String qual = request.getParameter("qualification");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("mobile");
		String city = request.getParameter("city");
		String addr = request.getParameter("faddress");
		AdminService admin = new AdminService();
		boolean b = admin.insertIntoFaculty(name, pwd, email, dob, gender, qual, city,addr,phone);
		if(b) {		
			request.getRequestDispatcher("/welcomeadmin.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("/addFaculty.jsp").forward(request, response);
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
