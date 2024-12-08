package com.example.demo.streamApi;

import java.util.List;
import java.util.Optional;

public class ReduceMethod {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(5,6,7,4);
		
		Optional<Integer> sum = list.stream().reduce((a, b) -> a+b);
		System.out.println(sum.get());
		
		List<String> str = List.of("How", "are", "you");
		
		Optional<String> str2 = str.stream().reduce((a,b) -> a + " "+b);
		System.out.println(str2.get());
	}

}
