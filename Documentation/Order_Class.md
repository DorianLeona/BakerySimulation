#Members
String orderID
	- This is the identifier that distinguishes different orders from one another.
	- The orderID consists of 4 parts: [year of order] - [customer account] - [random 5-digit number];
String customerAccount
	- This is the identifier that links this order to a particular customer's account.

ArrayList <Product> products
	- This is an Array List containing the products that the customer has ordered.


#Method List
Null Constructor
	[0] public Order()
		- Assigns placeholder data to all members of a new Order object
Initializer
	[1] public void init(String dataString)
		- Replaces placeholder data in an object with object-speciic values
Order Item Adder
	[2] public void addItem(Product item, int amount, String units)
		- Allows user to add an item to the order's ArrayList of products to be purchased.
Order Editor
	[3] public void edit(String employeeKey)
		- Allows an employee to edit an order, at the behest of the customer -- as long as the order hadn't already been processed.

	
