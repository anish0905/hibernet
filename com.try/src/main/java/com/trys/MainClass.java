package com.trys;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transection = manager.getTransaction();
		
		Try t = new Try();
		t.setEmpNo(1);
		t.setEmpName("Anish");
		t.setEmpSal(250000);
		
		transection.begin();
		manager.persist(t);
		transection.commit();
		
		
		
		
	}

}
