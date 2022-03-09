package com.JavaProject1;

public class Return1 {
	
	

	public static int stu(int a,int b) {
		return a+b;
	
	}
	
	public static String test (String msg) {
		return msg;
		
	}
	public static void main(String[] args) {
		
		
		int c=stu(22,66);
		System.out.println(c);
		String d = test("Selenium Testing");
		System.out.println(d);
		
	}
	
	

}
