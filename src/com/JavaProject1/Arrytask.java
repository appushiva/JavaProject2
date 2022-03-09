package com.JavaProject1;

public class Arrytask {

	
	
	public static void main(String[] args) {
	
				
		int a[]= new int[6];
		
		a[0]= 45;
		a[1]=55;
		a[2]=65;
		a[3]=75;
		a[4]=85;
		a[5]=95;
		
		String b[] = new String[6];
		b[0]="shiva";
		b[1]="vijay";
		b[2]="Raja";
		b[3]="Pritha";
		b[4]="Student";
		b[5]="Testing course";
		
		float c[]= new float[2];
		c[0]= 78.5f;
		c[1]= 98.7f;
		
		double d[]=new double[2];
		d[0]= 12345;
		d[1]=8765432;
		
		System.out.println(" The integer values:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+","); 
			
		}
		
		
		System.out.println();
		System.out.println();

		
		System.out.println(" The string data types are:");
		for (int i = 0; i < b.length; i++) {
			
			System.out.println(b[i]);
			
		}
		System.out.println();
		
		System.out.println("the float Date types:");
		System.out.println(c[0]);
		System.out.println(c[1]);
		
	
		System.out.println();
		
		System.out.println("The Data type of Double:");
		
		System.out.println(d[0]);
		System.out.println(d[1]);
		
	
		
	}
}
	
	
	


