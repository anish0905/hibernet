package com.tryPro;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TaxBlogs {
	@Id
	
	int blogsId;
	String blogsTitle;
	String blogsDescription;
	String publishedDate;
	public int getBlogsId() {
		return blogsId;
	}
	public void setBlogsId(int blogsId) {
		this.blogsId = blogsId;
	}
	public String getBlogsTitle() {
		return blogsTitle;
	}
	public void setBlogsTitle(String blogsTitle) {
		this.blogsTitle = blogsTitle;
	}
	public String getBlogsDescription() {
		return blogsDescription;
	}
	public void setBlogsDescription(String blogsDescription) {
		this.blogsDescription = blogsDescription;
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	public TaxBlogs() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
