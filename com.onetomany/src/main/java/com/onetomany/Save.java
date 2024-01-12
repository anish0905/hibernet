package com.onetomany;



import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Student student = new Student();
		student.setId(1);
		student.setName("vikas");
		
		Laptop laptop = new Laptop();
		laptop.setIp(101);
		laptop.setBrand("hp");
		laptop.setCost(50000);
		
		Laptop laptop1 = new Laptop();
		laptop1.setIp(201);
		laptop1.setBrand("Samsung");
		laptop1.setCost(120000);
		
		ArrayList<Laptop> laptops = new ArrayList<>();
		laptops.add(laptop);
		laptops.add(laptop1);
		
		student.setLaptop(Arrays.asList(laptop,laptop1));
//		student.setLaptop(laptops);
		
		transaction.begin();
		manager.persist(student);
		manager.persist(laptop);
		manager.persist(laptop1);
		transaction.commit();
		
		


	}

}

