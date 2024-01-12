package com.onetoonebidimensional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("anish");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Car car = manager.find(Car.class,1);
		System.out.println(car.getNo());
		System.out.println(car.getBrand());
		
		Engine e = car.getEngine();
		System.out.println(e.getCh_no());
		System.out.println(e.getBrand());
		
		
		
		System.out.println("**************************************************************");
		
		Engine engine = manager.find(Engine.class, 101);
		
		System.out.println(engine.getCh_no());
		System.out.println(engine.getBrand());
		
		
		Car c = engine.getCar();
		System.out.println(c.getNo());
		System.out.println(c.getBrand());
		
		

	}

}
