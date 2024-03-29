package com.hibernate.demo.hibernate_demo.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.demo.hibernate_demo.entities.Course;
import com.hibernate.demo.hibernate_demo.entities.Student;

public class CourseRepo {
	// lazy Loading
	public static Course loadCourse(Session session, int courseId) {
		return session.load(Course.class, courseId);
	}

	// eager loading
	public static Course getCourse(Session session, int courseId) {
		return session.get(Course.class, courseId);
	}

	public static boolean insertCourses(Session session, Course[] courses) {
		boolean isInsertionSucessful = false;
		try {
			Transaction trx = session.beginTransaction();
			for (Course course : courses) {
				session.save(course);
			}
			trx.commit();
			isInsertionSucessful = true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return isInsertionSucessful;
	}

	public static boolean insertCourse(Session session, Course course) {
		boolean isInsertionSucessful = false;
		try {
			Transaction trx = session.beginTransaction();
			session.save(course);
			trx.commit();
			isInsertionSucessful = true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return isInsertionSucessful;
	}
	
	public static List<Student> getStudentListByCourseId(Session session, int courseId) {
		Course c  = getCourse(session, courseId);
		if (c != null) {
			return c.getStudents();
		} else {
			System.out.println("No such COURSE present into the database.");
			return null;
		}
	}
}
