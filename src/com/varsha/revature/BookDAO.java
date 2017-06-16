package com.varsha.revature;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	public void addBook(Book user) throws Exception {
		String sql = "insert into book8(name ,price,author_name,published_date)values(?,?,?,?)";
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, user.getName());
		pst.setInt(2, user.getPrice());
		pst.setString(3, user.getAuthor_name());
		pst.setDate(4, Date.valueOf(user.getPublished_date()));

		int rows = pst.executeUpdate();
		System.out.println(rows);
		System.out.println("booksDAO->register:" + user);

	}

	public List<Book> listbook() throws Exception {
		Connection con = ConnectionUtil.getConnection();
		String sql = "select id,name,author_name,published_date,price from book8";
		PreparedStatement pst = con.prepareStatement(sql);
		List<Book> booklist = new ArrayList<Book>();
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int price = rs.getInt("price");
			String author_name = rs.getString("author_name");
			Date published_date = rs.getDate("published_date");
			
			//store the column data in a object
			Book b = new Book();
			b.setId(id);
			b.setName(name);
			b.setPrice(price) ;
			b.setAuthor_name(author_name);
			b.setPublished_date(published_date.toLocalDate());
			
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