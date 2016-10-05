package _13_Friends;

public class Friends {

	
	String name;
	String firstname;
	String lastname;
	String occupation;
	int age;
	String sex;
	String school;
	int numYearsFriends;
	boolean isOnline;
	String response;
	String wallPost;
	String currCity;
	String hometown;
	boolean isMarried;
	String politicalParty;
	boolean isFriend;
	String gender;
	boolean isFemale;
	
	
	
	//methods
		public void getschool() {
			System.out.println(school);
		}
		
		
		
		//create a new method that prints boxOfficeGross
		
		
		public void getoccupation() {
			System.out.println(occupation);
		}
	
		public void getIsFriend(){
			if(isFriend){
				System.out.println(name + " is your friend.");
			} else {
				System.out.println(name + " is not your friend. Would you lie to add them?");
			}
			
		}
			
			public void getnumYearsFriends(){
				switch(numYearsFriends){
				case 5:
					response = "Your have been friends with " + name + "for " + numYearsFriends + "years";
					break;
				}
			}
			
			public void getSchool(){
				System.out.println(name + " goes to " + school);
			}
		
			
			//TODO - female as a boolean
			//nest an if else inside this else
			
			
			
			public void getisFemale(){
				if (isFemale = true){
				System.out.println("her");
			}else{System.out.println("him"); 
			
			}
				
				
			
			}
			
			
			
			public void cityCheck(){
				if(currCity != hometown){
					System.out.println(name + " has moved away from home.");
				}else{
					System.out.println(name + " is living in their hometown.");
				}
			}
			
			
			
			
}


		
		
	

