package com.hibernate.demo.hibernate_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hibernate.demo.hibernate_demo.crud_operations.InsertStudent;
import com.hibernate.demo.hibernate_demo.entities.Student;

public class App {
	public static void main(String[] args) {
		// CRUD Operations 
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		// C - Create
		Student student1 = new Student("Deep Shah", "deep12@shah.com", 1234567121, 10);
		Student student2 = new Student("Tara Singh Rajpoot", "tarasingh@raajpoot.com", 1221221221, 10);
		Student student3 = new Student("Parth Singh", "parth@singh.com", 1341233459, 10);
		Student student4 = new Student("Ajeet Yadav", "ajjet@yadav.com", 1231441230, 10);
		Student[] studentArr = { student1, student2, student3, student4 }; 
		InsertStudent.insertStudents(session, studentArr); 
		
		// R - Read
		
		// U - Update
		
		// D - Delete

		session.close();
	}
}
