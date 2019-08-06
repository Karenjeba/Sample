package com.niit.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.niit.Models.Semester;
import com.niit.Models.Student;

public class StudentDAO 
{
	DBConfig db = new DBConfig();
	SessionFactory sf = db.getSession();
	
	
	public void insertIntoStudent(String name,String email,String addr,String dob,String gender,String city,String phone,String pphone,String course,Semester semester)
	{
		Session session = sf.openSession();
		Student st = new Student();
		st.setStudentName(name);
		st.setStudentEmail(email);
		st.setStudentAddr(addr);
		st.setStudentdob(dob);
		st.setStudentGender(gender);
		st.setStudentCity(city);
		st.setStudentPhone(phone);
		st.setParentPhone(pphone);
		st.setCourse(course);
		st.setSemester(semester);
		session.beginTransaction();
		session.persist(st);
		session.getTransaction().commit();
		session.close();
	}
	
	public boolean update(Student student)
	{
		Session session = sf.openSession();
		session.beginTransaction();
		session.persist(student);
		session.getTransaction().commit();
		session.close();
		return true;
	}
	
	public List<Student> getAllStudents()
	{
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		Query<Student> q = session.createQuery("from Student");
		List<Student> slist = q.getResultList();
		session.close();
		return slist;
	}
	
	public List<Student> getStudentBySemester(Semester s)
	{
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		Query<Student> q = session.createQuery("from Student where semester = :semester");
		q.setParameter("semester", s);
		List<Student> slist = q.getResultList();
		session.close();
		return slist;
		
	}
	
	public List<Student> getStudentByName(String name)
	{
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		Query<Student> q = session.createQuery("from Student where studentName=:studentName");
		q.setParameter("studentName", name);
		List<Student> slist = q.getResultList();
		session.close();
		return slist;
		
	}
	
	public Student getStudentByID(int id)
	{
		Session session = sf.openSession();
		Student s = session.find(Student.class, id);
		session.close();
		return s;
	}
	
	
	
}
