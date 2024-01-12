package com.onetomany;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Student {
	@Id
	private int id;
	private String name;
	@OneToMany
	private List<Laptop>Laptop;
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
	public List<Laptop> getLaptop() {
		return Laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		Laptop = laptop;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}

