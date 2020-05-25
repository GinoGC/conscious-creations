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
	public UserObject(String inputEmail) {
		
		
		//Should be auto-initialized to include the users email and name
		
		
		
	}

		  
	
	
}
