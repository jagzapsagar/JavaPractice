package com.example.demo.oops;

interface Inter1{
	public void Inter1();
	
	default void printInter() {
		System.out.println("Default");
	}
}

interface Inter2{
	public void Inter2();
}

class cat implements Inter1, Inter2{

	@Override
	public void Inter1() {
		// TODO Auto-generated method stub
		System.out.println("Cat is eating");
		
	}
	
	public void print() {
		System.out.println("Print cat");
	}

	@Override
	public void Inter2() {
		// TODO Auto-generated method stub
		
	}
	
}

class dog implements Inter1{

	@Override
	public void Inter1() {
		System.out.println("Dog is eating");
		
	}
	
}

public class TestInter {
	public static void main(String[] args) {
		
		Inter1 i = new cat();
		i.Inter1();
		i.printInter();
		
		
		Inter1 ik = new dog();
		ik.Inter1();
		ik.printInter();
		
		dog d = new dog();
		d.Inter1();
		
		
	}

}
