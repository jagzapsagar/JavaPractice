package com.example.demo.string;

public class StringEx {
	public static void main(String[] args) {
		String str = "abcdxyz";
		String str2 = new String("WERXYZ");
		
		String upc =str.toUpperCase();
		System.out.println(upc);
		
		System.out.println(str2.charAt(0));
		System.out.println(str.length());
		
		System.out.println("Sub 1: "+str.substring(1));
		String sub = str.substring(2, 4);
		System.out.println(sub);
		
		System.out.println(str.contains("cd"));
		
		System.out.println(str.replace("cd", "TY")); // return new String we should assigne it new variable
		System.out.println(str);
	}

}
