package com.hibernate.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil { //util class
		public static Session activeSession() {//creating and returning session method
			SessionFactory sFactory=new Configuration().configure().buildSessionFactory();
			Session session =sFactory.openSession();
			return session; //returning the session
}}
