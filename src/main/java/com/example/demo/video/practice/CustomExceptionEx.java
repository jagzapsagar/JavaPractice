package com.example.demo.video.practice;

class InavaliAge extends RuntimeException{
	
	InavaliAge(String msg){
		super(msg);
	}
}

public class CustomExceptionEx {
	public static void main(String[] args) {
		int age = 12;
		
		try {
			if(age<18) {
				throw new InavaliAge("You are under Age");
			}
			else {
				System.out.println("You are eligible for vote");
			}
		}catch(InavaliAge e) {
			System.out.println(e);
		}
	}
	

}
