package com.pantry.jsp;

import java.util.Scanner;

public class RecipeObject {

	private String name;
	private String[] ingredients;
	private int[] ingredientQuantity;
	private int servingSize;
	private int calories;
	private int protein;
	private int fat;
	private int carbs;
	private int fiber;
	
	
	
	
	
	
	
	

	
	
	
	public int[] getIngredientQuantity() {
		return ingredientQuantity;
	}



	
	public void setIngredients(Scanner input) {
		this.ingredientQuantity = ingredientQuantity;
	}




	public RecipeObject(String name, String[] ingredients, int[] ingredientQuantity, int servingSize, 
											int calories,int protein, int fat, int carbs, int fiber) {
		super();
		this.name = name;
		this.ingredients = ingredients;
		this.ingredientQuantity = ingredientQuantity;
		this.servingSize = servingSize;
		this.calories = calories;
		this.protein = protein;
		this.fat = fat;
		this.carbs = carbs;
		this.fiber = fiber;
	}




	public RecipeObject(String name) {
		this.name = name;
	}

}
