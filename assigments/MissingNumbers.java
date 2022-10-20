package week3.day2.assigments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem
		 * 
		 * int[] num = { 1, 4, 6, 2, 5, 7, 8, 9, 10 }; There will be running number
		 * between 1 to 10 One of the unique number will be missing Find the missing
		 * number
		 * 
		 * 
		 */
		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set 
		 * b) Make sure the set is in the ascending order 
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		int[] num = { 5, 4, 6, 2, 1, 7, 9, 8, 10 };

		List<Integer> data = new ArrayList<Integer>();

		for (Integer integer : num) {
			data.add(integer);
		}
		System.out.println("Given numbers in the list is::"+" "+data);
		Collections.sort(data);
		System.out.println("After sorting the numbers in the list is::"+" "+data);


		for (int i = 0; i < data.size(); i++) {
			if(data.get(i)!=(i+1)) {
				
				
			} 
			else {
				System.out.println(i);
			}

		}

	}
}
