package com.hibernate.demo.hibernate_demo.crud_operations;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.demo.hibernate_demo.entities.Student;

public class InsertStudent {
	public static boolean insertStudents(Session session, Student[] students) {
		boolean isInsertionSucessful = false; 
		try {
			Transaction trx = session.beginTransaction(); 
			for (Student student : students) {
				session.save(student);
			}
			trx.commit();
			isInsertionSucessful = true; 
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return isInsertionSucessful; 
	}

	public static boolean insertStudent(Session session, Student student) {
		boolean isInsertionSucessful = false; 
		try {
			Transaction trx = session.beginTransaction(); 
			session.save(student);
			trx.commit();
			isInsertionSucessful = true; 
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return isInsertionSucessful; 
	}
}
