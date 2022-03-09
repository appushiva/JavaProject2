package com.JavaProject1;

public class Upcast extends Upscast implements Loans {
	
	@Override
	public void student() {
		System.out.println("Appu");
		super.student();
	}
	
	
		public static void main(String[] args) {
			Upcast cc= new Upcast();
			cc.student();
			
		}


		@Override
		public void goldlon() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void carloan() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void personalloan() {
			// TODO Auto-generated method stub
			
		}


}
