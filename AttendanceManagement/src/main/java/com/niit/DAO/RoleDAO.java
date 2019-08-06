package com.niit.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.niit.Models.Role;

public class RoleDAO 
{
DBConfig db = new DBConfig();
SessionFactory sf = db.getSession();
Session session = sf.openSession();


public Role getRoleByID(int roleId)
{	
	Role role = session.get(Role.class,roleId);
	session.close();
	return role;
}
}
