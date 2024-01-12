package com.tryPro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		TaxBlogs TB = new TaxBlogs();
		
		TB.setBlogsId(1);
		TB.setBlogsTitle("Tax Provider");
		TB.setBlogsDescription("This website is related to tax provider");
		TB.setPublishedDate("09-MAY-2023");
		
		transaction.begin();
		manager.persist(TB);
		transaction.commit();
		

	}

}
