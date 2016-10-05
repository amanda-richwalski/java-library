package ConsoleApp;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class MainBronze {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		Calc calc = new Calc();
		double a = 0;
		double b = 0;
		String sign = "";
		double result = 0;
		
		System.out.println("Welcome to the console's calculator!");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Please enter your first number:");
			a = Double.parseDouble(reader.readLine());
			System.out.println("Please enter your second number:");
			b = Double.parseDouble(reader.readLine());
			System.out.println("Please enter your the sign of wanted operation:");
			System.out.println("Options: +, -, *, /");
			sign = reader.readLine();
		} catch (NumberFormatException e) {
			System.out.println("This is not a number!");
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("Problem with reading your input!");
			e.printStackTrace();
		}
		
		switch(sign){
		case "+":
			result = calc.add(a, b);
			System.out.println("Result:");
			System.out.println(result);
			break;
		case "-":
			result = calc.substract(a, b);
			System.out.println("Result:");
			System.out.println(result);
			break;
		case "*":
			result = calc.multiply(a, b);
			System.out.println("Result:");
			System.out.println(result);
			break;
		case "/":
			result = calc.divide(a, b);
			System.out.println("Result:");
			System.out.println(result);
			break;
		default:
			System.out.println("Wrong sign!");
		}
		
		
		
		
		
				
		
		
	}

}
