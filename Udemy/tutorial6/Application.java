package tutorial6;

public class Application {

	public static void main(String[] args) {
		
		int myInt = 15;
		
		if(myInt < 10){
			System.out.println("yes, its true");
		}
		else if(myInt < 20){
			System.out.println("no, it's false");
		}
		else {
				System.out.println("none of the above");
		}
		
		
		int loop = 0;
		while(true) {
			System.out.println("looping: " + loop);
			
			if(loop == 5) {
				break;
			}
			
			loop++;
			
			System.out.println("running");
		}
		
	}

}
