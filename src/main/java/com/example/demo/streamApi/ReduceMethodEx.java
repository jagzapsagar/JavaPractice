package com.example.demo.streamApi;

import java.util.List;
import java.util.Optional;

public class ReduceMethodEx {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(2,6,4,8);
		
		List<String> str = List.of("java", "springboot", "springbatch", "spring");
		
		Optional<String> reduce6 = str.stream().reduce((a,b) -> a.length()> b.length() ? a:b);
		System.out.println("Max Length element is:  " + reduce6.get());
		
		
		
		int result = 0;
		for (Integer no : list) {
			result = result+no;
		}
		System.out.println("Sum of no. " + result);
		int sum = list.stream().mapToInt( e -> e).sum();
		System.out.println(sum);
		
		Integer reduce = list.stream().reduce(0 , (a,b) -> a+b);
		System.out.println("Using reduce Method " +reduce);
		
		Optional<Integer> reduce2 = list.stream().reduce(Integer::sum);
		System.out.println("Using method reference " +reduce2.get());
		
		Optional<Integer> reduce3 = list.stream().reduce((a,b) -> a*b);
		System.out.println("Product " +reduce3.get());
		
		Optional<Integer> reduce4 = list.stream().reduce((a,b) -> a > b ? a:b);
		System.out.println("Max Element " +reduce4);
		
		Optional<Integer> reduce5 = list.stream().reduce(Integer::max);
		System.out.println("Using method reference Max Element " +reduce5);
		
	}

}
