package com.pantry.jsp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Arrays;

public class PantryDB{
	  
	  private String url; //URL for database connection
	  private String username;
	  private String pass;
	         
	    
	  
	    
	  public boolean authenticate(String inputEmail, String inputPass) throws Exception{
		  PreparedStatement pstmt = null;
		  String userPass = null;
		  boolean authenticated = false;
		  Connection conn = null;
		  
		  
		  //if null value entered for email
		  if(inputEmail == null) {
			  System.out.println("email cannot be null");
		  }
		  
		  //if a value other than null is entered for email
		  else {
			  try{
				
				  
				  //calls getConnection method to establish connection to MySQL server
				  conn = getConnection();
			         
			      String selectQuery = "SELECT * From users WHERE email = '" + inputEmail + "';";
			         
			      //if an entry exists for the given email
			      if(checkExists(selectQuery, conn)) {
			        	 pstmt = conn.prepareStatement(selectQuery);
			        	 ResultSet rs = pstmt.executeQuery();
				         
			        	 //returns users password form database
			        	 userPass = getValue(rs, "passwd");

			    		 
			             //determines if the entered password matches the database password for the user
			             if (inputPass.equals(userPass)) { 
			            	 authenticated = true;
			             }

			      }
			  
			         
			      else {//executes if no user is found with the entered email address
			        	
			    	  System.out.println("Invalid email or password"); 
			         
			      }
			         //System.out.println("addUser Executed Successfully");
			         
			         
			  } catch (SQLException e) { 
			         System.out.println("addUser Failed to Execute");
			         e.printStackTrace();
			         } finally {
			        	 try {
			        		 if (pstmt != null) {
			        			 pstmt.close();
			        		 }	 
			        		 if (conn !=null) {
			        			 conn.close();
			        		 }
			        	 }	
			        	 catch(SQLException e){
			        		 e.printStackTrace();
			        	 }
			           } 
			  }
		  return authenticated;
	  }
	  
	  
	  
	  
	  //accepts a result set and column name as parameters and returns a single value
	  public String getValue(ResultSet rs, String column) throws Exception{
		  String pass = null;
		  
		  if(rs.next()) {
			  
			  pass = rs.getString(column);
		  }
		  return pass;
	  }
	  
	  
	  
	  
	  // This method adds a new user to the database after making sure they aren't already in the database.
	  public String addUser(String email) throws Exception {
	       
		  PreparedStatement stmt = null;
		  String output = null;
		  Connection conn = null;
		  
		  if(email == null) {
			  output = "cannot be null";
		  }
		  
		  else {
			  try{
			         
			         //calls getConnection method to establish connection to MySQL server
			         conn = getConnection();
			         
			         String selectQuery = "SELECT * From users WHERE email = '" + email + "';";
			         
			         if(checkExists(selectQuery, conn)) {
			        	 
			        	 //This executes if there is already a user with the specified email in the database.
			        	 //There should be code here which would ask if the user forgot there username or password
			        	 output = "User already exists. [Reset password?]";
			         }
			         
			         else {
			        	//this next line executes the SQL code within the quotes using connector J
				         String updateQuery = "INSERT INTO Users(email)" + "VALUES('" + email + "')";
			        	 stmt = conn.prepareStatement(updateQuery);
				         stmt.executeUpdate();
				         output = "User has been added :D";
			         }
			         //System.out.println("addUser Executed Successfully");
			         
			         
			       } catch (SQLException e) { 
			         System.out.println("addUser Failed to Execute");
			         e.printStackTrace();
			       } finally {
			        	 try {
			        		 if (stmt != null) {
			        			 stmt.close();
			        		 }	 
			        		 if (conn !=null) {
			        			 conn.close();
			        		 }
			        	 }	
			        	 catch(SQLException e){
			        		 e.printStackTrace();
			        	 }
			           } 
		  } return output;
	    }
	 
	  
	  
	  
	  //Checks whether a specific acrow exists in a database or not
	  public boolean checkExists(String query, Connection conn) throws Exception{
		  
		  boolean exists = false;
		  PreparedStatement pstmt = null;
		  
		  try{
		         
		         //calls getConnection method to establish connection to MySQL server
		         //Connection conn = getConnection();
		         
		         
		         
		         pstmt = conn.prepareStatement(query);
		         ResultSet rs = pstmt.executeQuery();
		         if(rs.next()) {
		        	 //System.out.println("already exists");
		        	 exists = true;
		        	 return exists;
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
		  return exists;
	  }
	  
	  
	  
	  
	// Establishes database connection. This is used in every other method
		  public Connection getConnection() throws Exception {
		       try{
		         
		         Connection conn = DriverManager.getConnection(this.url, this.username, this.pass);
		    
		         //if this prints the connection succeeded
		         System.out.println("Connection sucessful");
		         
		         return conn;
		         
		       } catch (SQLException e) { 
		         System.out.println("Connection failed");
		         e.printStackTrace();
		         return null;
		       }
		  }
	  
	  
	  
	  
	  //constructor method
	  public PantryDB(String url, String username, String pass){
	    this.url = url;
	    this.username = username;
	    this.pass = pass;
	  }
	  
	  
	  
	// overloaded constructor method which auto initializes to VeganPantry Database
	  public PantryDB(){
	    this.url = "jdbc:mysql://localhost:3306/VeganPantry";
	    this.username = "root";
	    this.pass = "H3ll@D@t@2020";
	  }
	  
	  
	}


	    

