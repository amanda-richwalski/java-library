package _09_loops;

public class _02_for {

	public static void main(String[] args) {
		
		
		//lcv = loop control variable
		//for(intialize lcv; relational test; modifier){
		//}
		
		//for(variable; condition; modifier){
		//}
		
		
		
		
		for(int i = 0; i <= 10; i++){
			System.out.println(i);
		}
		
		
		for(int i = 0; i <= 100; i+=5){
			System.out.println(i);
		}
		
		int sum = 0;
		for(int i = 0; i <= 10; i++) {
			sum = sum + i;		
		}
		System.out.println(sum);
		
		
		//simple interest over time
		double balance = 5000;
		double rate = 1.02; //2% interest
		for(int i = 1; i <= 10; i++){
			balance *= rate; //balance = balance * rate
		}
		System.out.println(balance);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
