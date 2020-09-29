//Joshua Budd
//Sept 22, 2016
//A Pizza Class

public class Pizza 
{
	//These are instance variables
	private String size;
	private int cheeseToppings;
	private int meatToppings;
	private int veggieToppings;

	//Default Constructor
	public Pizza(){
		setSize("SMALL");
		setCheeseToppings(1);
		setMeatToppings(0);
		setVeggieToppings(0);
	}
	
	//Full Argument Constructor
	public Pizza(String newSize, int newCheeseToppings, int newMeatToppings, int newVeggieToppings){
		setSize(newSize);
		setCheeseToppings(newCheeseToppings);
		setMeatToppings(newMeatToppings);
		setVeggieToppings(newVeggieToppings);
	}

	//this begins the get/set section
	public String getSize(){
		return (size);
	}
	
	public int getCheeseToppings(){
		return (cheeseToppings);
	}
	
	public int getMeatToppings(){
		return (meatToppings);
	}
	
	public int getVeggieToppings(){
		return (veggieToppings);
	}
	
	public void setSize(String newSize){
		size = newSize;
	}
	
	public void setCheeseToppings(int newCheeseToppings){
		cheeseToppings = newCheeseToppings;
	}
	
	public void setMeatToppings(int newMeatToppings){
		meatToppings = newMeatToppings;
	}
	
	public void setVeggieToppings(int newVeggieToppings){
		veggieToppings = newVeggieToppings;
	}
	
	public double calcCost(){
		int cost = 0;
		int toppings = cheeseToppings + meatToppings + veggieToppings;
		if (size.equals("SMALL"))
		{
			cost = 10 + 2 * toppings;
		}
		if (size.equals("MEDIUM"))
		{
			cost = 12 + 2 * toppings;
		}
		if (size.equals("LARGE"))
		{
			cost = 14 + 2 * toppings;
		}
		return cost;
	}
	
	public String toString(){
		String localString = "Pizza Size: " + size + "\n" +
							"Cheese Toppings: " + cheeseToppings + "\n" +
							"Meat Toppings: " + meatToppings + "\n" +
							"Veggie Toppings: " + veggieToppings + "\n";
		return (localString);
	}
}//end the Pizza class
