package com.java;

public class corejava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is an object    //String literal
		
		//String s = "Chaitanya javale java";
		String s1 = "Chaitanya javale java";
		
		
		//using new
		String s2 = new String("welcome");
		String s3 = new String("welcome");
		
		String s = "Chaitanya javale java";
		String[] splittedstring = s.split(" ");
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[2]);
		System.out.println("=============================================");
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		
		String s10 = "Chaitanya javale java";
		String[] splittedstring1 = s10.split("javale");
		System.out.println(splittedstring1[0]);
		System.out.println(splittedstring1[1]);
		System.out.println(splittedstring1[1].trim());
		System.out.println("==============================================");
		
		for (int i = s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));
		}
		
		

	}

}
