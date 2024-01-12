package com.Car;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Car {
	
	private String brand;
	private String color;
	private double cost;
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int number;
	public Car()
	{
		
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", cost=" + cost + ", number=" + number + "]";
	}
	public Car(String brand, String color, double cost) {
		super();
		this.brand = brand;
		this.color = color;
		this.cost = cost;
	}
	

}
