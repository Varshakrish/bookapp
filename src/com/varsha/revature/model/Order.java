package com.varsha.revature.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Order {
	private Integer id;
	private Integer quantity;
	private Integer userid;
	private Integer bookid;
	private String status;
	private LocalDateTime orderDate;

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", quantity=" + quantity + ", userid=" + userid + ", bookid=" + bookid + ", status="
				+ status + ", orderDate=" + orderDate + "]";
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserId(Integer userid) {
		this.userid = userid;
	}

	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}


}
