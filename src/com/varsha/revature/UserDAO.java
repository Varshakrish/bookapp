package com.varsha.revature;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
	
     public void register(User user) throws Exception {
	
		//step 1: Get the connection
		Connection con = ConnectionUtil.getConnection();
		
		//step 2: SQL query
		String sql = "insert into users ( name, email, password) values ( ?, ? ,? )";
		
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, user.getName());
		pst.setString(2, user.getEmail());
		pst.setString(3, user.getPassword());
		
		
		//execute the query
		int rows = pst.executeUpdate();
		
		System.out.println("No of rows inserted:" + rows );
	}

	public User login(String email, String password) throws Exception {
		String sql = "select id,name,email from users where email = ? and password = ? ";
		User user = null;
		//step 1: Get the connection
		Connection con = ConnectionUtil.getConnection();
		
		PreparedStatement pst = con.prepareStatement(sql);
		
		ResultSet rs = pst.executeQuery();
		//while(rs.next()) {
		
		if(rs.next()) {
			
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String Email = rs.getString("email");
			String Password = rs.getString("password");

			//store the column values in a model object
			user = new User();
			user.setId(id);
			user.setName(name);
			user.setEmail(email);
			user.setPassword(password);
			
			
			
		}
		
		return user;
	}

}
