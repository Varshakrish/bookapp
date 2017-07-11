package com.varsha.revature.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.varsha.revature.model.Book;
import com.varsha.revature.util.ConnectionUtil;

public class BookDAO {
	public void addBook(Book user) throws Exception {
		String sql = "insert into bookv(name ,price,authorName,publishedDate)values(?,?,?,?)";
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, user.getName());
		pst.setInt(2, user.getPrice());
		pst.setString(3, user.getAuthorName());
		pst.setDate(4, Date.valueOf(user.getpublishedDate()));

		int rows = pst.executeUpdate();
		System.out.println(rows);
		System.out.println("booksDAO->register:" + user);

	}

	public List<Book> listbook() throws Exception {
		Connection con = ConnectionUtil.getConnection();
		String sql = "select id,name,authorName,publishedDate,price from bookv";
		PreparedStatement pst = con.prepareStatement(sql);
		List<Book> booklist = new ArrayList<Book>();
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int price = rs.getInt("price");
			String authorName = rs.getString("authorName");
			Date publishedDate = rs.getDate("publishedDate");
			
			//store the column data in a object
			Book b = new Book();
			b.setId(id);
			b.setName(name);
			b.setPrice(price) ;
			b.setAuthorName(authorName);
			b.setPublishedDate(publishedDate.toLocalDate());
			
			//store the object in a list
			booklist.add(b);
		}
		System.out.println(booklist);
		for (Book b : booklist) {
			System.out.println(b);
		}
		
		return booklist;

	}
}