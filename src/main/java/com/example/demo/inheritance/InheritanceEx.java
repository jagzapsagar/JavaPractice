package com.example.demo.inheritance;

  class A{
	  int a=20;
	public void runn() {
		System.out.println("In A class Method run");
		
		Integer a=new Integer(20);
		Integer b=new Integer(20);
		
		if(a.compareTo(b)==0) {
			System.out.println("True");
		}
		
		
	}
	
	public void show() {
		System.out.println("SHow in A");
	}
}
  
  class B extends A{
	  int a=40;
	  @Override
	  public void runn() {
		  System.out.println("In B Class method run");
		  //super.runn();
	  }
	  
	  public void shows() {
			System.out.println("SHow in B");
		}
  }

public class InheritanceEx {
	public static void main(String[] args) {
		
		A a2=new A();
		a2.runn();
		a2.show();
		
		
		A a= new B();
		System.out.println(a.a);
		a.runn();
		a.show();
		
		
		B b= new B();
		b.runn();
		b.show();
		b.shows();
		
		
		
		//B b2=new A();
		
		
	}

}
