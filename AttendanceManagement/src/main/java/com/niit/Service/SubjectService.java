package com.niit.Service;

import java.util.List;

import org.hibernate.query.Query;

import com.niit.DAO.SemesterDAO;
import com.niit.DAO.SubjectDAO;
import com.niit.Models.Semester;
import com.niit.Models.Subject;

public class SubjectService 
{
	public boolean insertIntoSubject(String subName,Semester sem)
	{
		System.out.println("in insert subject service");
		System.out.println(subName+" "+subName);
		System.out.println(subName+" "+sem);
		SubjectDAO subdao = new SubjectDAO();
		subdao.insertIntoSubject(subName, sem);
		return true;
	}	
	public Semester getBySemester(int semId)
	{		
		SemesterDAO semdao = new SemesterDAO();
		Semester semester = semdao.getBySemID(semId);
		System.out.println("in update subject dao "+semester);
		return semester;		
	}
	public Subject getBySubjectID(int subId)
	{
		System.out.println("subid is service"+subId);
		SubjectDAO sdao = new SubjectDAO();
		Subject sub = sdao.getSubjectByID(subId);
		return sub;
	}
	
	public List<Subject> getAllSubjects()
	{
		SubjectDAO subdao = new SubjectDAO();
		List<Subject> slist = subdao.getAllSubjects();
		System.out.println("from subjectdao service");
		System.out.println(slist);
		return slist;
	}
	
	public boolean updateSubject(Subject subject)
	{
		SubjectDAO subdao = new SubjectDAO();
		subdao.updateSubject(subject);
		return true;
	}
}
