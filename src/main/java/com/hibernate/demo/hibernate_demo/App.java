package com.hibernate.demo.hibernate_demo;

import org.hibernate.Session;
import com.hibernate.demo.hibernate_demo.crud_operations.*;
import com.hibernate.demo.hibernate_demo.entities.Student;

public class App {
	public static void main(String[] args) {
//		// CRUD Operations
//		Session session = HibernateSession.createSession();
//
//		// C - Create
//		Student student1 = new Student("Deep Shah", "deep12@shah.com", 1234567121, 10);
//		Student student2 = new Student("Tara Singh Rajpoot", "tarasingh@raajput.com", 1221221221, 10);
//		Student student3 = new Student("Parth Singh", "parth@singh.com", 1341233459, 10);
//		Student student4 = new Student("Ajeet Yadav", "ajjet@yadav.com", 1231441230, 10);
//		Student[] studentArr = { student1, student2, student3, student4 };
//		InsertStudent.insertStudents(session, studentArr);
//
//		// R - Read
//		Student stud1 = selectStudent.loadStudent(session, 1); // load - lazy loading
//		Student stud2 = selectStudent.getStudent(session, 2); // get - eager loading
//		System.out.println(stud1 + "\n" + stud2);
//
//		// U - Update
//		UpdateStudentDetails.updateStudentName(session, 2, "Tarasingh Rajpoot");
//		UpdateStudentDetails.updateStudentEmail(session, 1, "changed@email.com");
//		UpdateStudentDetails.updateStudentPhoneNumber(session, 4, 1999999999);
//
//		// D - Delete
//		DeleteStudent.deleteStudentById(session, 1);
//		DeleteStudent.deleteStudentById(session, 100);
//
//		HibernateSession.closeSession(session);
		
		Session session1 = HibernateSession.createSession();
		Student stud1 =  selectStudent.getStudent(session1, 3); 
		System.out.println(stud1);
		HibernateSession.closeSession(session1);
		
		Session session2 = HibernateSession.createSession();
		Student stud2 =  selectStudent.getStudent(session2, 3); 
		System.out.println(stud2);
		HibernateSession.closeSession(session1);

	}
}
