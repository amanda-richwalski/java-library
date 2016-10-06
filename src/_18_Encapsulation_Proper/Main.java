package _18_Encapsulation_Proper;

public class Main {

	public static void main(String[] args) {
		
		//2 public players in the main class

		//constructor name will always match class name
		
	Player james = new Player("James", "Badass", 10000, 36);
	Player paul = new Player("Paul", "Boss", 20000, 48);
	Player amanda = new Player("Amanda", "Best", 800000, 70);
	
		System.out.println(paul.getName()); 
	//	System.out.println(james.getStatus()); 
		System.out.println(amanda.gethealthPoint());
		
		paul.setnNewPlayerName("paul oconnor");
		paul.getName();
		
		
		amanda.setNewStatus("bomb");
//		amanda.getStatus();
		
	}

}
