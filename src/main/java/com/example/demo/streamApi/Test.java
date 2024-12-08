package com.example.demo.streamApi;

import java.util.List;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		
		List<String> names = List.of("Sagar", "Ankita");
		
		List<String> NewList = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(NewList);
		
		names.stream().filter(e -> e.startsWith("A")).forEach(System.out::println);
	}

}
