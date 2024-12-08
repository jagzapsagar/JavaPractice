package com.example.demo.streamApi;

import java.util.Scanner;

public class StringEx {
	
	public static void main(String[] args) {
		
		String ex=new String("SND");
		
		ex="Enzo";
		System.out.println(ex);
		
		String name;
		
		Scanner sc = new Scanner(System.in);
		//name= sc.next();
		name="Rahul";
		System.out.println(name);
		
		for(char c:name.toCharArray()){
			System.out.println(c);
		}
		
		String name1= "Sagar";
		String name2= "Sagar";
		
		if(name1.compareTo(name2)==0) {
			System.out.println("Using compairTo() True");
		}
		else
			System.out.println("Using compairTo() false");
		
		if(name1==name2) {
			System.out.println("Using == True");
		}
		else
			System.out.println("Using == false");
		
		String name3= new String("Sai");
		String name4= new String("Sai");
		
		if(name3.equals(name4)) {
			System.out.println("true");
		}
		else
			System.out.println("false");
		
		if(name3==name4) {
			System.out.println("Using == for String Obj true");
		}
		else
			System.out.println("Using == for String Obj false");
		
		
		System.out.println(name4.toLowerCase());
	
	}

}
