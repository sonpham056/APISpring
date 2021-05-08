package com.APISpring.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory factory;
	static {
		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		try {
			return factory;
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public static void close() {
		factory.close();
	}
}
