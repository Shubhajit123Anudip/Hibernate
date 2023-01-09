package com.HibernateEg1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	 SessionFactory e=new Configuration().configure().buildSessionFactory();
    	 Session ses=e.openSession();
         Transaction t=ses.beginTransaction();
         Employee e1=new Employee();
         e1.setEmpId(1);
         e1.setEmpFirstName("Shubhajit");
         e1.setEmpLastName("Maji");
         e1.setEmpPhoneNo(986545567);
         e1.setEmpSalary(12000.00);
         //Session object is used to save the persistent object
         ses.save(e1);
         //transaction object to commit changes
         t.commit();
     }
    }
