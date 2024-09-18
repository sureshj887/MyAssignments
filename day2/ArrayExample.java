package week1.day2;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int[] num = {50, 55, 60, 68, 70, 73, 89, 57};
		int length = num.length;
		System.out.println(length);
		
		//Last value in Array
		System.out.println("Last value is "+num[length-1]);
		
		//First Value in Array
		System.out.println("First value is "+num[0]);
		
		//Sorting Array Ascending order
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);	
		}
		
		//Second largest value
		System.out.println("Second largest value is "+num[length-2]);
		
		////Sorting Array Descending order --> not working
		Arrays.sort(num);
		for (int i = 0; i < num.length; --i) {
			System.out.println(num[i]);
			
		}
		
		
	}

}
