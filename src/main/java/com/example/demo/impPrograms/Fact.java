package com.example.demo.impPrograms;

public class Fact {
	
	public static void main(String[] args) {
		
		int fact=1;
		int no=4;
		for(int i=1;i<=no;i++) {
			fact = fact*i;
		}
		
		System.out.println(fact);
	}

}
