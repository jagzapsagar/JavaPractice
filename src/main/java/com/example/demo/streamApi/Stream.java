package com.example.demo.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {

		ArrayList<Integer> no = new ArrayList<>();
		no.add(2);
		no.add(3);
		no.add(5);
		no.add(10); 
		no.add(14);
		
		List<Integer> even = new ArrayList<Integer>();
		for ( Integer i : no) {
			if(i % 2 == 0) {
				even.add(i);
			}
		}
		System.out.println("Using Tradination " + even);
		
		//Using Stream Api
		
		List<Integer> evenS = no.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		System.out.println("Using Stream Api " + evenS);
	}

}
