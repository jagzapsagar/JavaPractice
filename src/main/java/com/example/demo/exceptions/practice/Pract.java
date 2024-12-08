package com.example.demo.exceptions.practice;

public class Pract {
	public static void main(String[] args) {
		
		int a =15;
		int b= 0;
		try {
			int c= a/b;
		}catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("After catch");
		
		
	}

}
