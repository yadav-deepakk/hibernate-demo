package com.hibernate.demo.hibernate_demo.crud_operations;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.demo.hibernate_demo.entities.Student;
import com.hibernate.demo.hibernate_demo.entities.StudentIdentityCard;

public class StudentRepo {
	// lazy loading
	public static Student loadStudent(Session session, int id) {
		return session.load(Student.class, id);
	}

	// eager loading
	public static Student getStudent(Session session, int id) {
		return session.get(Student.class, id);
	}

	public static StudentIdentityCard getStudentIdCardDetailsByStudentId(Session session, int studId) {
		Student student = getStudent(session, studId);
		if (student != null) {
			return student.getiCard();
		} else
			return null;
	}

	public static boolean insertStudents(Session session, Student[] students) {
		boolean isInsertionSucessful = false;
		try {
			Transaction trx = session.beginTransaction();
			for (Student student : students) {
				session.save(student);
			}
			trx.commit();
			isInsertionSucessful = true;
		} catch (Exception ex) {
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
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return isInsertionSucessful;
	}

	public static boolean updateStudentName(Session session, int id, String newName) {
		boolean isUpdateSuccessful = false;
		try {
			Student student = getStudent(session, id);
			if (student != null) {
				student.setStudentName(newName);
				insertStudent(session, student);
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
			Student student = getStudent(session, id);
			if (student != null) {
				student.setEmailId(newEmailId);
				insertStudent(session, student);
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
			Student student = getStudent(session, id);
			if (student != null) {
				student.setPhoneNo(newPhoneNumber);
				insertStudent(session, student);
				isUpdateSuccessful = true;
			} else
				System.out.println("No such student found in database.");

		} catch (Exception e) {
			System.out.println("some error in updation.");
			e.printStackTrace();
		}
		return isUpdateSuccessful;
	}

	public static boolean deleteStudentById(Session session, int id) {
		boolean isDeletionSuccessful = false;
		try {
			Student student = getStudent(session, id);
			if (student != null) {
				Transaction trx = session.beginTransaction();
				session.remove(student);
				trx.commit();
				isDeletionSuccessful = true;
				System.out.println("Deletion Successful.");
			} else
				System.out.println("No such student in database to delete.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDeletionSuccessful;
	}
}
