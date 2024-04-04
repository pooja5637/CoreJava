package com.revision.core.Array;

import java.util.Scanner;

public class ReverseArray {
	
	public static void reverseArray(int[] array) {
		
		int startIndex = 0 ;
		int lastIndex = array.length - 1;
		
		while(startIndex < lastIndex) {
			
			int temp = array[startIndex];
		    array[startIndex] = array[lastIndex];
		    array[lastIndex] = temp;
		    
		    startIndex++;
		    lastIndex--;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size of array :");
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		
		int[] arr = new int[size];
		
		System.out.println("Enter " + size + " elements:");

		for(int i = 0 ; i < size ; i++) {
			
			arr[i] = sc.nextInt();
		}

		
		reverseArray(arr);
		
		System.out.println("reversed array :");
		
		for(int i : arr) {
			System.out.println(i);
		}
		
	}

}
