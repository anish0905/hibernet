package com.tryPro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchData {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		TaxBlogs Tb = manager.find(TaxBlogs.class, 1);
		System.out.println(Tb.getBlogsId());
		System.out.println(Tb.blogsTitle);
		System.out.println(Tb.blogsDescription);
		System.out.println(Tb.publishedDate);
		
		System.out.println(Tb);
		
		
		
		
		
		
		
		
	}

}
