package _16_Interfaces;

public class BlueRay implements IFunctions {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Start BlueRay.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop BlueRay.");
	}

	@Override
	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("Skip BlueRay.");
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("BlueRay Menu.");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Pause BlueRay.");
	}

	public void noClue(){
		System.out.println("I dont know what a BlueRay player does.");
	}

	@Override
	public void getTitle(String title) {
		// TODO Auto-generated method stub
		System.out.println("Title of this BlueRay movie is " + title);
		
	}
}
