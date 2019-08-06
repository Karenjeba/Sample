package com.niit.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.niit.Models.Faculty;
import com.niit.Models.Login;
import com.niit.Models.Subject;

public class FacultyDAO 
{
	DBConfig db = new DBConfig();
	SessionFactory sf = db.getSession();
	Session session = sf.openSession();
	
	public boolean insertIntoFaculty(String factName,String factPassword,String factEmail,String dateofbirth,String gender,String qualification,String city,String address,String phone,Login login)
	{
		Faculty fact = new Faculty();
		fact.setFactName(factName);
		fact.setFactAddr(address);
		fact.setDateOfBirth(dateofbirth);
		fact.setFactCity(city);
		fact.setFactEmail(factEmail);
		fact.setFactGender(gender);
		fact.setFactQual(qualification);
		fact.setFactPhone(phone);
		fact.setFactPwd(factPassword);
		fact.setLogin(login);
		session.beginTransaction();
		session.save(fact);
		session.getTransaction().commit();
		System.out.println("from dao");
		System.out.println(fact);	
		session.close();
		return true;
	}
	public List<Faculty> getByFacultyName(String factname)
	{
		@SuppressWarnings("unchecked")
		Query<Faculty> q = session.createQuery("from Faculty where factName = :factName");
		q.setParameter("factName", factname);
		List<Faculty> list = q.getResultList();
		session.close();
		return list;
	}
	
	public boolean updateFaculty(int factId,Subject subject)
	{
		session.beginTransaction();
		String query = "update Faculty set subject=:subject where facultyID=:factId";
		@SuppressWarnings("unchecked")
		Query<Faculty> q = session.createQuery(query);
		q.setParameter("subject", subject);
		q.setParameter("factId", factId);
		int result = q.executeUpdate();
		System.out.println("update "+result);
		session.getTransaction().commit();		
		session.close();
		if(result>0)
			return true;
		else 
			return false;
	}
	public List<Faculty> getAllFaculty()
	{
		@SuppressWarnings("unchecked")
		Query<Faculty> q = session.createQuery("from Faculty");
		List<Faculty> flist = q.getResultList();
		session.close();
		return flist;
	}
	
	public Faculty getFacultyByID(int factID)
	{
		Faculty f = session.find(Faculty.class, factID);
		session.close();
		return f;
	}
	
	
}
