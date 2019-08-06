package com.niit.Service;


import java.util.List;

import com.niit.DAO.FacultyDAO;
import com.niit.DAO.SemesterDAO;
import com.niit.DAO.StudentDAO;
import com.niit.Models.Faculty;
import com.niit.Models.Semester;
import com.niit.Models.Student;


public class StudentService 
{
	public void insertStudent(String name,String email,String addr,String dob,String gender,String city,String phone,String pphone,String course,int semId)
	{
		StudentDAO sdao = new StudentDAO();
		SemesterDAO semdao = new SemesterDAO();
		System.out.println("semid is"+semId);
		Semester s = semdao.getBySemID(semId);
		System.out.println("Semester is "+s);
		sdao.insertIntoStudent(name, email, addr, dob, gender, city, phone, pphone, course,s);
	}
	
	public List<Student> getFacultyOfStudent(String factName)
	{
		FacultyDAO fdao = new FacultyDAO();
		Semester sem = new Semester();
		
		List<Faculty> flist = fdao.getByFacultyName(factName);
		for(Faculty fac : flist)
		{
			sem = fac.getSubject().getSemester();
		}
		System.out.println(sem);
		StudentDAO sdao = new StudentDAO();
		List<Student> s = sdao.getStudentBySemester(sem);
		return s;
		//select subject from faculty where factid=""
		//select semester from subject where subid=""
		//select all students from student where semid=""
	}
	
	public Student getStudentById(int id)
	{
		StudentDAO sdao = new StudentDAO();
		Student s = sdao.getStudentByID(id);
		return s;
	}
}
