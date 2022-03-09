package com.JavaProject1;

public class Arrays {
	public static void main(String[] args) {
		
		int a[]= new int[5];
		
		a[0]= 45;
		a[1]=55;
		a[2]=65;
		a[3]=75;
		a[4]=85;
		
		System.out.println(a[3]);
		
		int length= a.length;
		System.out.println(length);
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
			
		
		}
		
		
	}

}
