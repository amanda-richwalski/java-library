package tutorial7;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//output prompt
		System.out.println("Enter a floating point value: ");
		
		//wait for user to enter a line
		double value = input.nextDouble();
		
		//tell them what they entered
		System.out.println("you entered: " + value);
		
	}
	
}
