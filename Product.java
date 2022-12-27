import java.util.*;

public class Product
{
	protected String name;
	protected String type;
	protected int[] amounts;
	protected ArrayList<Ingredient> ingredients;
	protected ArrayList<String> requiredIngredients;



	public Product()
	{
		this.name = "blank";
		this.type = "generic";
		this.amount = new int[50];
		this.ingredients = new ArrayList<Ingredient>();
		this.requiredIngredients = new ArrayList<String>();
	};


	public void init(String dataString)
	{
		
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
