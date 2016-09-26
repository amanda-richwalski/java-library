package _04_Strings;

public class _01_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
	}

}
