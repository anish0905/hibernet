package com.hibernet;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
	public class Student{
		@Id
		private int no;
		private String name;
		private String email;
		private long number;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getNumber() {
			return number;
		}
		public void setNumber(long number) {
			this.number = number;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
	}




