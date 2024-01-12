package com.sample;

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
	
//	List<Employee> a =manager.createQuery("Select s from Employee s").getResultList();   ///another type by using create to string method it is octomize way code
	
	Query query = manager.createQuery("select s from Employee s ");
	List<Employee> a = query.getResultList();
	
	for(Employee employee:a)
	{
		System.out.println(employee);
	}
	
	}	
}
