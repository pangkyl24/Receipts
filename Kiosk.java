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
		int input = 0;
		
		System.out.println("");
		System.out.println("Welcome to Walmart! The store to buy all the food you need.");
		System.out.println("");
		/*do {
			System.out.println("What would you like to buy? Your choices are:");
			
			System.out.println("Apples");
			System.out.println("Bananas");
			System.out.println("Grapes");
			System.out.println("Mangos");
			System.out.println("Peaches");
			
			System.out.println("");
			System.out.println("Which item would you like to purchase?");
			
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
			else if(input.equals("Grapes")){
				grapeNum++;
				System.out.println("Item Added.");
				numPurchases++;
			}
			else if(input.equals("Mangos")){
				mangoNum++;
				System.out.println("Item Added.");
				numPurchases++;
			}
			else if(input.equals("Peaches")){
				peachNum++;
				System.out.println("Item Added.");
				numPurchases++;
			}
			else {
				System.out.println("Item Not Found");
			}
			
			if(numPurchases < 9){
				System.out.println("Would you like to continue shopping? Y/N");
			}
			
			input = scan.nextLine();
			if(input.equals("N")){
				numPurchases = 10;
			}
			System.out.println("");
		
		} while(numPurchases < 9);*/
		System.out.print("How many apples would you like to buy? (Max = 9) ");
		input = scan.nextInt();
		scan.nextLine();
		if (input > 9){
			System.out.println("Ordered more than 9 apples, adding 9 apples to your order");
			input = 9;
		}
		else{
			System.out.println("Added " + input + " apples to your order");
		}
		applesNum+=input;
		
		System.out.print("How many bananas would you like to buy? (Max = 9) ");
		input = scan.nextInt();
		scan.nextLine();
		if (input > 9){
			System.out.println("Ordered more than 9 bananas, adding 9 bananas to your order");
			input = 9;
		}
		else{
			System.out.println("Added " + input + " bananas to your order");
		}
		bananaNum+=input;
		
		System.out.print("How many grapes would you like to buy? (Max = 9) ");
		input = scan.nextInt();
		scan.nextLine();
		if (input > 9){
			System.out.println("Ordered more than 9 grapes, adding 9 grapes to your order");
			input = 9;
		}
		else{
			System.out.println("Added " + input + " grapes to your order");
		}
		grapeNum+=input;
		
		System.out.print("How many mangos would you like to buy? (Max = 9) ");
		input = scan.nextInt();
		scan.nextLine();
		if (input > 9){
			System.out.println("Ordered more than 9 mangos, adding 9 mangos to your order");
			input = 9;
		}
		else{
			System.out.println("Added " + input + " mangos to your order");
		}
		mangoNum+=input;
		
		System.out.print("How many peaches would you like to buy? (Max = 9) ");
		input = scan.nextInt();
		scan.nextLine();
		if (input > 9){
			System.out.println("Ordered more than 9 peaches, adding 9 peaches to your order");
			input = 9;
		}
		else{
			System.out.println("Added " + input + " peaches to your order");
		}
		peachNum+=input;
	
		Printer print = new Printer();
		print.printReceipt(applesNum, bananaNum, grapeNum, mangoNum, peachNum, applesCost, bananaCost, grapeCost, mangoCost, peachCost);
	
	
	}	

}
