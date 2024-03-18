package com.hibernate.demo.hibernate_demo.crud_operations;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.demo.hibernate_demo.entities.StudentIdentityCard;

public class StudentIdCardRepo {

	public static StudentIdentityCard loadStudentIdentityCard(Session session, int iCardNumber) {
		return session.load(StudentIdentityCard.class, iCardNumber);
	}

	public static StudentIdentityCard getStudentIdentityCard(Session session, int iCardNumber) {
		return session.get(StudentIdentityCard.class, iCardNumber);
	}

	public static boolean insertIdCard(Session session, StudentIdentityCard iCard) {
		boolean isSuccess = false;
		try {
			if (iCard != null) {
				Transaction trx = session.beginTransaction();
				session.save(iCard);
				trx.commit();
			}
			isSuccess = true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return isSuccess;
	}

	public static boolean insertIdCards(Session session, StudentIdentityCard[] iCards) {
		boolean isSuccess = false;
		try {
			if (iCards != null) {
				Transaction trx = session.beginTransaction();
				for (StudentIdentityCard iCard : iCards) {
					session.save(iCard);
				}
				trx.commit();
			}
			isSuccess = true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return isSuccess;
	}

	public static boolean deleteIdCardByIdCardNumber(Session session, int iCardNumber) {
		boolean isSuccess = false;
		try {
			StudentIdentityCard studentIdCard = getStudentIdentityCard(session, iCardNumber);
			if (studentIdCard != null) {
				Transaction trx = session.beginTransaction(); 
				session.remove(studentIdCard);
				trx.commit();
			} else {
				System.out.println("No such StudentIdentityCard present in database to ");
			}
			isSuccess = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}

}
