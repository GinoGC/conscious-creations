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

		for(int i=0; i<=ingredients.size()-1; i++) {
			
			
			System.out.println(ingredients.get(i) + "\t\t" + quantities.get(i));
		}
	}
	
	
	
	
	
	
}
