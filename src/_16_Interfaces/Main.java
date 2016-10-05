package _16_Interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CD zeppelin = new CD();
		zeppelin.play();
		zeppelin.menu();
		
		DVD cinderella = new DVD();
		cinderella.play();
		cinderella.stop();
		
		BlueRay badBosses = new BlueRay();
		badBosses.play();
		badBosses.noClue();
		badBosses.getTitle("Bad Bosses");
		
	}

}
