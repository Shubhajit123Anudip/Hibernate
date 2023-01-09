package com.hibernate.hibernateCrud.DaoImpl;

import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.hibernateCrud.config.HibernateUtil;
import com.hibernate.hibernateCrud.entity.Student;

public class StudentDaoImpl {
public void addStudent() {
	Scanner sc=new Scanner(System.in);
	String n,d,e;
	long p;
	System.out.println("Enter name:");
	n=sc.nextLine();
	System.out.println("Enter Dept:");
	d=sc.nextLine();
	System.out.println("Enter email:");
	e=sc.nextLine();
	System.out.println("Enter phone:");
	p=sc.nextLong();
	
	Student s=new Student();
	s.setName(n);
	s.setDept(d);
	s.setEmail(e);
	s.setPhone(p);
	Session session=HibernateUtil.getSessionFactory().openSession();
	Transaction t=session.beginTransaction();
	session.save(s);
	t.commit();
}
public void updateStudent() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ID:");
	int id =sc.nextInt();
	Session session=HibernateUtil.getSessionFactory().openSession();
	Transaction t=session.beginTransaction();
	Student std=session.get(Student.class,id);
	System.out.println("Enter phone Number:");
	long phone =sc.nextLong();
	std.setPhone(phone);
	session.update(std);
	System.out.println("Update Successfully!!");
	t.commit();
}
public void deleteStudent() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ID:");
	int id=sc.nextInt();
	Session session=HibernateUtil.getSessionFactory().openSession();
	Transaction t=session.beginTransaction();
	Student std1=session.get(Student.class,id);
	session.delete(std1);
	System.out.println("Deleted Successfully!!");
	t.commit();
}
public void fetchStudent() {
	Scanner sc=new Scanner(System.in);
	int id;
	System.out.println("Enter Id:");
	id=sc.nextInt();
	Session session=HibernateUtil.getSessionFactory().openSession();
	Student s1=session.get(Student.class,id);
	System.out.println(s1.getId()+""+s1.getName()+""+s1.getDept()+""+s1.getEmail()+""+s1.getPhone());
}
}
