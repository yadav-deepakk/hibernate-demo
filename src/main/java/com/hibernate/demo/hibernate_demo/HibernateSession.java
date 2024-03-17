package com.hibernate.demo.hibernate_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSession {
	public static Session createSession() {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session;
	}

	public static boolean closeSession(Session session) {
		try {
			if (session != null)
				session.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false; 
		}
		return true; 
	}

}
