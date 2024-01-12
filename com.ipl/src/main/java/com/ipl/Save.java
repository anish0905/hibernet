package com.ipl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Ipl ipl = new Ipl();
		
		ipl.setNo(1);
		ipl.setName("CSK");
		ipl.setCaption("Dhoni");
		ipl.setPrice(5000000);
		
Ipl ipl1 = new Ipl();
		
		ipl1.setNo(2);
		ipl1.setName("CSK");
		ipl1.setCaption("Dhoni");
		ipl1.setPrice(5000000);
		
Ipl ipl2 = new Ipl();
		
		ipl2.setNo(3);
		ipl2.setName("CSK");
		ipl2.setCaption("Dhoni");
		ipl2.setPrice(5000000);	
		
Ipl ipl3 = new Ipl();
		
		ipl3.setNo(4);
		ipl3.setName("CSK");
		ipl3.setCaption("Dhoni");
		ipl3.setPrice(5000000);	
		
		transaction.begin();
		
		manager.persist(ipl);
		manager.persist(ipl1);
		manager.persist(ipl2);
		manager.persist(ipl3);
	
		transaction.commit();

	}

}
