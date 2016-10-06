package Gradebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//create variables
		
		int option = 0;
		System.out.println("Welcome To The Gradebook");
		Scanner userIn = new Scanner(System.in);
		ArrayList<Double> gradeBook = new ArrayList<Double>();
		
		//menu loop
		while(option!=6){
			
			//print the main menu
			System.out.println("--------------------------------------------");
			System.out.println("Please select an option from the list below:");
			System.out.println("1) Enter Values");
			System.out.println("2) Modify Entry");
			System.out.println("3) Delete Entry");
			System.out.println("4) View Stats");
			System.out.println("5) View All Entries");
			System.out.println("6) Exit Program");
			
			//user to select option
			option = userIn.nextInt();
			
			//Option 1 - enter values
			if(option==1){
				System.out.println("Please enter values. Type -1 to exit.");
				double gradeBookEntry = 0;
				
				//while loop for entering data
				while(true){
					gradeBookEntry = userIn.nextDouble();
					
					//Exit if -1
					if(gradeBookEntry==-1){
						break;
					}
					else{
						gradeBook.add(gradeBookEntry);
					}
				}
				
			}
		
			//option 2 - modify an entry
			if(option==2){
				System.out.println("Which index would you like to modify?");
				int index = userIn.nextInt();
				System.out.println("Replace Index:" + index + "Value: " + gradeBook.get(index) + "With what?");
				gradeBook.set(index, userIn.nextDouble());
				System.out.println("Successfully Set");
				
			}
			
			//option 3 - delete
			if(option==3){
				System.out.println("Which index would you like to delete?");
				int index = userIn.nextInt();
				gradeBook.remove(index);
				System.out.println("Removed");
			}
			
			//option 5 - view elements
			if(option==5){
				System.out.println("|Index| Value");
				for(int i = 0; i < gradeBook.size(); i++){
					//create rows
					System.out.println("| " + i + " | " + gradeBook.get(i));
				}
		
			}
			//option 4 - view stats
			if(option==4){
				//calculate avg
				double total = 0;
				for(int i = 0; i < gradeBook.size(); i++){
					total += gradeBook.get(i);
				}
				
				double average = total/gradeBook.size();
				
				//sort gradeBook
				ArrayList<Double> copiedGradeBook = new ArrayList<Double>();
				copiedGradeBook.addAll(gradeBook);
				Collections.sort(copiedGradeBook);
				//Extract max and min
				double max = copiedGradeBook.get(gradeBook.size()-1);
				double min = copiedGradeBook.get(0);
				
				double median = 0;
				//find median
				if(copiedGradeBook.size()%2==1){
					median = copiedGradeBook.get(copiedGradeBook.size()/2);
				}
				else
				{
					int secIndex = copiedGradeBook.size()/2;
					double firstMedian = copiedGradeBook.get(secIndex - 1);
					double secondMedian = copiedGradeBook.get(secIndex);
					median = (firstMedian + secondMedian)/2.0;
				}
				System.out.println("Database Stats");
				System.out.println("Average: " + average);
				System.out.println("Min:    " + min);
				System.out.println("Max:    " + max);
				System.out.println("Median:  " + median);
				System.out.println("Elements:" + gradeBook.size());

			
			}
		}
	}
}
