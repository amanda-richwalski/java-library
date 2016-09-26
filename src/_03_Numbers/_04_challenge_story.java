package _03_Numbers;

public class _04_challenge_story {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO: Create a story using math operators. 
		 // CHALLENGE: Make your own expression story using various number types. Also try to use each math operator (+,-,/,*,%)
	

		    // A woman goes shopping with the following balance:
		    double bankBalance = 20000.00;
		    
		    //She buys this stuff.
		    double shoes = 2000.00;
		    double shirt = 4000.25;
		    double pants = 10550.45;
		    
		    //The total bill is calculated:
		    double shoppingTotalBill = shoes + shirt + pants;
		    // What is our total?   
		    //Show how to interpolate here:
		    System.out.println("Shopping bill: " + shoppingTotalBill);
		    
		    //The bank balance is calculated.
		    double afterShoppingBalance = bankBalance - shoppingTotalBill; 
		    System.out.println("Bank balance: " + afterShoppingBalance);

		    // stress the importance of changing this value    
		    bankBalance = afterShoppingBalance;

		    //It's payday 
		    bankBalance = bankBalance + 7000;
		    //Birthday money from her grandma.
		    bankBalance += 75;
		    System.out.println(bankBalance);

		    // Things to take note, the value of bankBalance changing each step. 
		    // How does the computer work through that problem using the variable?

		    // A few weeks later: The husband says he's unhappy, and wants to split
		    bankBalance = bankBalance / 2;
		    System.out.println(bankBalance);

		    // She's sad... until a generous stranger tell her that he wants to times whatever she has in her bank by 10!
		    bankBalance = bankBalance * 10; 
		    System.out.println(bankBalance);

		    /* The ex-husband is back he wants not only divide the 7 vacation properties 3 but he convinces the judge to only
		    let her have the remainder*/
		    
		    int vacationCondos = 7; 
		    vacationCondos = vacationCondos % 3; 

		    System.out.println("Vacation condos:" + vacationCondos);

		    
	
	
	
	
	
	
	
	
	}

}
