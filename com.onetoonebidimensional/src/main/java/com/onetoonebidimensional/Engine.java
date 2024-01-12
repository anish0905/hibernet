package com.onetoonebidimensional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Engine {
	@Id
private int ch_no;
private String brand;
	
	@OneToOne
	
	private Car car;

	public int getCh_no() {
		return ch_no;
	}

	public void setCh_no(int ch_no) {
		this.ch_no = ch_no;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
