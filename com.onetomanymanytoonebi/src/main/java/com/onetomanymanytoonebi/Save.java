package com.onetomanymanytoonebi;

import java.util.Arrays;

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
		Bank bank = new Bank();
		bank.setId(1);
		bank.setName("hdfc");
		
		
		Account account = new Account();
		
		account.setNo(1234);
		account.setName("anishh");
		account.setBank(bank);
		
		
		Account account1 = new Account();
		account1.setNo(5647);
		account1.setName("amit");
		account1.setBank(bank);
		
		
		Account account2 = new Account();
		account2.setNo(9876);
		account2.setName("Shaurya");
		account2.setBank(bank);
		
		
		bank.setAccount(Arrays.asList(account,account1,account2));
		transaction.begin();
		manager.persist(account);
		manager.persist(account1);
		manager.persist(account2);
		manager.persist(bank);
		
		transaction.commit();
		
		

	}

}
