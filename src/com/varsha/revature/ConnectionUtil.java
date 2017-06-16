package com.varsha.revature;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	  public static Connection getConnection() throws Exception {
	        Connection con = null;
	       try {
	             
	    	   Class.forName("com.mysql.jdbc.Driver");
	           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookapp_db", "root", "root");
	           System.out.println(con);
             
	        } catch (Exception e) {
	            throw new Exception(e);
	        }
	         
	        return con;
	 
	    }
	}
