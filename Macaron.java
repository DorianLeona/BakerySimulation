import java.util.*;
import java.io.*;

public class Macaron extends Product
{
	Component filling;
	Component shells;
	Recipe recipe;

	public Macaron()
	{
		this.name = "blank";
		this.type = "macaron";
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
		ArrayList<Ingredient> fillingAmount, shellAmount;

		fillingAmount = new ArrayList<Ingredient>[50];
		shellAmount = new ArrayList<Ingredients>[50];

		fillingAmount = this.filling.getIngredientList();
		shellAmount = this.shell.getIngredientList();

		double totalAmountNeeded;

		for(int ingredient = 0; ingredient < 50; ingredient++)
		{
			totalAmountNeeded = fillingAmount[ingredient] + shellAmount[ingredient];
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
