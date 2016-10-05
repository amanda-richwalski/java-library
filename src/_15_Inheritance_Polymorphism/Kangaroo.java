package _15_Inheritance_Polymorphism;

public class Kangaroo extends Animal{
	
	
	//subclass
	
	public boolean isTall;
	public boolean hasAPouch;
	public boolean isInAustralia;
	public boolean bigFeet;

	
	@Override
	public void speak() {
		System.out.println("i am a cute animal");
	}
	
	@Override
	public void sleep(){
		System.out.println("i sleep at night");
	}
	
}
