package com.pantry.jsp;
import java.util.ArrayList;


public class PantryObject {

	
	private ArrayList<String> ingredients= new ArrayList<>();
	private ArrayList<Integer> quantities = new ArrayList<>();
	
	
	
	public void addIngredients(String[] inputItems, int[] inputQuantity){
		
		for(int i=0 ; i<=inputItems.length-1 ; i++) {
			 this.ingredients.add(inputItems[i]);
			 this.quantities.add(inputQuantity[i]);
		 }
	}


	public void print() {
		
		System.out.println("Ingredients \tQuantity");
		System.out.printf("Ingredients: %10s\n", "Quantity");

		for(int i=0; i<=ingredients.size()-1; i++) {
			
			
			//System.out.printf(ingredients.get(i),  " " + quantities.get(i));
			System.out.printf("%-10s %5d \n", ingredients.get(i) + ":", quantities.get(i));
		}
	}
	
	
	
	
	
	
}
