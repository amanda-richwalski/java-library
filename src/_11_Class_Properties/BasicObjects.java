package _11_Class_Properties;

public class BasicObjects {

	public static void main(String[] args) {
		
		
		//Integer number = new Integer(5);
		//System.out.println(number);
		
		
		
		//paulsDreamCar - is the object or instance of the Car class.
		Car paulsDreamCar = new Car();
		paulsDreamCar.make = "Tesla";
		paulsDreamCar.model = "Model 3";
		paulsDreamCar.color = "Black";
		paulsDreamCar.isFast = true;
		paulsDreamCar.mpgCity = 300;
		
		
		//Example - Me
		Car amandasDreamCar = new Car();
		amandasDreamCar.make = "Land Rover";
		amandasDreamCar.model = "Pretty";
		amandasDreamCar.color = "Gray";
		amandasDreamCar.year = 2016;
		amandasDreamCar.leatherSeats = false;
		amandasDreamCar.isPopularAmongstMillenials = false;
		amandasDreamCar.marketSegment = "Gen Y";
		amandasDreamCar.type = "SUV";
		
		
		System.out.println("Amanda's dream car is a " + amandasDreamCar.model + amandasDreamCar.year  +  amandasDreamCar.color  +  amandasDreamCar.make);
				
				
		
		
		
		
		
		
		

	}

}
