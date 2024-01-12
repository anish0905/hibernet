package com.onetoonebidimensional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {
	@Id
	
	private int no;
	private String brand;
	
	@OneToOne
	private Engine engine;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
