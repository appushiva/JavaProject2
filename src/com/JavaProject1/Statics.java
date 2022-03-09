package com.JavaProject1;

public class Statics {
	
	
	static {
		System.out.println("This is STATIC Block");
		
	}	
	
	static int a=79;
	
	private static void student() {
		System.out.println("This is a STATIC Method ");
		
		

	}
	
	public static void main(String[] args) {
		
		System.out.println(a);
		student();
		
		System.out.println("This is main method:");
		
		
		
		
	}
		
	
	
	
}