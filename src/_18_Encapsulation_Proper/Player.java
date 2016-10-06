package _18_Encapsulation_Proper;

public class Player {

	private String name;
	private String status;			//variables
	private int highScore;
	private int healthPoint;
	
	
	//constructor
	public Player(String name, String status, int highScore, int healthPoint){		//objects
		this.name = name;
		this.status = status;
		this.highScore = highScore;
		this.healthPoint = healthPoint;
	}
	
	
	//getters
	public String getName(){
		return name;	
	}
	
	public int gethighScore(){
		return highScore;
	}
	
//	public String getName(){
//		return name;	
//	}
	
	
	public int gethealthPoint(){
		return healthPoint;
	}
	
	//setter
	
	public void setnNewPlayerName(String newName){
		name = newName;
		System.out.println(name);
	}
	public void setNewStatus(String newStatus){
		status = newStatus;
		System.out.println(status);
	}
	
	
	
}
