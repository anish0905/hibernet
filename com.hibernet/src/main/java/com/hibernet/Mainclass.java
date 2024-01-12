package com.hibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Mainclass {
	public static void main(String[] args, EntityTransaction transaction) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction1 = manager.getTransaction();
		
		Student student =new Student();
		student.setNo(1);
		student.setName("Anish");
		student.setEmail("anish@gmail.com");
		student.setNumber(7260858715L);
		
		
		transaction1.begin();
		manager.persist(student);
		transaction1.commit();
		
	
	
	
	}

}
