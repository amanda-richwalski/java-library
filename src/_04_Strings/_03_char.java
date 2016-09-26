package _04_Strings;

public class _03_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char uniChar = '\u00A5' ;  //TODO:  Look up a unicode number that works
		System.out.println(uniChar);

		char[] charArray = {'a', 'b', 'c', 'd', 'e'};
		System.out.println(charArray);
		
		char newUniChar = '\u0024' ;
		System.out.println(newUniChar);
		
		char[] newCharArray = {'L', 'O', 'L', 'A'};
		System.out.println(newCharArray);
		
		
		
		//Char Manipulations
		System.out.println("Hello \"Tough Guy\", How are you?");
		
		System.out.println("James \nPaul");
		System.out.println("Paul");
		
		//System.out.println("c:\\desktop\\user\\texthello.txt");
		
		System.out.println("amanda \trich");
		
		System.out.println("amanda \brich");
		
		
		
	}

	
}
