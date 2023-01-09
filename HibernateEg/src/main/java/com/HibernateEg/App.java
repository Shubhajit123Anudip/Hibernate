package com.HibernateEg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory s=new Configuration().configure().buildSessionFactory();
        //Configuration -activates hibernate framework
        //Configure-read both cfg files and mapping details
        //buildSessionFactory-from cfg object it takes jdbc information and create a jdbc connection
        
        Session ses=s.openSession();
        Transaction t=ses.beginTransaction();
        Student s1=new Student();
        s1.setStuId(101);
        s1.setStuFirstName("Shubhajit");
        s1.setStuLastName("Maji");
        s1.setStuEmail("Shubhajit23@gmail.com");
        s1.setStuPhone(986545567);
        s1.setStuAddr("Kolkata");
        s1.setStuFees(1230.00);
        //Session object is used to save the persistent object
        ses.save(s1);
        //transaction object to commit changes
        t.commit();
    }
}
