package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class corejava2 {

	public static void main(String[] args) {
		
		ArrayList<String> a= new ArrayList<String>();
		a.add("chaitanya");
		a.add("javale");
		a.add("java");
		a.add("automation");
		System.out.println(a.get(3));
		
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("++++++++++++++++++++++++++++++");
		
		for ( String val  :a)
		{
			System.out.println(val);
		}
		
		System.out.println(a.contains("java"));
		
		String[] names = {"chaitanya","sid","jagdish","pravin","rohit"};
		List<String> nameArrayList= Arrays.asList(names);
		System.out.println(nameArrayList.contains("sid"));
		
		

	}

}
