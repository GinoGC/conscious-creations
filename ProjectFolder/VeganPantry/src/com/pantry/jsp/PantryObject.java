package com.pantry.jsp;

public class PantryObject {

	
	private String[] ingredients;
	private int[] quantity;
	
	
	
	public void addIngredients(String[] names, int[] quantities) {
		
		for(int i=0; i<=names.length-1; i++) {
			this.ingredients[i] = names[i];
			this.quantity[i] = quantities[i];
		}
		
	}
}
