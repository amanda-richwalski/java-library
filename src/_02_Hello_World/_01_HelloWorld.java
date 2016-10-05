package _02_Hello_World;

import _17_Encapsulation.BearsPlayers;

public class _01_HelloWorld {

	public static void main(String[] args) {
		
	
		
		BearsPlayers mDitka = new BearsPlayers();
		mDitka.name = "Mike Ditka";
		mDitka.setNumber(1);
		System.out.println(mDitka.getNumber());
		
		
	}

}
