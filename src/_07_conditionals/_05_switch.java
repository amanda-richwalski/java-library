package _07_conditionals;

public class _05_switch {

	public static void main(String[] args) {
		
		
		int WhiteCastlesEaten = 35;
		String response;
		
		switch(WhiteCastlesEaten){
			case 0: 
				response = "that's probably smart.";
				break;
			case 5:
				response = "Well, are you feeling ok?";
				break;
			case 15:
				response = "that's crazy.";
				break;
			case 20:
				response = "are you dead?";
				break;
			default:
				response = "oh wow";
				break;
		}
		System.out.println(response);
	}

}
