package com.tryhibernet;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
		
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transection = manager.getTransaction();
		
	       Query query =   manager.createQuery(" Select s  from Demo s ");
	       List<Demo>a =query.getResultList();
	       for(Demo demo:a)
	       {
	    	   System.out.println(demo);
	       }
		
		

	}

}
