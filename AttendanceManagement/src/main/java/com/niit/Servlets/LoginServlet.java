package com.niit.Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.niit.Models.Semester;
import com.niit.Service.AdminService;
import com.niit.Service.LoginService;
import com.niit.Service.SemesterService;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
	AdminService admin = new AdminService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		System.out.println("servlet "+uname+pwd);
		LoginService logser = new LoginService();
		String s = logser.checkForRole(uname, pwd);
		System.out.println("in login servlet"+s);	
		HttpSession session = request.getSession();
		session.setAttribute("username", uname);
		if(s.equals("admin"))
		{
			request.getRequestDispatcher("/welcomeadmin.jsp").forward(request, response);
		}
		else if(s.equals("faculty"))
		{
			request.getRequestDispatcher("/welcomefaculty.jsp").forward(request, response);
		}
		else
			request.getRequestDispatcher("/login.jsp").forward(request, response);	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
