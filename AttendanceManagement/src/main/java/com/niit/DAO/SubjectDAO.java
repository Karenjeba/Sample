package com.niit.DAO;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.niit.Models.Semester;
import com.niit.Models.Subject;

public class SubjectDAO 
{
	DBConfig db = new DBConfig();
	SessionFactory sf = db.getSession();
	Session session ;
	
	
	public void insertIntoSubject(String subName,Semester sem)
	{
		Subject subject = new Subject();
		session = sf.openSession();
		subject.setSubName(subName);
		subject.setSemester(sem);		
		System.out.println("from sub dao"+subject);
		session.beginTransaction();
		session.persist(subject);
		session.getTransaction().commit();	
		session.close();
	}
	public Subject getSubjectByID(int id)
	{
		System.out.println("id in method"+id);
		session = sf.openSession();
		Subject sub = session.find(Subject.class, id);
		session.close();
		return sub;
	}
	public boolean updateSubject(Subject subject)
	{	session = sf.openSession();
		session.beginTransaction();
		session.persist(subject);
		session.getTransaction().commit();
		session.flush();
		session.close();
		return true;
	}
	
	public List<Subject> getAllSubjects()
	{   
		session = sf.openSession();
		@SuppressWarnings("unchecked")
		Query<Subject> q = session.createQuery("from Subject");
		List<Subject> sublist = q.getResultList();
		System.out.println(sublist);
		session.close();
		return sublist;
	}
	
	
}
