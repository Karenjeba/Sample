package com.niit.Service;

import java.util.List;

import com.niit.DAO.FacultyDAO;
import com.niit.DAO.LoginDAO;
import com.niit.Models.Faculty;
import com.niit.Models.Login;
import com.niit.Models.Subject;



public class AdminService 
{
	public boolean insertIntoFaculty(String factName,String factPassword,String factEmail,String dateofbirth,String gender,String qualification,String city,String address,String phone)
	{	
		System.out.println("from service");
		LoginDAO logindao = new LoginDAO();
		boolean flag = false;
		FacultyDAO fdao = new FacultyDAO();		
		Login login = logindao.updateLogin(factName, factPassword);
		flag = fdao.insertIntoFaculty(factName, factPassword, factEmail, dateofbirth, gender, qualification,city,address,phone,login);		
		System.out.println(flag);
		return flag;
		
	}
	
	public List<Faculty> getAllFaculty()
	{
		FacultyDAO fdao = new FacultyDAO();
		List<Faculty> list = fdao.getAllFaculty();
		System.out.println("from fac service list "+list);
		return list;
	}
	public List<Faculty> getFactByName(String name)
	{
		FacultyDAO fdao = new FacultyDAO();
		List<Faculty> list = fdao.getByFacultyName(name);
		System.out.println("from dao"+list);
		return list;
	}
	public boolean updateFaculty(int factId,Subject sub)
	{
		FacultyDAO fdao = new FacultyDAO();
		boolean res = fdao.updateFaculty(factId, sub);
		return res;
	}
	public Faculty getFacultyByID(int id)
	{
		FacultyDAO fdao = new FacultyDAO();
		Faculty fact = fdao.getFacultyByID(id);
		return fact;
	}
	
		
}
