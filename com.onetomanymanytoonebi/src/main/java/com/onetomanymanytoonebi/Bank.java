package com.onetomanymanytoonebi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {
	@Id
	private int id ;
	private String name;
	@OneToMany
	private List <Account> account;
	
	public void setAccount(List<Account> account) {
		this.account = account;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
