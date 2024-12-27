package com.example.demo.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class reverseEachWordOfString {
	public static void main(String[] args) {
		String str = "Yeola is my city";
		
		//Reverse each word
		String[] split = str.split(" ");
		List<String> li = Arrays.stream(split).map(e -> new StringBuilder(e).reverse().toString()).collect(Collectors.toList());
		System.out.println(li);
		
		//reverse String noy by alphaate
		
		String string = Arrays.stream(str.split(" ")).reduce((a,b) -> b +" "+a).toString();
		System.out.println(string);
	}
	
	
	

}
