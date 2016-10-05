package _13_Friends;

import _12_Movie.Movie;

public class BasicObjects {

	public static void main(String[] args) {

		Friends amanda = new Friends();
		
		amanda.occupation = "Student";
		amanda.school = "Eleven Fifty";
		amanda.sex = "Female";
		
		
		//System.out.println(amanda.occupation);
		//System.out.println(amanda.school);
				
		
		Friends tommy = new Friends();
		tommy.school = "Purdue";
		tommy.occupation = "Engineer";
		tommy.name = "Tommy";
		tommy.currCity = "Chicago";
		tommy.numYearsFriends = 14;
		tommy.getSchool();
		
		
		amanda.getschool();
		tommy.getschool();
		
		
		amanda.getoccupation();
		tommy.getoccupation();
		
	}

}

