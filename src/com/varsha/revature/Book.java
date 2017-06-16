package com.varsha.revature;

import java.time.LocalDate;

public class Book {
	 private Integer id;
	 private String name;
	 private Integer price;
	 private String author_name;
	 private LocalDate published_date;
	  
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
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public LocalDate getPublished_date() {
		return published_date;
	}
	public void setPublished_date(LocalDate published_date) {
		this.published_date = published_date;
	}
	
	
	 @Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", price=" + price + ", author_name=" + author_name
				+ ", published_date=" + published_date + "]";
	}


}
