package _09_loops;

public class _03_foreach {

	public static void main(String[] args) {
		
		String[] comedians = {"Dan Akroyd", "Chris Farley", "Gearge Carlin", "Louis CK"};
		
		for(String comedian : comedians){
			System.out.println(comedian);
		}

		String[] greatestBossesOfAllTime = {"Jenn Aikins", "Bob Alcorn", "Robin"};
		
			for(String boss : greatestBossesOfAllTime){
				System.out.println(boss);
			}
		
		String s = "Hello";
		for(char ch : s.toCharArray()){
			System.out.println(ch);
		}
		
	}

}
