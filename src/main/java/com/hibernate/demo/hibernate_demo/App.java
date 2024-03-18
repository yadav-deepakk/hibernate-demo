package com.hibernate.demo.hibernate_demo;

import java.time.*;

import org.hibernate.Session;
import com.hibernate.demo.hibernate_demo.crud_operations.*;
import com.hibernate.demo.hibernate_demo.entities.Student;
import com.hibernate.demo.hibernate_demo.entities.StudentIdentityCard;

public class App {
	public static void main(String[] args) {
//		// CRUD Operations
//		Session session = HibernateSession.createSession();

//		// C - Create
//		Student student1 = new Student("Deep Shah", "deep12@shah.com", 1234567121, 10);
//		Student student2 = new Student("Tara Singh Rajpoot", "tarasingh@raajput.com", 1221221221, 10);
//		Student student3 = new Student("Parth Singh", "parth@singh.com", 1341233459, 10);
//		Student student4 = new Student("Ajeet Yadav", "ajjet@yadav.com", 1231441230, 10);
//		Student[] studentArr = { student1, student2, student3, student4 };
//		InsertStudent.insertStudents(session, studentArr);

//		// R - Read
//		Student stud1 = selectStudent.loadStudent(session, 1); // load - lazy loading
//		Student stud2 = selectStudent.getStudent(session, 2); // get - eager loading
//		System.out.println(stud1 + "\n" + stud2);

//		// U - Update
//		UpdateStudentDetails.updateStudentName(session, 2, "Tarasingh Rajpoot");
//		UpdateStudentDetails.updateStudentEmail(session, 1, "changed@email.com");
//		UpdateStudentDetails.updateStudentPhoneNumber(session, 4, 1999999999);

//		// D - Delete
//		DeleteStudent.deleteStudentById(session, 1);
//		DeleteStudent.deleteStudentById(session, 100);

//		HibernateSession.closeSession(session);

//		// checking L2 cache
//		Session session1 = HibernateSession.createSession();
//		Student stud1 = selectStudent.getStudent(session1, 3);
//		System.out.println(stud1);
//		HibernateSession.closeSession(session1);
//
//		Session session2 = HibernateSession.createSession();
//		Student stud2 = selectStudent.getStudent(session2, 3);
//		System.out.println(stud2);
//		HibernateSession.closeSession(session1);

//		// Entity relationships
		Session session = HibernateSession.createSession();
//		Student student1 = new Student("Deepkamal Singh", "deep12@kamal.com", 1234567121, 10);
//		Student student2 = new Student("Suraj Gupta", "suraj23@gupta.com", 1221221221, 10);
//		StudentIdentityCard studentICard1 = new StudentIdentityCard(LocalDate.of(2023, 06, 23), 1);
//		StudentIdentityCard studentICard2 = new StudentIdentityCard(LocalDate.of(2023, 07, 11), 1);
//		student1.setiCard(studentICard1);
//		student2.setiCard(studentICard2);
//		StudentIdCardRepo.insertIdCards(session, new StudentIdentityCard[] { studentICard1, studentICard2 });
//		StudentRepo.insertStudents(session, new Student[] { student1, student2 });
//		HibernateSession.closeSession(session);

		StudentIdentityCard idCard = StudentIdCardRepo.getStudentIdentityCard(session, 1);
		System.out.println(idCard);
		HibernateSession.closeSession(session);

	}
}
