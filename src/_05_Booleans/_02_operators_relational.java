package _05_Booleans;

public class _02_operators_relational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Relational Operators
		 * >
		 * <
		 * >=
		 * <=
		 * ==
		 */
		
		//TODO - create an int called currBalance and assign it a value
		//use an if statement to check if that balance is greater than zero
		//use different relational operators to print different statements
		
		int currBalance = 2000;
		if(currBalance == -80000) {		
			System.out.println("mo money");
		} else {
			System.out.println("get a job");
		}
		
		if (1 < 0){
			System.out.println("1 is greater 2");
			} else {
				System.out.println("ummm...");
			}
	
	
		//String1 == String2 would not work.
        //Instead, we do String1.equals(String 2)

        String wordOne = "Cat";
        String wordTwo = "Dog";
        String wordThree = "Cat";

        System.out.println(wordOne.equals(wordTwo));
        System.out.println(wordOne.equals(wordThree));
        
        int bankPin = 2016;
        if(bankPin == 2016) {
        	System.out.println("wlcme to the millionaire's club!");
        }
        
        String password = "LETMEIN";
        if(password.equals("LETMEIN")) {
        	System.out.println("log in complete");
        } else {
        	System.out.println("smthng went wrong with login");
        }
        
        
		

	}
}





