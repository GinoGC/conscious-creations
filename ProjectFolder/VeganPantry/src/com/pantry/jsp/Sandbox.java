package com.pantry.jsp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//This is a testing ground for the Vegan Pantry app
public class Sandbox{


	public static void main(String args[]) throws Exception{
		 
		 
		
		 //parameters to be passed to the PantryDB object
		 String dbURL = "jdbc:mysql://localhost:3306/VeganPantry";
		 String dbUsername = "root";
		 String dbPass = "H3ll@D@t@2020";
		 
		 //creating new PantryDB object with the created parameters named connection
		 PantryDB connection = new PantryDB(/*dbURL, dbUsername, dbPass*/);
		 
		 //create connection with newly created PantryDB object
		 //connection.getConnection();
		 
		 //user email and username String
		 String email = "gino@CC.com";
		 String password = "HelloWorld";

		 
		 //test methods
		 //boolean methodOutput = connection.authenticate(email, password);
		 //System.out.println(methodOutput);
		 
		 ArrayList<String> list = new ArrayList<>();
		 
		 String[] array = {"this", "is", "a", "test"};
		 
		 for(int i=0 ; i<=array.length-1 ; i++) {
			 list.add(array[i]);
		 }
		 
		 //System.out.println(list+" ");
		 //Collections.sort(list);
		 //System.out.println(list+" ");
		 
		 
		 /*
		 The user will select the amount of each item they want to add to 
		 their pantry. When they click submit, the data will be sent as
		 two arrays. 
		 */
		 String username = "JHester23";
		 
		 String[] items = {"cabbage", "radish", "ginger", "squash"};
		 int[] quantity = {1, 2, 1, 4};
		 
		
		UserObject jordan = new UserObject("Jhester23");
		PantryObject jordansPantry = new PantryObject();
		
		
		jordan.setPantry(jordansPantry);
		jordan.addIngredients(items, quantity);
		
		jordan.print();
		
	}

}








