package com.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Student student = manager.find(Student.class, 1);
		System.out.println(student.getId());
		System.out.println(student.getName());
		Subject subject =student.getSubject();
		
		
		System.out.println(subject);
		
//		Subject subject = manager.find(Subject.class, 1);
		System.out.println(subject.getSub_Id());
		System.out.println(subject.getName());
	
		
		
		

	}

}
