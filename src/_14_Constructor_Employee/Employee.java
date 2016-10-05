package _14_Constructor_Employee;

public class Employee {

	//properties
	public String wholename;
	double salary;
	int startYear;
	int birthYear;
	public String department;
	
	
	//constructor
	//a constructor is a method that has the same name as the class itself - it builds
	//our instances or objects of that class type
	
	
	Employee(String name, double salary, int startYear, int birthYear) {
		this.wholename = name;
		this.salary = salary;
		this.startYear = startYear;
		this.birthYear = birthYear;
		
	}
	
	
	public void job(){
	System.out.println(wholename + " likes the " + department + " and has worked there since " + startYear);
	}
	
	
}
