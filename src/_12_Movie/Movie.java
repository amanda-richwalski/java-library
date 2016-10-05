package _12_Movie;

public class Movie {

	//Properties
	String genre;
	String title;
	double year;
	int movieLength;
	String marketSegment;
	boolean onNetflix;
	boolean onDemand;
	//String[] actors;
	//String[] actresses;
	int boxOfficeGross;
	boolean inRedbox;
	
	//methods
	public void getMovieLength() {
		System.out.println(movieLength);
	}
	
	
	
	//create a new method that prints boxOfficeGross
	
	
	public void getboxOfficeGross() {
		System.out.println(boxOfficeGross);
	}
	
	//constructor
	public Movie(String genre, int movieLength, int boxOfficeGross, boolean inRedbox, boolean onNetflix){
		this.genre = genre;
		this.movieLength = movieLength;
		this.boxOfficeGross = boxOfficeGross;
		this.inRedbox = inRedbox;
		this.onNetflix = onNetflix;
		
		
	}
	
	
	
	
}
