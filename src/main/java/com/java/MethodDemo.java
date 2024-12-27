package com.java;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodDemo d = new MethodDemo();
		String name = d.getdata();
		System.out.println(name);
		System.out.println("==============================================");
		String name2 = d.getdata2();
		System.out.println(name2);
		
		
		System.out.println("==============================================");
		DemoMethod2 d2 = new DemoMethod2();
		d2.getdata();
	}
	
	public String getdata() {
		System.out.println("Hello world");
		return "Chaitanya";
		
	}
	
	public static String getdata2() {
		
		System.out.println("Hello world from getdata2");
		return "Chaitanya from getdata2";
	}

}
