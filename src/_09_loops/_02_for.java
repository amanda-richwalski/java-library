package _09_loops;

public class _02_for {

	public static void main(String[] args) {
		
		
		//lcv = loop control variable
		//for(intialize lcv; relational test; modifier){
		//}
		
		//for(variable; condition; modifier){
		//}
		
		
		
		
		//for(int i = 0; i <= 10; i++){
			//System.out.println(i);
		//}
		
		
		//for(int i = 0; i <= 100; i+=5){
			//System.out.println(i);
		//}
		
		//int sum = 0;
		//for(int i = 0; i <= 10; i++) {
			//sum = sum + i;		
		//}
		//System.out.println(sum);
		
		
		//simple interest over time
		//double balance = 5000;
		//double rate = 1.02; //2% interest
		//for(int i = 1; i <= 10; i++){
			//balance *= rate; //balance = balance * rate
		//}
		//System.out.println(balance);
		
		
		String spaces = "there are spaces in this string";
		int numSpaces = 0;
		//System.out.println(spaces.length());
		//System.out.println(spaces.charAt(30));
		for(int i = 0; i < spaces.length(); i++) {
			//System.out.println(spaces.charAt(i));
			if (spaces.charAt(i) != ' ' ) {
				continue;
			} else {
				numSpaces++;
			}
			
		}
		System.out.println("there are " +numSpaces + " spaces in your string ");
		
		
			  
			  	//for loops
			  	//count 1 - 10
			  	//for(int i = 1; i <=10; i++){
			  	//	System.out.println(i);
			  	//}
			  	
			  	//counts to 10 by 2
			  //	for(int i = 1; i <=10; i++){
			  //		System.out.println(i += 1);
			  	//}
			  	
			  //	or
			  	
			  	//for(int i = 0; i <=10; i+=2){
			  	//	System.out.println(i);
			  //	}
			  	
			  	
			  	//print 30 by 3
			  //	for(int i = 0; i <= 30; i+=3){
			  	//	System.out.println(i);
			  	//	if(i == 15 ){
			  	//	System.out.println("Midpoint")
			  //	}else{
			  	//	System.out.println("");
			  //	}
			  //	}
			  	
			  	
			 // 	for(int i = 0; i <= 100; i+=7){
			  //		if(i == 28 || i == 49){   //or if(i != 28 && i != 49){
			  	//		continue;
			  	//	}
			  	//	System.out.println(i);
			 // 	}



				//	for(int i = 0; i <= 10; i++){
				//		if(i==5){
				//			System.out.println("I'm alive.");
				//			}else{
				//			System.out.println("The number is "+i);
				//		}
				//	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
