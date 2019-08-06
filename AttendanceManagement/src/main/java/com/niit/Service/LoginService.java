package com.niit.Service;

import java.util.ArrayList;
import java.util.List;

import com.niit.DAO.LoginDAO;
import com.niit.Models.Login;
import com.niit.Models.Role;

public class LoginService 
{
	Role role;
	String uname,pwd;
	int roleid;
	LoginDAO logindao = new LoginDAO();
	List<Login> loglist = new ArrayList<>();
	public String checkForRole(String loginname,String loginpassword)
	{
		System.out.println("in service checkRole method");
		loglist = logindao.getLoginByName(loginname);
		System.out.println(loglist);
		for(Login l : loglist)
		{
			role = l.getRole();
			roleid = role.getRoleID();
			uname = l.getLoginName();
			pwd = l.getLoginPassword();
		}
		
		System.out.println(roleid+":"+roleid+loginname+loginpassword);
		if(roleid != 0)
		{
			if(uname.equals(loginname) && pwd.equals(loginpassword))
			{
				if(roleid==1)
					return "admin";
				else if(roleid==2)
					return "faculty";
				else
					return "error";
			}
			else
				return "error";
		}
		else
			return "error";
		
	}
	
	}
