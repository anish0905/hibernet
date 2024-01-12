package com.tryhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityManagerFactory  factory = Persistence.createEntityManagerFactory("anish");

EntityManager manager = factory.createEntityManager();

EntityTransaction transection = manager.getTransaction();

Demo demo = new Demo();

demo.setsId(2);
demo.setsName("nish");
demo.setsCollege("kalinga univerty");
demo.setsSubject("Programming");
demo.setsMock(1);

demo.setsId(1);
demo.setsName("sssnish");
demo.setsCollege("ssskalinga univerty");
demo.setsSubject("ssProgramming");
demo.setsMock(155);

transection.begin();
manager.persist(demo);
transection.commit();

	
	
	}

}
