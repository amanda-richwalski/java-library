package _15_Inheritance_Polymorphism;

public class Bear extends Animal{

	//subclass
	
	public boolean isHibernating;
	
	@Override
	public void speak() {
		System.out.println("roarrr");
	}
	
	@Override
	public void sleep(){
		System.out.println("i sleep with my cubs");
	}
	
}
