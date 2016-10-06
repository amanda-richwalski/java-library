package _19_NewFriends;

import _18_Encapsulation_Proper.Player;

public class Main {

	public static void main(String[] args) {
		
		Friend rachel = new Friend("Rachel", 100, "Columbia");
		Friend mike = new Friend("Mike", 200, "Yale");
		
		
		System.out.println(rachel.getName());
		System.out.println(mike.getSchool());

		rachel.setNewFriendName("rachel monroe-smith");
		rachel.getName();
		
		
		//bonus - check to see if names are different
		if(rachel.getName().equals(mike.getName())){
			System.out.println("names are the same");
		} else {
			System.out.println("names are different");
		}
		
		//in class example for checking friend number (need to add this to my construtor)
		
		//if(rachel.getFrindNum() == mike.get
	}

}
