package com.JavaProject1;

public class Variables {
	
	 public static int b=35;
	 public static String s="java";
	
	
	public void girl() {
		int a=55;
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
	}
	

	
	int c=88;
	 
	public static void main(String[] args) {
		
		Variables ob= new Variables();
		
		ob.girl();
		System.out.println(b);
		System.out.println(s);
		System.out.println(ob.c);
		
		
	}
	
	
}