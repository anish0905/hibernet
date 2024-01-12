package com.sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trancation = manager.getTransaction();
		
	Employee employee =	manager.find(Employee.class,1);
	
	
	
	trancation.begin();
	manager.remove(employee);
	trancation.commit();

	}


}
