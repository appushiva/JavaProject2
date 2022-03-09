package com.JavaProject1;

public class Keys extends Return{

		int a=90;

		public void test() {
			
			int a=55;
			System.out.println("LV is :"+a);
			System.out.println("CCV is :"+this.a);
			System.out.println("PCV is :"+super.a);
			

		}
	public static void main(String[] args) {
		
		Keys ob=new Keys();
		
		ob.test();
		
	}
	
}
