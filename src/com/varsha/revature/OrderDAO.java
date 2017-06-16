package com.varsha.revature;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {
	public void bookOrder(Order order) throws Exception {
		String sql = "insert into order1 (userid,bookid,quantity) values (?,?,?)";
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, order.getUserid());
		pst.setInt(2, order.getBookid());
		pst.setInt(3, order.getQuantity());
		

		int rows = pst.executeUpdate();
		System.out.println(rows);
		System.out.println("OrderDAO->bookOrder:" + order);
	}
	public List<Order> listorder() throws Exception {
		Connection con = ConnectionUtil.getConnection();
		String sql = "select userid,bookid,quantity,status,orderdate from order1";
		PreparedStatement pst = con.prepareStatement(sql);
		List<Order> orderlist = new ArrayList<Order>();
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			int userid = rs.getInt("userid");
			int bookid = rs.getInt("bookid");
			int quantity = rs.getInt("quantity");
			String status=rs.getString("status");
			Timestamp orderdate=rs.getTimestamp("orderdate");
			
			
			
			//store the column data in a object
Order a = new Order();
			a.setUserId(userid);
			a.setBookid(bookid);
			a.setQuantity(quantity);
			a.setStatus(status);
			a.setOrderDate(orderdate.toLocalDateTime());
		
			
			//store the object in a list
			orderlist.add(a);
		}
		System.out.println(orderlist);
		for (Order a : orderlist) {
			System.out.println(a);
		}
		
		return orderlist;

	}

}
