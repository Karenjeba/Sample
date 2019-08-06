package com.niit.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.niit.DAO.SemesterDAO;
import com.niit.Models.Semester;

public class SemesterService 
{
	public boolean insertIntoSemester(String semname,int noofsub,LocalDate start,LocalDate end)
	{		
		SemesterDAO semdao = new SemesterDAO();
		List<Semester> sem = semdao.getBySemName(semname);	
		System.out.println("from insert into service"+sem);
		if(sem.isEmpty())
		{
			semdao.insertSemester(semname,noofsub,start,end);
			return true;
		}
		else
			return false;
	}
	
	public List<Semester> getSemesterByName(String semname)
	{
		SemesterDAO semdao = new SemesterDAO();
		List<Semester> semlist = new ArrayList<>();
		semlist = semdao.getBySemName(semname);
		System.out.println(semlist);
		return semlist;
	}
	public List<Semester> getAllSemesters()
	{
		SemesterDAO semdao = new SemesterDAO();
		List<Semester> semlist = new ArrayList<>();
		semlist = semdao.getAllSemesters();
		System.out.println(semlist);
		return semlist;	
	}
	public void updateSemester(Semester sem)
	{
		
	}
	
	

}
