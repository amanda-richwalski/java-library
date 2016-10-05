package _14_Constructor_Employee;

public class Objects_Inheritance {

	public static void main(String[] args) {
		
		
		
		Employee paul = new Employee("Paul", 100000, 1981, 2016);
		System.out.println(paul.salary);
		System.out.println(paul.wholename);
		
		Employee jenn = new Employee("Jenn", 10000000.00, 1982, 2015);
		Manager e200 = new Manager ("Sydney", 1000000000.00, 1996, 2016, "Java");
		Janitor steve = new Janitor ("Steve", 45.00, 1994, 2015, "Clean");
		
		System.out.println(steve.department);

		steve.job();
		e200.job();
		
		
	}

}
