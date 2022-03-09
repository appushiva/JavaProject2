package com.JavaProject1;

public class Stringmethods {

	
	public static void main(String[] args) {
		
		String a="Welcome To Tamilrockers Website";
		String b="All Language Movies are Available here";
		String z="Thankyou visit Again";
		
		int len = a.length(); 
		System.out.println(len);
		
		int len1 = b.length();
		System.out.println(len1);
		
		boolean eq = a.equals("Welcome To tamilrockers website");
		System.out.println(eq);
		
		boolean eq1 = b.equals("all Language Movies are Available here");
		System.out.println(eq1);
		
		boolean eql = a.equalsIgnoreCase("Welcome To tamilrockers website");
		System.out.println(eql);
		
		boolean eql1 = b.equalsIgnoreCase("all language movies are available here");
		System.out.println(eql1);
		
		char ch = a.charAt(12);
		System.out.println(ch);
		
		char ch1 = b.charAt(18);
		System.out.println(ch1);
		
		int in = a.indexOf('t');
		System.out.println(in);
		
		int in1 = b.indexOf('a');
		System.out.println(in1);
		
		int lin = a.lastIndexOf('a');
		System.out.println(lin);
		
		int lin1 = b.lastIndexOf('h');
		System.out.println(lin1);
		
		boolean c = a.contains("Movies");
		System.out.println(c);
		
		boolean c1 = b.contains("Movies");
		System.out.println(c1);
		
		String up = a.toUpperCase();
		System.out.println(up);
		
		String up1 = b.toUpperCase();
		System.out.println(up1);
		
		String lo = a.toLowerCase();
		System.out.println(lo);
		
		String lo1 = b.toLowerCase();
		System.out.println(lo1);
		
		boolean st = a.startsWith("wel");
		System.out.println(st);
		
		boolean st1 = b.startsWith("All");
		System.out.println(st1);
	
		
		boolean en = a.endsWith("ite");
		System.out.println(en);
		
		boolean en1 = b.endsWith("ite");
		System.out.println(en1);
		
		String re = a.replace('o','a');
		System.out.println(re);
		
		String re1 = b.replace('a','o');
		System.out.println(re1);
		
		String replace = a.replace("Website","Webpage");
		System.out.println(replace);
		
		String replace1 = b.replace("Available", "Download");
		System.out.println(replace1);
		
		String sub = a.substring(11);
		System.out.println(sub);
		
		String sub1 = b.substring(13);
		System.out.println(sub1);
		
		String subs = a.substring(8,20);
		System.out.println(subs);
		
		String subs1 = b.substring(13,32);
		System.out.println(subs1);
		
		String concat = a.concat(" "+b);
		System.out.println(concat);
		
		String concat2 = b.concat(" "+a);
		System.out.println(concat2);
		
		
	}
}
