package com.sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction =manager.getTransaction();
		
		Employee employee = new Employee();
		
		employee.setId(1);
		employee.setName("john");
		employee.setEmail("johan@gmail.com");
		employee.setSalary(20000);
		
		Employee employee2 = new Employee();
		
		employee2.setId(2);
		employee2.setName("amit");
		employee2.setEmail("amit@gmail.com");
		employee2.setSalary(50000);
		
		transaction.begin();
		manager.persist(employee);
		manager.persist(employee2);

		transaction.commit();
		

	}

}
