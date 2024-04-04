package com.revision.core.Array;

public class CheckTwoArraysAreEqual {
	
	public static void main(final String[] args) {

		  final int[] array1 = { 1, 2, 3, 4, 5 };
		  final int[] array2 = { 1, 2, 3, 4, 5 };

		  final boolean intCheck = equals(array1, array2);
		  System.out.println("Two Integers are Equal :: " + intCheck);
		 }

	public static boolean equals(final int[] a1, final int[] a2) {
		
		  if (a1 == a2)
		   return true;
		  
		  if (a1 == null || a2 == null)
		   return false;

		 	  
		  if (a2.length != a1.length)
		   return false;

		  for (int i = 0; i < a1.length; i++)
		   if (a1[i] != a2[i])
		    return false;

		  return true;
		 }
		}
