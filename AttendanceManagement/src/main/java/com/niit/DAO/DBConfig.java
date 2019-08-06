package com.niit.DAO;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.niit.Models.Attendance;
import com.niit.Models.Faculty;
import com.niit.Models.Login;
import com.niit.Models.Role;
import com.niit.Models.Semester;
import com.niit.Models.Student;
import com.niit.Models.Subject;

public class DBConfig 
{	 SessionFactory sessionFactory = null;		
	public SessionFactory getSession()
	{
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Login.class).addAnnotatedClass(Role.class)
				.addAnnotatedClass(Semester.class).addAnnotatedClass(Subject.class).addAnnotatedClass(Faculty.class)
				.addAnnotatedClass(Student.class).addAnnotatedClass(Attendance.class);
		StandardServiceRegistry registry = new  StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        sessionFactory = config.buildSessionFactory(registry); 
        return sessionFactory;
	}
}
