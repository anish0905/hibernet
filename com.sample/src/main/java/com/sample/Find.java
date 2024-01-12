package com.sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find {
public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
	EntityManager manager = factory.createEntityManager();
	
	EntityTransaction transaction =manager.getTransaction();
	
	Employee employee =manager.find(Employee.class,1);
	System.out.println(employee.getId());
	System.out.println(employee.getName());
	System.out.println(employee.getSalary());
	System.out.println(employee.getEmail());
	
	Employee employee2 =manager.find(Employee.class,2);
	System.out.println(employee2.getId());
	System.out.println(employee2.getName());
	System.out.println(employee2.getSalary());
	System.out.println(employee2.getEmail());
	
	System.out.println(employee);
	
}
}
