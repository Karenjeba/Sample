package com.niit.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.niit.Models.Login;
import com.niit.Models.Role;

public class LoginDAO 
{
	DBConfig db = new DBConfig();
	private SessionFactory sf = db.getSession();
	Session session = sf.openSession();
	
	public List<Login> getLoginByName(String loginname)
	{	
		System.out.println(loginname);
		@SuppressWarnings("unchecked")
		Query<Login> q = session.createQuery("from Login where loginName = :loginName");
		q.setParameter("loginName", loginname);		
		List<Login> loglist = q.getResultList();
		System.out.println(loglist);
		session.close();
		return loglist;
	}

	public Login updateLogin(String factName, String factPassword) 
	{
		Login l = new Login();
		Role role = new RoleDAO().getRoleByID(2);
		l.setLoginName(factName);
		l.setLoginPassword(factPassword);
		l.setRole(role);
		session.beginTransaction();
		session.persist(l);
		session.getTransaction().commit();
		session.close();
		return l;
	}
	
	
}
