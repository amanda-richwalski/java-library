package _04_Strings;

public class _02_challenges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Bronze
		String name = "Amanda";
		String address = "123 Awesome Court";
		
		String toLowerCase = name.toLowerCase();
		
		System.out.println(toLowerCase);
		
		
		String allCaps = address.toUpperCase();
		System.out.println(allCaps);
		
		
		String firstName = "Amanda";
		String lastName = "Richwalski";
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		
		
		
		
		
		String firstTwo = firstName.substring(0, 2);
		System.out.println(firstTwo);
		
		
		//Siver
		
		String fullname = "John Bon Jovi";
		String first = fullname.substring(0, 5);
		String middle = fullname.substring(5, 8);
		String last = fullname.substring(9,13);
		
		System.out.println(first);
		System.out.println(middle);
		System.out.println(last);
		
		
		String phrase = "Soda Can";
		String soda = phrase.substring(0, 4);
		String can = phrase.substring(5);
		System.out.println(soda);
		System.out.println(can);
	
		
		//Gold
		
		
		
		
		
		
	}

}
