//Printer.java

/* This is a java file 'stub' or piece of a file designed to get you started on 
* learning to code in java, specifically with multiple classes and methods that rely on the other.
*
*For this assignment, I would like you to fork, modify and commit this project, while
* adding the following elements to your code.
*
* The receipt printer file could take arguments or parametrs from another class
* This file will be purely for output
****************************************
* 40 characters is a standard width    * 
* for typical receipt paper, your task *
* is to make output from the screen    *
* look like it is printing to a small  *
* receipt type printer, with all the   *
* text formatted to 40 characters wide *
*                                      *
* Have fun with the assignment!!       *
****************************************
*/
public class Printer{
	
	public void printReceipt(int applesNum, int bananaNum, int grapeNum, int mangoNum, int peachNum, double applesCost, double bananaCost, double grapeCost, double mangoCost, double peachCost){
		
		System.out.println("");
		System.out.println("Walmart Food Receipt");
		
		System.out.println("Qty        Item Description            Cost");
		if(applesNum>0){
			System.out.println("" + applesNum + "          Apples                      $" + String.format("%.2f", applesNum*applesCost));
		}
		if(bananaNum>0){
			System.out.println("" + bananaNum + "          Bananas                     $" + String.format("%.2f", bananaNum*bananaCost));
		}
		if(grapeNum>0){
			System.out.println("" + grapeNum  + "          Grapes                      $" + String.format("%.2f", grapeNum*grapeCost));
		}
		if(mangoNum>0){
			System.out.println("" + mangoNum  + "          Mangos                      $" + String.format("%.2f", mangoNum*mangoCost));
		}
		if(peachNum>0){
			System.out.println("" + peachNum  + "          Peaches                     $" + String.format("%.2f", peachNum*peachCost));
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		double cost = applesNum*applesCost + bananaNum*bananaCost + grapeNum*grapeCost + mangoNum*mangoCost + peachNum*peachCost;
		double tax = cost * 0.07;
		System.out.println("Subtotal: $" + String.format("%.2f", cost));
		System.out.println("Tax: $" + String.format("%.2f", tax));
		System.out.println("");
		System.out.println("Total: $" + String.format("%.2f", cost + tax));
				
	}
	
}

//Roughly 15 minutes to type in everything
