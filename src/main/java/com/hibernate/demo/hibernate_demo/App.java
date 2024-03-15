package com.hibernate.demo.hibernate_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.hibernate_demo.entities.Student;

public class App {
	public static void main(String[] args) {
		Student student1 = new Student("Deep Shah", "deep12@shah.com", 1234567121, 10);  
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory(); 
		Session session = sessionFactory.openSession(); 
		session.save(student1); 
		session.close();
	}
}
