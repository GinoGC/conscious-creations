package com.pantry.jsp;
//import java.sql.*;


//This is a testing ground for the Vegan Pantry app
public class Sandbox{


	public static void main(String args[]) throws Exception{
		 
		 //parameters to be passed to the PantryDB object
		 String dbURL = "jdbc:mysql://localhost:3306/VeganPantry";
		 String dbUsername = "root";
		 String dbPass = "H3ll@D@t@2020";
		 
		 //creating new PantryDB object with the created parameters named connection
		 PantryDB connection = new PantryDB(dbURL, dbUsername, dbPass);
		 
		 //create connection with newly created PantryDB object
		 //connection.getConnection();
		 
		 //user email and username String
		 String email = "gino@CC.com";
		 String password = "HelloWorld";
		 
		 
		 //test methods
		 boolean methodOutput = connection.authenticate(email, password);
		 System.out.println(methodOutput);
		 
		}
	
}