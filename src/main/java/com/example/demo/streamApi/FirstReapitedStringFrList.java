package com.example.demo.streamApi;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstReapitedStringFrList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Sagar");
		list.add("Akash");
		list.add("Ram");
		list.add("Akash");
		list.add("Sagar");
		
		Map<String,Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(e -> e.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(collect);
		
		Optional<Entry<String,Long>> collect2 = list.stream().collect(Collectors
				.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(e -> e.getValue()>1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
				.entrySet().stream().findFirst();
		System.out.println(collect2.get());
	}

}
