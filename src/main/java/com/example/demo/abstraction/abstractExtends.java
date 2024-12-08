package com.example.demo.abstraction;

abstract class parent {
	
	public abstract void drow();

}

 class class2 extends parent{

	@Override
	public void drow() {
		// TODO Auto-generated method stub
		System.out.println("Class2 drow executed");
		
	}
	
}
 
  class class3 extends parent{

	@Override
	public void drow() {
		// TODO Auto-generated method stub
		System.out.println("Class3 drow executed");
		
	}
	  
  }
  
  public class abstractExtends{
	  public static void main(String[] args) {
		  parent a = new class2();
		  parent b = new class3();
		  
		  a.drow();
		  b.drow();
		  
		
	}
  }
 
 
