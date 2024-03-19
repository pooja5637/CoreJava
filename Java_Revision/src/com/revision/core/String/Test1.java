package com.revision.core.String;

public class Test1 {

	public static void main(String[] args) {

		String s1 = new String("pooja");
		String s2 = new String("pooja");
		
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		
		StringBuffer sb1 = new StringBuffer("pooja");
		StringBuffer sb2 = new StringBuffer("pooja");
		
		System.out.println(sb1==sb2);//false
		System.out.println(sb1.equals(sb2));//false
		
	}

}
