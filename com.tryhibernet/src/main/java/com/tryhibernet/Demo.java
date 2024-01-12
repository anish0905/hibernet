package com.tryhibernet;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Demo {
	@Id
	int sId;
	String sName;
	String sCollege;
	int sMock;
	String sSubject;
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsCollege() {
		return sCollege;
	}
	public void setsCollege(String sCollege) {
		this.sCollege = sCollege;
	}
	public int getsMock() {
		return sMock;
	}
	public void setsMock(int sMock) {
		this.sMock = sMock;
	}
	public String getsSubject() {
		return sSubject;
	}
	public void setsSubject(String sSubject) {
		this.sSubject = sSubject;
	}
	public String toString()
	{
		return sId + sCollege+sMock+sName+sSubject;
		
	}
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
