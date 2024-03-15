package com.hibernate.demo.hibernate_demo.crud_operations;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.demo.hibernate_demo.entities.Student;

public class DeleteStudent {
	public static boolean deleteStudentById(Session session, int id) {
		boolean isDeletionSuccessful = false;
		try {
			Student student = selectStudent.getStudent(session, id);
			if (student != null) {
				Transaction trx = session.beginTransaction();
				session.remove(student);
				trx.commit();
				isDeletionSuccessful= true; 
				System.out.println("Deletion Successful.");
			} else
				System.out.println("No such student in database to delete.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDeletionSuccessful;
	}
}
