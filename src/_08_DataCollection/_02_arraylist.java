package _08_DataCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Amanda");
		names.add("Steve");
		names.add("John");
		names.addAll(Arrays.asList("Rach", "Bob"));
		System.out.println(names);
		
		
		System.out.println(names.get(0));
		
		//Integers
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(4);
		nums.add(6);
		nums.add(8);
		nums.addAll(Arrays.asList(10, 12));
		System.out.println(nums);
		System.out.println(nums.get(2));
		
		//Doubles
		ArrayList<Double> newNums = new ArrayList<Double>();
		
		newNums.addAll(Arrays.asList(10.5, 12.5, 3.4));
		System.out.println(newNums);
		System.out.println(newNums.get(2));
		System.out.println(newNums.get(1));
		
		
		
	}

}
