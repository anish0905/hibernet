package com.onetoonebidimensional;

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
//		
//Engine engine = new Engine();
//engine.setCh_no(101);
//engine.setBrand("Honda");
//
//
//Car car = new Car();
//car.setNo(1);
//car.setBrand("Lambo");



Car car=new Car();
car.setNo(1);
car.setBrand("BUGATTI");

Engine engine=new Engine();
engine.setCh_no(101);
engine.setBrand("Rolls Royce");

car.setEngine(engine);
engine.setCar(car);


		
		transaction.begin();
		manager.persist(engine);
		manager.persist(car);
		transaction.commit();
		

	}

}
