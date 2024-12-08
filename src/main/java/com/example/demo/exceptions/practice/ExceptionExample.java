package com.example.demo.exceptions.practice;

class InvalidAge extends Exception{
	
	public InvalidAge(String msg){
		super(msg);
	}
}

 class Age{
	 
	 public void cheAge(int age) throws InvalidAge {
		 if(age<18) {
			 throw new InvalidAge("Chotuu");
		 }
		 else {
			 System.out.println("You Can Vote");
		 }
	 }
 }

public class ExceptionExample {
	public static void main(String[] args) {
		Age a = new Age();
		try {
			a.cheAge(15);
			a.cheAge(22);
		} catch (InvalidAge e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("-------END--------");
		
		
	}

}
