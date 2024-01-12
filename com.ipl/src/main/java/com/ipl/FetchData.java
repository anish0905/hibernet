package com.ipl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		Ipl ipl = manager.find(Ipl.class,1);
		
	System.out.println(ipl.getNo());
	System.out.println(ipl.getName());
	System.out.println(ipl.getCaption());
	System.out.println(ipl.getPrice());
		
		
		

	}
}