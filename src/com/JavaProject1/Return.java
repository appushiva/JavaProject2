package com.JavaProject1;

public class Return {

/*	public void student() {
		
		int a=55;
		int b=65;
		int c= a+b;
		System.out.println(c);
		
	}
		public static void main(String[] args) {
			
			Return ob = new Return();
			ob.student();
		}

}*/

	int a=80;
	
	public static int stu(int a,int b) {
		return a+b;
	
	}
	
	public static String test (String msg) {
		return msg;
		
	}
	public static void main(String[] args) {
		
		
		int c=stu(25,55);
		System.out.println(c);
		String d = test("My name is shiva");
		System.out.println(d);
		
	}
	
	
	
	
	
	
	
	
}