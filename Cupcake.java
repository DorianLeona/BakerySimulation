import java.util.*;
import java.io.*;

public class Cupcake extends Product
{
	Component garnish;
	Component filling;
	Component batter;
	Recipe recipe;

	public Cupcake()
	{
		this.name = "blank";
		this.type = "cupcake";
		this.amount = new int[50];
		this.ingredients = new ArrayList<Ingredient>();
		this.requiredIngredients = new ArrayList<String>();
	};


	public void init(String dataString)
	{
		this.buildRecipe();		
	};


	public void buildRecipe()
	{
		ArrayList<Ingredient> garnish_ingredients, filling_ingredients, crust_ingredients;

		garnish_ingredients = new ArrayList<Ingredient>[50];
		filling_ingredients = new ArrayList<Ingredient>[50];
		crust_ingredients = new ArrayList<Ingredients>[50];

		garnish_ingredients = this.garnish.getIngredientList();
		filling_ingredients = this.filling.getIngredientList();
		crust_ingredients = this.crust.getIngredientList();

		double totalAmountNeeded;

		for(int ingredient = 0; ingredient < 50; ingredient++)
		{
			totalAmountNeeded = garnishAmount[ingredient] + fillingAmount[ingredient] + crustAmount[ingredient];
			this.recipe.setAmount(ingredient, totalAmountNeeded);
		}
	};


	public void displayIngredients()
	{
		int total_possible_ingredients = 50;
		
		System.out.println("\n\n========== Required Ingredients ==========\n\n");
		for(int i = 0; i < total_possible_ingredients; i++)
		{
			if(this.amount != 0)
			{
				String name = this.ingredients.getName();
				double amount = this.ingredients.getAmount();
				String amount = this.getUnits();

				System.out.printf("%s		%lf %s", name, amount, units);
				System.out.println("\n");
			}
		}
			System.out.println("\n");
	};


	public ArrayList<Ingredient> getIngredientList()
	{
		return this.ingredients;
	};
	

	public String getIngredientNames()
	{
		return this.requiredIngredients;
	};
}
//End class//
