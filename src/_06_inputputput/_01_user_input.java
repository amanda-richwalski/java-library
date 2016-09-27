package _06_inputputput;

import java.util.Scanner;

public class _01_user_input {

	public static void main(String[] args) {


		//TODO: Figure out how to use the Scanner in Java. Find examples and play around with it, until 
		//you feel comfortable.
		
		//declaration - variable not initalized yet without value
		String name; 
		String birthCity;
		String age;
		
		//Scanner is a Java class - used for User Input, need to import
		Scanner inputInfo = new Scanner(System.in);
		
		//Setup a simple user input
		System.out.println("Enter your name below: ");
		name = inputInfo.next();
		//System.out.println(name);
		
		//Setup a simple user input
		System.out.println("Enter your city of birth below: ");
		birthCity = inputInfo.next();
		//System.out.println(birthCity);
				
		//Setup a simple user input
		System.out.println("Enter your age below: ");
		age = inputInfo.next();
		//System.out.println(age);
				
		//use concatenation to make a sentence using these inputs
		
		System.out.println("Hello " + name + " you were born in " + birthCity + " and you are " + age + " years old");
		
		inputInfo.close();
		
		
		
		
	
				
				
				
		
		
		
		
		
		
		
		
	}

}
