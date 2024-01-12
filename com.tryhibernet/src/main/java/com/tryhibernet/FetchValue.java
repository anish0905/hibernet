package com.tryhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transection = manager.getTransaction();
		
		
		Demo demo = manager.find(Demo.class, 2);
		System.out.println(demo.sId);
		System.out.println(demo.sCollege);
		System.out.println(demo.sName);
		System.out.println(demo.sMock);
		System.out.println(demo.sSubject);
		
		System.out.println(demo);
		
		
		
		

	}

}
