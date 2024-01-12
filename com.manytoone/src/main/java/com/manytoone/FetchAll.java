package com.manytoone;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		Query query = manager.createQuery("Select s from Student s");
		
		List<Student>a= query.getResultList();
		for(Student student :a)
		{
			System.out.println(student);
		}
		
		
		
		
		

	}

}
