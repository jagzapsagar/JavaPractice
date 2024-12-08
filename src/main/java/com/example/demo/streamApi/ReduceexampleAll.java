package com.example.demo.streamApi;

import java.util.List;
import java.util.Optional;

public class ReduceexampleAll {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(8,6,4,2,3);
		
		List<String> str = List.of("Java", "Springboot", "SpringBatch","spring");
		
		Optional<String> reduce6 = str.stream().reduce((a,b)-> a.length()>b.length() ? a:b);
		System.out.println(reduce6.get());
		
		int result=0;
		for (Integer no : list) {
			result = result+no;
		}
		System.out.println(result);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		Integer reduce = list.stream().reduce(0,(a,b) -> a+b);
		System.out.println(reduce);
		
		Optional<Integer> reduce2 = list.stream().reduce(Integer::sum);
		System.out.println(reduce2.get());
		
		Optional<Integer> reduce3 = list.stream().reduce((a,b)-> a*b);
		System.out.println(reduce3.get());
		
		Optional<Integer> reduce4 = list.stream().reduce((a,b) -> a>b ? a:b);
		System.out.println("Max Value is "+reduce4);
		
		Optional<Integer> reduce5 = list.stream().reduce(Integer::max);
		System.out.println("Using Integer:max " + reduce5);
		
	}

}
