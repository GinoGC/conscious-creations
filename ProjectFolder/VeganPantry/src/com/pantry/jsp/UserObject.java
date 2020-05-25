package com.pantry.jsp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserObject {
	

	private String username;
	PantryObject pantry;
	
	
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	
	public PantryObject getPantry() {
		return pantry;
	}
	public void setPantry(PantryObject input) {
		this.pantry = input;
	}
	
	
	
	//should be called after a new account is created. 
	public UserObject(String inputEmail, String inputPasswd, Connection conn){

		  PreparedStatement pstmt = null;
		  int pantryTemp[]; 
		  
		  try{
		         
		         //calls getConnection method to establish connection to MySQL server
		         //Connection conn = getConnection();
		         
		         String query = "SELECT * FROM users WHERE email = '" + inputEmail + 
		        		 					"' AND Passwd = '" + inputPasswd + "';";
		        		 
		      
		         
		         pstmt = conn.prepareStatement(query);
		         ResultSet rs = pstmt.update();
		         if(rs.next()) {
		        	 
		        	 //needs to retrieve values for username and int[]
		        	 this.username = rs.getString(username);
		        	 
		        	 }
		         

		       } catch (SQLException e) { 
		         System.out.println("rowExists Failed to Execute");
		         e.printStackTrace();
		       } finally {
		        	 try {
		        		 if (pstmt != null) {
		        			 pstmt.close();
		        		 }	 
		        	 }	
		        	 catch(SQLException e){
		        		 e.printStackTrace();
		        	 }
		           }
		  //return exists;
		
		
		
	}
	
	
}
