package com.example.demo.practiceCodes;

class A{
	static int no=10;
	static int no2=50;
}

public class Variables {
	public static void main(String[] args) {
		A a=new A();
		A a2=new A();
		
		String s1="abc";
		String s2="abc";
		System.out.println(s1==s2);
		
		String s3=new String("xyz");
		String s4=new String("xyz");
		System.out.println(s3==s4);
		
		
		System.out.println(a.no);
		a.no=20;
		System.out.println(a2.no);
		System.out.println(A.no2);
		A.no2=100;
		System.out.println(A.no2);
		
	}

}
