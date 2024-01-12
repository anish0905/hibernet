package com.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Brand {
	@Id
	
	private int mfg_Id;
	private String name;
	private int price;
	
	@ManyToMany
	
	private List<Buyers>Buyer;
	 public Brand(int mfg_Id, String name, int price, List<Buyers> buyer) {
	        this.mfg_Id = mfg_Id;
	        this.name = name;
	        this.price = price;
	        this.Buyer = buyer;
	    }

	public int getMfg_Id() {
		return mfg_Id;
	}

	public void setMfg_Id(int mfg_Id) {
		this.mfg_Id = mfg_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Buyers> getBuyer() {
		return Buyer;
	}

	public void setBuyer(List<Buyers> buyer) {
		Buyer = buyer;
	}

	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
