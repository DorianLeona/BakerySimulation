import java.util.*;
import java.io.*;

public class Order
{
	String orderID;
	String customerAccount;
	Address billingAddress;
	Address shippingAddress;
	
	ArrayList<Product> products;
	ArrayList<int> quantities;

	Ingredient[] ingredients;
	
	boolean wasProcessed;
	boolean wasPaid;

	double price;


	//Null constructor//
	public Order()
	{
		this.orderID = "2023-00000-00001";
		this.customerAccount = "00000";
		this.billingAddress = new Address();
		this.shippingAddress = new Address();

		this.products = new ArrayList<Product>[1];
		this.quantities = new ArrayList<int>[1];

		this.ingredients = new Ingredient[50];

		this.wasProcessed = false;
		this.wasPaid = false;

		this.price = 0.00;
	};


	//Replace filler data w/ object-specific//
	public void init()
	{

	}


	//Add an item to the order//
	public void addItem(Product item, int amount, String units)
	{
		//Units that different products are sold in//
		//Pies 		: slices, whole pies (8 slices)//
		//Macarons	: individual, half-dozen, dozens//
		//Cupcakes	: individual, half-dozen, dozens//
		//Muffins	: individual, hald-dozen, dozens//

		double quantity;

		if(units == "whole pies")
		{
			quantity = amount * 8;
		}
		else if(units == "dozens")
		{
			quantity = amount * 12;
		}
		else if(units == "one half dozen")
		{
			quantity = 6;
		}
		else
		{
			quantity = amount;
		}

		this.productts.add(item);
		this.quantities.add(quantity);
	};


	
	public Ingredient[] getTotalIngredientCosts()
	{
		return this.ingredients;
	};


	public 

}
//End Class//
