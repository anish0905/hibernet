package com.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trancation = manager.getTransaction();
		
		
		
		
		
		
		Student student = new Student();
		student.setRoll(1);
		student.setName("Dheeraj");
		
		Laptop laptop = new Laptop();
		laptop.setIp(1234555);
		laptop.setBrand("Hp");
		laptop.setCost(555555);
		
		student.setLaptop(laptop);
		
		
		
		trancation.begin();
		manager.persist(student);
		manager.persist(laptop);
		trancation.commit();

	}

}
