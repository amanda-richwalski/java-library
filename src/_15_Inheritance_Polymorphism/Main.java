package _15_Inheritance_Polymorphism;

import _17_Encapsulation.Patriots;

public class Main {

	public static void main(String[] args) {
		
		
		//create all instances on the top and then create and text each method by type
		
		Animal george = new Animal();  //instance 1
		george.name = "George the animal";
		george.numEyes = 2;
		george.printName();
		george.numEyes();
		george.speak();
		
		Bear barney = new Bear ();  //instance 2
		barney.name = "Barney";
		barney.isHibernating = true;
		barney.numEyes = 2;
		barney.printName();
		barney.numEyes();
		barney.speak();
		barney.sleep();
		
		Kangaroo Jack = new Kangaroo();  //instance 3
		Jack.name = "Jack";
		Jack.hasAPouch = true;
		Jack.bigFeet = true;
		Jack.numEyes = 2;
		Jack.printName();
		Jack.numEyes();
		Jack.getNumTeeth();
		Jack.speak();
		Jack.sleep();
		
		Mouse frank = new Mouse();  //instance 4
		frank.name = "Frank";
		frank.speak();
		frank.sleep();
		
		
	Patriots brady = new Patriots ();
	brady.isBetterThanTheColts = true;
		
		
		
		
		
	}

}
