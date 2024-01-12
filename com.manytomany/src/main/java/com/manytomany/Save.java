package com.manytomany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Buyers buyer = new Buyers(1,"anish");
		Buyers buyer1 = new Buyers(2,"amit");
		Buyers buyer2 = new Buyers(3,"anshu");
		
		List<Buyers> buyers = Arrays.asList(buyer,buyer1,buyer2);
		
		Brand brand = new Brand(27,"OMR",650,buyers);
		
		Brand brand1 = new Brand(28,"RedLabel",2400,buyers);
		
		Brand brand2 = new Brand(29,"Black and white",1850,buyers);
		
		transaction.begin();
		manager.persist(buyer);
		manager.persist(buyer1);
		manager.persist(buyer2);
		manager.persist(brand);
		manager.persist(brand1);
		manager.persist(brand2);
		
		transaction.commit();
		
		
		
				
	
	
	
	}

}
