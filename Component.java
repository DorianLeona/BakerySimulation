import java.util.*;
import java.io.*;

public class Component
{
	String name;
	Ingredient[] ingredients;
	double[] amounts[];

	public Component()
	{

	};


	public void init()
	{

	};


	//Polymorphic 1/2 -- Returns an array containing the amount needed of each possible ingredient//
	public double[] getAmount()
	{
		return this.amounts;
	};


	public double getAmount(int ingredient_code);
	{
		if(ingredient_code > -1 && ingredient_code < 50)
		{
			return this.amounts[ingredient_code];
		}

		else
		{
			return 0;
		}
	};
}
//End class//
