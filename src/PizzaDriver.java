//Joshua Budd
//Sept 22, 2016
//Pizza Class Tester

import java.util.Scanner;

public class PizzaDriver {

	public static void main(String[] args) {
/* THIS IS FOR TESTING
		Pizza pizza1 = new Pizza();
		System.out.println("Pizza1: \n" + pizza1.toString());
		System.out.printf("%S$%.2f", "Cost of pizza: ", pizza1.calcCost());

		Pizza pizza2 = new Pizza("MEDIUM", 1, 2, 3);
		System.out.println("\nPizza2: \n" + pizza2.toString());
		System.out.printf("%S$%.2f", "Cost of pizza: ", pizza2.calcCost());
*/
		//Pizza Ordering App
		int cheeseToppings = 0;
		int meatToppings = 0;
		int veggieToppings = 0;
		
		System.out.println("Welcome to Gioninos");
		
		String size = readString();
		
		
		cheeseToppings = readInt("CHEESE");
		meatToppings = readInt("MEAT");
		veggieToppings = readInt("VEGGIE");
		
		Pizza pizza3 = new Pizza(size, cheeseToppings, meatToppings, veggieToppings);
		System.out.println("\nPizza3: \n" + pizza3.toString());
		System.out.printf("%S$%.2f", "Cost of pizza: ", pizza3.calcCost());
			
	}//end main
	
	public static int readInt(String msg){
		int toppings;
		Scanner pizzaInput = new Scanner(System.in);

		//Forcing numeric input via a do loop
		do{
			try{
				System.out.println("How many " + msg + " toppings would you like?");
				toppings = pizzaInput.nextInt();
				if ((toppings > -1) && (toppings < 4))
					break;
				System.out.println("Your input of " + toppings + " cannot be processed.");
				System.out.println("Please enter a number between 0 and 3");
			}
			catch(Exception ex){
				System.out.println("Bad data...Please try again");
				pizzaInput.nextLine();
			}
		}while(true);
		
		return toppings;
		
	}//end of readInt
	
	public static String readString(){
		Scanner pizzaInput = new Scanner(System.in);
		String size = "";
		//Force specific String input
		do{
			System.out.println("What size pizza would you like: SMALL, MEDIUM, LARGE");
			size = pizzaInput.nextLine();
			if (size.equalsIgnoreCase("SMALL"))
				break;
			else if (size.equalsIgnoreCase("MEDIUM"))
				break;
			else if (size.equalsIgnoreCase("LARGE"))
				break;
		}while(true);
		
		return size = size.toUpperCase();
	}//end of readString
	
}//end of PizzaDriver