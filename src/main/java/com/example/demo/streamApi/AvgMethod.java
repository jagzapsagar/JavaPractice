package com.example.demo.streamApi;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class AvgMethod {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(20,41,62);
		
		
		double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println(avg);
	}

}
