
//your main interface for the project, with the main method

import java.util.Scanner;

public class Kiosk{
	
	public static void main(String[] args){
		
		int applesNum = 0;
		int bananaNum = 0;
		int grapeNum = 0;
		int mangoNum = 0;
		int peachNum = 0;
		
		double applesCost = 0.5;
		double bananaCost = 0.6;
		double grapeCost = 0.2;
		double mangoCost = 0.99;
		double peachCost = 1.59;
		
		int numPurchases = 0;
		Scanner scan = new Scanner(System.in);
		String input = "";
		
		System.out.println("");
		System.out.println("Welcome to Walmart! The store to buy all the food you need.");
		System.out.println("");
		do {
			System.out.println("What would you like to buy? Your choices are:");
			
			System.out.println("Apples");
			System.out.println("Bananas");
			System.out.println("Grapes");
			System.out.println("Mangos");
			System.out.println("Peaches");
			
			System.out.println("");
			System.out.println("Which item would you like ot purchase?");
			
			input = scan.nextLine();
			
			if(input.equals("Apples")){
				applesNum++;
				System.out.println("Item Added.");
				numPurchases++;
			}
			else if(input.equals("Bananas")){
				bananaNum++;
				System.out.println("Item Added.");
				numPurchases++;
			}
			else if(input.equals("Bananas")){
				grapeNum++;
				System.out.println("Item Added.");
				numPurchases++;
			}
			else if(input.equals("Bananas")){
				mangoNum++;
				System.out.println("Item Added.");
				numPurchases++;
			}
			else if(input.equals("Bananas")){
				peachNum++;
				System.out.println("Item Added.");
				numPurchases++;
			}
			else {
				System.out.println("Item Not Found");
			}
			
			System.out.println("Would you like ot continue shopping? Y/N");
			
			input = scan.nextLine();
			if(input.equals("N")){
				numPurchases = 10;
			}
			System.out.println("");
		
		} while(numPurchases < 9)
	
		Printer print = new Printer();
		print.printReceipt(applesNum, bananaNum, grapeNum, mangoNum, peachNum, applesCost, bananaCost, grapeCost, mangoCost, peachCost);
	
	
	}	

}
