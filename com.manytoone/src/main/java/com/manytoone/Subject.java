package com.manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Subject {
	@Id
	private int sub_Id;
	private String name;
	public int getSub_Id() {
		return sub_Id;
	}
	public void setSub_Id(int sub_Id) {
		this.sub_Id = sub_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
