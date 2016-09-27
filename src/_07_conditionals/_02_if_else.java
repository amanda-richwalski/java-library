package _07_conditionals;

import java.util.Scanner;

public class _02_if_else {

	public static void main(String[] args) {
		Scanner inputInfo = new Scanner(System.in);
		
				//1
				boolean meatloafForLunch = false;
				
				if(meatloafForLunch){
					System.out.println("going to puke");
				}
				System.out.println("Test");
				
				
				
				
				//2
				boolean pizzaForLunch = false;
				
				if(pizzaForLunch){
					System.out.println("yummy");
				}else{
					System.out.println("boooooooo");
				}
				
				
				
				//class example
				
				boolean isColdInHere = true;
				String message;
				
				if(isColdInHere){
					message = "please turn on heat";
				}else{
					message = "its not too bad";
				}
				
				System.out.print(message);

	}

}
