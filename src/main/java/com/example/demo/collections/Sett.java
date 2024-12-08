package com.example.demo.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Sett {
	
	public static void main(String[] args) {
		Integer[] a = {2,3,4,5};
		Set<Integer> set = new HashSet<Integer>();
		//Set<Integer> set = new HashSet<Integer>(Arrays.asList(a));
		//OR//
		Collections.addAll(set, a);
		System.out.println(set);
		
		System.out.println(set.contains(3));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		System.out.println(set.removeIf(e -> e==4));
		System.out.println(set);
	}

}
