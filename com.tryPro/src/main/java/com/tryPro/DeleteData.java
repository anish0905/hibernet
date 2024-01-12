package com.tryPro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteData {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
		
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		TaxBlogs tb = manager.find(TaxBlogs.class, 1);
		
		transaction.begin();
		manager.remove(tb);
		transaction.commit();
		
		
		
		
	}
	
	
}
