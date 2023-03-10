import java.util.*;

public class Pie extends Product
{
	Component garnish;
	Component filling;
	Component crust;
	Recipe pie_recipe;

	public Pie()
	{
		this.name = "blank";
		this.type = "generic";
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
		ArrayList<Ingredient> garnishAmount, fillingAmount, crustAmount;

		garnish_ingredients = new ArrayList<Ingredient>[50];
		filling_ingredients = new ArrayList<Ingredient>[50];
		crustAmount = new ArrayList<Ingredients>[50];

		garnishAmount = this.garnish.getAmount();
		fillingAmount = this.filling.getAmount();
		crustAmount = this.crust.getAmount();

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
