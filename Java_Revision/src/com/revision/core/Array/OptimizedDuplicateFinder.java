package com.revision.core.Array;

import java.util.HashSet;
import java.util.Set;

public class OptimizedDuplicateFinder {

	public static void findDuplicates(int[] arr) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		for (int value : arr) {
			{
				if(!set.add(value)) {
				System.out.print(value + " ");
				}
			}
			
		}
	}
	public static void main(String[] args) {

		 int[] arr = {1, 3, 5, 2, 4, 5, 3};

	      System.out.println("Duplicate elements in the array are:");
	      
	      findDuplicates(arr);
	}

}
