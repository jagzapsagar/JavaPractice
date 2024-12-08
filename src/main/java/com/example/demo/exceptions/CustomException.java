package com.example.demo.exceptions;

class Invalid extends Exception{
	public Invalid(String msg) {
		super(msg);
	}
}

class Age{
	 public void check(int age) throws Invalid {
		 if(age<18) {
			 throw new Invalid("Invalid age");
		 }else {
			 System.out.println("Eligible for vote");
		 }
	 }
}

public class CustomException {
	
	public static void main(String[] args) {
		
		Age a=new Age();
		try {
			a.check(22);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
