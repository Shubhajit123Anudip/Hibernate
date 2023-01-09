package com.HibernateEg1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

@Table (name="Employee_Info")
public class Employee {
	@Id
	private int EmpId;
	private String empFirstName,empLastName;
	private double empSalary;
	private long empPhoneNo;
}
