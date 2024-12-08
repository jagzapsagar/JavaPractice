package com.example.demo.video;

class InvalidAge extends RuntimeException{
	
	InvalidAge(String msg){
		super(msg);
	}
	
}

public class CustomExceptionEx {

	public static void main(String[] args) {
		int age = 21;
		try {
			if(age<18) {
				throw new InvalidAge("Under age exception");
			}
			else {
				System.out.println("Eligible for vote");
			}
		}catch(InvalidAge e) {
			System.out.println(e);
		}
		
	}
}
