package com.ipl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAll {
	public static void main(String[] args) {
		

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	

	
	Query query = manager.createQuery("select i from Ipl i ");
	List<Ipl> a = query.getResultList();
	
	for(Ipl ipl:a)
	{
		System.out.println(ipl);
	}
	
	}	
}




