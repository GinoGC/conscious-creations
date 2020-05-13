package com.pantry.jsp;
import java.sql.*;

public class PantryDB{
	  
	  private String url; //URL for database connection
	  private String username;
	  private String pass;
	         
	    
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  // This method adds a new user to the database after making sure they aren't already in the database.
	  public String addUser(String email) throws Exception {
	       
		  PreparedStatement stmt = null;
		  String output = null;
		  
		  if(email == null) {
			  output = "cannot be null";
		  }
		  
		  else {
			  try{
			         
			         //calls getConnection method to establish connection to MySQL server
			         Connection conn = getConnection();
			         
			         String checkExists = "SELECT * From users WHERE email = '" + email + "';";
			         
			         if(rowExists(checkExists, conn)) {
			        	 
			        	 //This executes if there is already a user with the specified email in the database.
			        	 //There should be code here which would ask if the user forgot there username or password
			        	 output = "User already exists. [Reset password?]";
			         }
			         
			         else {
			        	//this next line executes the SQL code within the quotes using connector J
				         stmt = conn.prepareStatement("INSERT INTO Users(email)" +
				                                                             "VALUES('" + email + "')");
				         stmt.executeUpdate();
				         output = "User has been added :D";
			         }
			         System.out.println("addUser Executed Successfully");
			         
			         
			       } catch (SQLException e) { 
			         System.out.println("addUser Failed to Execute");
			         e.printStackTrace();
			       } finally {
			           if (stmt != null) {
			               stmt.close();
			               }	          
			           } 
		  } return output;
	    }
	 
	  
	  
	  
	  //Checks whether a specific acrow exists in a database or not
	  public boolean rowExists(String query, Connection conn) throws Exception{
		  
		  boolean exists = false;
		  PreparedStatement pstmt = null;
		  
		  try{
		         
		         //calls getConnection method to establish connection to MySQL server
		         //Connection conn = getConnection();
		         
		         
		         
		         pstmt = conn.prepareStatement(query);
		         ResultSet rs = pstmt.executeQuery();
		         if(rs.next()) {
		        	 System.out.println("already exists");
		        	 exists = true;
		        	 return exists;
		        	 }
		         
		         System.out.println("rowExists Executed Successfully");
		       } catch (SQLException e) { 
		         System.out.println("rowExists Failed to Execute");
		         e.printStackTrace();
		       } finally {
		           if (pstmt != null) {
		               pstmt.close();
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
	  
	  
	}


	    

