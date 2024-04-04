package com.revision.core.Array;

public class DuplicateFinder {
	
	public static void main(String[] args) {
		
		int[] arr = { 2,4,2,5,6,4,7,8};
		
		System.out.println("Duplicate elements array are:");
		
		for(int i = 0 ; i < arr.length; i++) {
			
			for(int j = i + 1 ; j <arr.length ; j++) {
				
				
				if(arr[i] == arr[j]) {
					
					System.out.print(arr[i] + " ");
				}
				
				
				
			}
		}
	}

}
