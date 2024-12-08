package com.example.demo.video;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		Consumer<Integer> con = e -> {
			System.out.println("The Value is " + e);
		};
		con.accept(20);
		
		//Predicate 
		Predicate<Integer> pre = r -> r%2==0;
		System.out.println("Result is " +pre.test(16));
		
		//Supplier
		Supplier<Integer> sup = () -> (int)(Math.random() * 100);
		int value = sup.get();
		System.out.println("Supplier Value " + value);
		
		//Function
		Function<Integer, Integer> fun = v -> v * 5;
		
		System.out.println(fun.apply(2));
		
		List<Integer> list = List.of(23,43,55,67,8,24,66);
		
		List<Integer> list2 = list.stream().filter(pre).map(fun).peek(con).collect(Collectors.toList());
		System.out.println("Filter List " +list2);
		
		List<Integer> SupEx = Stream.generate(sup).limit(10).collect(Collectors.toList());
		
		System.out.println("Using Supplier " + SupEx);
		
		
	}

}
