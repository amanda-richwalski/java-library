package _15_Inheritance_Polymorphism;

import java.util.Scanner;

public class Animal {
	
	Scanner scan = new Scanner(System.in);
	
	
	
	//properties
		public int numLegs;
		public int numTeeth;
		public int numEyes;
		public int lifespan;
		public boolean isWarmBlooded;
		public String name;
		public String habitat;
	
	//methods
		public void printName(){
			System.out.println("My name is " + name);
		}
		
		
		public void numEyes(){
			System.out.println(name + " has " + numEyes + " eyes ");
		}
		
		public void getNumTeeth(){
			System.out.println("How man teeth does " + name + " have?");
			int numTeeth = scan.nextInt();
			System.out.println(name + " has " + numTeeth + " teeth.");
		}
		
		
		
		public void speak() {
			System.out.println("i am an animal");
		}
		
		
		public void sleep(){
			System.out.println("i sleep a lot");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
