package com.example.demo.video.collections.insta;

import java.util.List;

public class CountFunction {
	public static void main(String[] args) {
		List<Integer> list = List.of(4,8,6,9,4);
		
		Long count = list.stream().count();
		System.out.println("Element Count: "+count);
		
		Long even = list.stream().filter(e -> e%2==0).count();
		System.out.println("Even no Count: "+even);
		
		List<String> strings = List.of("Anil", "Rahul", "Sanket","Ram");
		Long countmax = strings.stream().filter(e -> e.length()>4).count();
		System.out.println("Greater Than four Char: "+countmax);
	}

}
