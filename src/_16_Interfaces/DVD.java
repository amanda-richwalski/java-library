package _16_Interfaces;

public class DVD implements IFunctions {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play DVD.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop DVD.");
	}

	@Override
	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("Skip DVD.");
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("DVD menu.");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Pause DVD.");
	}
	
	public void extendedVersion(){
		System.out.println("Select.");
	}

	@Override
	public void getTitle(String title) {
		// TODO Auto-generated method stub
		System.out.println("The title of this DVD is" + title);
		
	}

}
