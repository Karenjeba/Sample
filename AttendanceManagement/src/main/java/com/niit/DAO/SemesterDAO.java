package com.niit.DAO;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.niit.Models.Semester;

public class SemesterDAO 
{
	DBConfig db = new DBConfig();
	Session session;
	public Semester getBySemID(int semid)
	{
		System.out.println("in getbysemiddao "+semid);
		SessionFactory sf = db.getSession();
		session = sf.openSession();
		System.out.println("session created ");
		Semester sem = session.find(Semester.class, semid);
		session.close();
		return sem;
	}
	public List<Semester> getBySemName(String semname)
	{
		SessionFactory sf = db.getSession();
		session = sf.openSession();
		@SuppressWarnings("unchecked")
		Query<Semester> q = session.createQuery("from Semester where semName= :semName");
		q.setParameter("semName", semname);		
		List<Semester> semlist = q.getResultList();
		System.out.println(semlist);
		session.close();
		return semlist;
	}
	public List<Semester> getAllSemesters()
	{
		SessionFactory sf = db.getSession();
		session = sf.openSession();
		@SuppressWarnings("unchecked")
		Query<Semester> q = session.createQuery("from Semester");
		List<Semester> semlist = q.getResultList();
		System.out.println(semlist);
		session.close();
		return semlist;
	}
	public void insertSemester(String semName,int noofsub,LocalDate start,LocalDate end)
	{
		SessionFactory sf = db.getSession();
		session = sf.openSession();
		System.out.println("from sem dao");
		Semester sem = new Semester();
		sem.setSemName(semName);
		sem.setNoofsubjects(noofsub);
		sem.setStartDate(start);
		sem.setEndDate(end);
		session.beginTransaction();
		session.persist(sem);
		session.getTransaction().commit();
		session.close();
	}
	public boolean updateSemester(Semester sem)
	{		
		session.beginTransaction();	
		session.update(sem);
		session.getTransaction().commit();
		session.close();
		return true;
		
		
	}
}
