package com.java;

import java.util.Iterator;

public class corejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;
		String name = "Chaitanya" ; 
		char letter = 'C';
		double dec = 5.5;
		boolean check = true;
		
		System.out.println(name);
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);
		
		String[] names = {"chaitanya","sid","jagdish","pravin","rohit"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		for (String S : names) {
			System.out.println(S);
		}
		
	}


}
