package com.example.demo.video;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapFilterExm {
	public static void main(String[] args) {
		
		//Map: it is used for transforming data
		//Filter: it is used for filter data
		
		List<Integer> list = new ArrayList<>();
		list.add(25);
		list.add(20);
		list.add(60);
		list.add(45);
		list.add(80);
		
		list.stream().map(e -> e*2).forEach(System.out::println);
		
		//Filter
		List<Integer> filterList = list.stream().filter(e -> e<40).collect(Collectors.toList());
		System.out.println("Filter List " + filterList);
		
		List<Integer> both = list.stream().filter(e -> e<40).map(e -> e*2).collect(Collectors.toList());
		System.out.println("We are used both methods " +both);
	}

}
