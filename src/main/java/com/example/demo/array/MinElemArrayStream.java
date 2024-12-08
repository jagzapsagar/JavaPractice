package com.example.demo.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class MinElemArrayStream {
	
	public static void main(String[] args) {
		int[] a = {43,23,8,98,5};
		
		Optional<Integer> min= Arrays.stream(a).boxed().min(Comparator.naturalOrder());
		System.out.println(min);
		
	}

}
