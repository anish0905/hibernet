package com.ipl;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ipl {
	@Id
	int no;
	String name;
	String caption;
	int price;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Ipl() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Ipl [no=" + no + ", name=" + name + ", caption=" + caption + ", price=" + price + "]";
	}
	
	
	
	

}
