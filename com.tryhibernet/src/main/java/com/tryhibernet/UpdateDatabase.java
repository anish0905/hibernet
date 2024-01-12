package com.tryhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transection = manager.getTransaction();
		
		Demo demo = manager.find(Demo.class, 1);
		
		demo.setsSubject("jawaharlal");
		
		transection.begin();
		manager.merge(demo);
		transection.commit();
		
		
		

	}

}
