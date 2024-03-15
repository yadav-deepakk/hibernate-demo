package com.hibernate.demo.hibernate_demo.crud_operations;

import org.hibernate.Session;
import com.hibernate.demo.hibernate_demo.entities.Student;

public class UpdateStudentDetails {
	public static boolean updateStudentName(Session session, int id, String newName) {
		boolean isUpdateSuccessful = false;
		try {
			Student student = selectStudent.getStudent(session, id);
			if (student != null) {
				student.setStudentName(newName);
				InsertStudent.insertStudent(session, student);
				isUpdateSuccessful = true;
			} else
				System.out.println("No such student found in database.");

		} catch (Exception e) {
			System.out.println("some error in updation.");
			e.printStackTrace();
		}
		return isUpdateSuccessful;
	}

	public static boolean updateStudentEmail(Session session, int id, String newEmailId) {
		boolean isUpdateSuccessful = false;
		try {
			Student student = selectStudent.getStudent(session, id);
			if (student != null) {
				student.setEmailId(newEmailId);
				InsertStudent.insertStudent(session, student);
				isUpdateSuccessful = true;
			} else
				System.out.println("No such student found in database.");

		} catch (Exception e) {
			System.out.println("some error in updation.");
			e.printStackTrace();
		}
		return isUpdateSuccessful;
	}

	public static boolean updateStudentPhoneNumber(Session session, int id, int newPhoneNumber) {
		boolean isUpdateSuccessful = false;
		try {
			Student student = selectStudent.getStudent(session, id);
			if (student != null) {
				student.setPhoneNo(newPhoneNumber);
				InsertStudent.insertStudent(session, student);
				isUpdateSuccessful = true;
			} else
				System.out.println("No such student found in database.");

		} catch (Exception e) {
			System.out.println("some error in updation.");
			e.printStackTrace();
		}
		return isUpdateSuccessful;
	}
}
