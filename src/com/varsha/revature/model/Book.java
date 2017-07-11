package com.varsha.revature.model;

import java.time.LocalDate;

public class Book {
	 private Integer id;
	 private String name;
	 private Integer price;
	 private String authorName;
	 private LocalDate publishedDate;
	  
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public LocalDate getpublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}
	
	
	 @Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", price=" + price + ", authorName=" + authorName
				+ ", publishedDate=" + publishedDate + "]";
	}


}
