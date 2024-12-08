package com.example.demo.video;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamOne {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Ram");
		list.add("Sham");
		list.add("Rahul");
		list.add("Kapil");
		list.add("Sanket");
		
		List<String> newList = new ArrayList<>();
		for(String a : list) {
			if(a.startsWith("R")) {
				newList.add(a);
			}
		}
		System.out.println("Using Tradination " + newList);
		List<String> streamList = list.stream().filter(e -> e.startsWith("R")).collect(Collectors.toList());
		System.out.println("Using Stream API "+ streamList);
		
		Map<String, Integer> len = list.stream().collect(Collectors.toMap(e -> e, String::length));
		
		len.forEach((e,r) -> {
			System.out.println(e +" "+ r);
		});
	}

}
