package _12_Movie;

public class MovieObjects {

	public static void main(String[] args) {
		
		
			Movie usualSuspects = new Movie("Drama", 3, 10, true, true);
			usualSuspects.getMovieLength();
			usualSuspects.getboxOfficeGross();
		
			usualSuspects.genre = "Drama";
			usualSuspects.year =  1988;
			//usualSuspects.actors[0] = "Kevin";
			//usualSuspects.actors[1] = "Gabriel";
			//usualSuspects.actresses[0] = "Suzy";
			//usualSuspects.actresses[1] = "Christin";
			usualSuspects.boxOfficeGross = 10;
			usualSuspects.inRedbox = true;
			usualSuspects.onNetflix = true;
			usualSuspects.movieLength = 3;
			

		
		//Movie tommyBoy = new Movie();
		//tommyBoy.movieLength = 120;
		//tommyBoy.boxOfficeGross = 20;
		
		//usualSuspects.getMovieLength();
		//tommyBoy.getMovieLength();
		
		
		//usualSuspects.getboxOfficeGross();
		//tommyBoy.getboxOfficeGross();
		
		
		//System.out.println(usualSuspects.genre);
		
		Movie tommyBoy = new Movie("Comedy", 115, 7500000, false, false);
		tommyBoy.getboxOfficeGross();
		tommyBoy.getMovieLength();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
