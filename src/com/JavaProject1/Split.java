package com.JavaProject1;

public class Split {

	public static void main(String[] args) {
		
		String a="ALL LANGUAGE MOVIES ARE AVAILABLE HERE";
		String[] l = a.split(" ");
		
		for (int i = 0; i < l.length; i++) {
			System.out.println(l[i]);
						
		}
		
	}
}
