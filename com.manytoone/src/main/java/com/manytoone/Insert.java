package com.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		
		Subject subject = new Subject();
		subject.setSub_Id(101);
		subject.setName("java");
		Student student = new Student();
		student.setId(1);
		student.setName("Anish");
		student.setSubject(subject);
		
		Student student1 = new Student();
		student1.setId(2);
		student1.setName("amit");
		student.setSubject(subject);
		
		transaction.begin();
		manager.persist(subject);
		manager.persist(student);
		manager.persist(student1);
		transaction.commit();
		
		
		

	}

}
