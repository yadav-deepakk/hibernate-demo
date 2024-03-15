package com.hibernate.demo.hibernate_demo.crud_operations;

import org.hibernate.Session;
import com.hibernate.demo.hibernate_demo.entities.Student;

public class selectStudent {
	// lazy loading
	public static Student loadStudent(Session session, int id) {
		return session.load(Student.class, id); 
	}
	
	// eager loading
	public static Student getStudent(Session session, int id) {
		return session.get(Student.class, id); 
	}

}
