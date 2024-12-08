package com.example.demo.video;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNoUsingStream {
	
	public static void main(String[] args) {
		ArrayList<Integer> no = new ArrayList<>();
		no.add(1);
		no.add(2);
		no.add(6);
		no.add(15);
		no.add(18);
		
		List<Integer> even = new ArrayList<>();
		for(int i : no){
			if(i%2 == 0) {
				even.add(i);
			}
		}
		
		System.out.println("Using Tradination Method "+ even);
		
		//Using Stream API
		List<Integer> evenNo = no.stream().filter(e -> e%2==0).collect(Collectors.toList());
		System.out.println("Using Stream API " +evenNo);
		
	}
	
}
