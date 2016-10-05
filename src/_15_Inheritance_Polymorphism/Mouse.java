package _15_Inheritance_Polymorphism;

public class Mouse extends Animal{

	
	@Override
	public void speak() {
		System.out.println("litte noises that are sometimes cute and creepy");
	}
	
	@Override
	public void sleep(){
		System.out.println("i sleep with cheese");
	}
	
}
