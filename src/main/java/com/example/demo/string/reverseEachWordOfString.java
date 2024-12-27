package com.example.demo.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class reverseEachWordOfString {
	public static void main(String[] args) {
		String str = "Yeola is my city";
		String[] split = str.split(" ");
		List<String> li = Arrays.stream(split).map(e -> new StringBuilder(e).reverse().toString()).collect(Collectors.toList());
		System.out.println(li);
	}
	
	
	

}
