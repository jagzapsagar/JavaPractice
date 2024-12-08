package com.example.demo.exceptions;

public class ExceptioExample {
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println("How are you");
		
		int b = 20+30;
		System.out.println(b);
		
		try {
			int c = 45/0;
			System.out.println(c);
		}catch(Exception e) { 
			System.out.println(e);
		}

		System.out.println("Thanks for watching");
		
	}

}
