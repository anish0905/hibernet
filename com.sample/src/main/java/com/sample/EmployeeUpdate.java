package com.sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeUpdate {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
//		save and perform operation
		Employee employee =manager.find(Employee.class,1);
		employee.setName("Anish");
		transaction.begin();
		manager.merge(employee);
		transaction.commit();
		
	}

}
