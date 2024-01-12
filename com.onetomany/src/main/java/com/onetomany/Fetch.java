package com.onetomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction  transection = manager.getTransaction();
		
		Student student = manager.find(Student.class,1);
		System.out.println(student.getId());
		System.out.println(student.getName());
		
		List<Laptop>laptops = student.getLaptop();
		for(Laptop l : laptops)
		{
			
			System.out.println(l.getIp());
			System.out.println(l.getBrand());
			System.out.println(l.getCost());
			
		}
		
		
		
	}

}
