package com.example.demo.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class ThreeListEvenOdd {
	
	public static void main(String[] args) {
		List<Integer> list1 = List.of(2,3,4,5,6,7);
		List<Integer> list2 = new ArrayList<>();
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		//without streamAPI
		List<Integer> result = new ArrayList<>();
		for(int i : list1) {
			if(i%2==0) {
				result.add(i);
			}
			
		}
		System.out.println(list1);
		System.out.println(result);
		
		//with stream API
		
		//Stream<Integer> stream = list1.stream();
		//List<Integer> result2 = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
		//System.out.println(result2);
		
		
	}
	
	
	

}
