package com.example.demo.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFilterMethod {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(80);
		list.add(20);
		list.add(70);
		list.add(40);
		list.add(25);
		
		//Map : it is used to transforming data
		//Filter : used to filter element according to given predicate
		
		list.stream().map(e -> e*2).forEach(System.out::println);
		System.out.println("Filter Element");
		list.stream().filter(e -> e < 40).forEach(e -> {
			System.out.println(e);
		});
		
		List<Integer> both = list.stream().filter(e -> e <40).map(e -> e*2).collect(Collectors.toList());
		System.out.println(both);
		
		list.forEach(e -> {
			System.out.println(e);
		});
		System.out.println("kkkkkkkkkkk");
		list.forEach(System.out::println);
		
		
		
	}

}
