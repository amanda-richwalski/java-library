package _19_NewFriends;

public class Friend {

	private String name;	
	private int age;
	private String school;
	
	public Friend(String name, int age, String school){		//objects
		this.name = name;
		this.age = age;
		this.school = school;	
	}	
	
	//getter
	
	public String getName(){
		return name;	
	}
	public String getSchool(){
		return school;	
	}
	
	//setter
	
	public void setNewFriendName(String newName){
		name = newName;
		System.out.println(name);
	}
	
	
	
	
	
	
	
}
	