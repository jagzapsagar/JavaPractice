package com.example.demo.video;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class SeconfHighestNumber {
	public static void main(String[] args) {
		List<Integer> no = List.of(20,45,85,47,12,85);
		
		Optional<Integer> number = no.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(number.get());
	}

}
