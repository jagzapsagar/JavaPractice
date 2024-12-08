package com.example.demo.video;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interfaces {
	public static void main(String[] args) {
		
		Consumer<Integer> con = e -> {
			System.out.println("Consumer is printing " +e);
		};
		con.accept(2020);
		
		Predicate<Integer> pre = e -> e%2==0;
		boolean flag = pre.test(5);
		System.out.println("Flag is " + flag);
		
		Supplier<Integer> sup = () -> (int) (Math.random() * 100);
		System.out.println("The Supplier Value is " +sup.get());
		
		List<Integer> supList = Stream.generate(sup).limit(10).collect(Collectors.toList());
		System.out.println("Ganerated By Supplier " +supList);
		
		Function<Integer, Integer> fun = e -> e*5;
		System.out.println("Function is returning "+fun.apply(23));
		
		//Function< Integer> funn = () -> 5;
		
		List<Integer> list = List.of(34,32,45,24,37,23);
		List<Integer> filterList = list.stream().filter(pre).map(fun).peek(con).collect(Collectors.toList());
		System.out.println(filterList);
		Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
		System.out.println("Min " + min.get());
		System.out.println("********************************");
		
		List<Integer> listN = Stream.generate(sup).limit(10).peek(con).filter(pre).map(fun).collect(Collectors.toList());
		System.out.println(listN); 
	}

}
