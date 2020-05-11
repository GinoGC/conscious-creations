package com.pantry.jsp;
import java.sql.*;

public class PantryDB{
	  
	  private String url; //URL for database connection
	  private String username;
	  private String pass;
	         
	    
	  
	  
	  
	  // This method adds a new user to the database. It should search for the users email in the database. If 
	  //the email already exists, the user will be prompted to login to their existing account. If the email
	  //does not already exist, the user will be added to the database.
	  public void addUser(String email, String username) throws Exception {
	       try{
	         
	         //calls getConnection method to establish connection to MySQL server
	         Connection conn = getConnection();
	         
	         String checkExists = "SELECT * From users WHERE email = '" + email + "';";
	         
	         if(rowExists(checkExists)) {
	        	 
	        	 //This executes if there is already a user with the specified email in the database.
	        	 //There should be code here which would ask if the user forgot there username or password
	             return;

	         }
	         
	         else {
	        	//this next line executes the SQL code within the quotes using connector J
		         PreparedStatement stmt = conn.prepareStatement("INSERT INTO Users(email, username)" +
		                                                             "VALUES('" + email + "', '" + username + "')");
		         stmt.executeUpdate();
	         }
	         
	         
	         
	    
	         System.out.println("addUser Executed Successfully");
	       } catch (SQLException e) { 
	         System.out.println("addUser Failed to Execute");
	         e.printStackTrace();
	       } 
	    }
	 
	  
	  
	  
	  //Checks whether a specific acrow exists in a database or not
	  public boolean rowExists(String query) throws Exception{
		  
		  boolean exists = false;
		  
		  try{
		         
		         //calls getConnection method to establish connection to MySQL server
		         Connection conn = getConnection();
		         
		         
		         
		         PreparedStatement pstmt = conn.prepareStatement(query);
		         ResultSet rs = pstmt.executeQuery();
		         if(rs.next()) {
		        	 System.out.println("User already exists");
		        	 exists = true;
		        	 return exists;
		        	 }
		         
		         System.out.println("rowExists Executed Successfully");
		       } catch (SQLException e) { 
		         System.out.println("rowExists Failed to Execute");
		         e.printStackTrace();
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
	  
	  
	}


	    

