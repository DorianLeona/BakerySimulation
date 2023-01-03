import java.util.*;
import java.io.*;

public class Ingredient
{
	String name;
	double pricePerUnit;
	String units;
	double amount;


	//Null constructor//
	public Ingredient()
	{
		this.name = "blank";
		this.amount = 0.00;
		this.pricePerUnit = 0.00;
		this.units = "NULL";
	};


	//Set members to object-specific values//
	public void init(String dataString)
	{
		String[] data = dataString.split("/");


		this.name = data[0];
			
		String price_string = data[1];
		this.pricePerUnit = Double.parseDouble(price_string);
		

		this.units = data[2];

		String amount_string = data[3];
		this.amount = Double.parseDouble(amount_string);
	};


	//Return required amount of this Ingredient//
	public double getAmount()
	{
		return this.amount;
	};


	//Return the standard baking unit for this Ingredient//
	public String getUnits()
	{
		return this.units;
	};
}
//End class//
