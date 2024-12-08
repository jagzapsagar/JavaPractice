package com.example.demo.streamApi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import ch.qos.logback.core.net.SyslogOutputStream;

public class FilterMapForeachLembda {
	
	public static void main(String[] args) {
		
		List<String> names = List.of("Sagar", "Kishor", "Ritesh");
		
		
		
		List<String> StartWith = names.stream().filter(e -> e.startsWith("R")).collect(Collectors.toList());
		System.out.println(StartWith);
		
		//for printing
				names.stream().forEach(System.out::println);
				names.stream().forEach(e ->{
					System.out.println(e);
				});
		
		List<Integer> nos = List.of(23,3,4,5,6,8);
		
		List<Integer> squer = nos.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println(squer);
		System.out.println("Printing in 1 line");
		nos.stream().map(j-> j*j).forEach(System.out::println);
		
		///
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    //
	    numbers.forEach(System.out::println);
	    //
	    Iterator<Integer> itr = numbers.iterator();
	    ArrayList<Integer> even = new ArrayList<Integer>();
		while(itr.hasNext()) {
			Integer no = itr.next();
			if(no % 2==0) {
				even.add(no);
				
			}
		}
		
		System.out.println("Using Stream");
		ArrayList<Integer> evenn = (ArrayList<Integer>) numbers.stream().filter(e -> e%2==0).collect(Collectors.toList());
		System.out.println("END");
		
		numbers.stream().forEach(System.out::println);
		numbers.stream().forEach(e -> {System.out.println("Using e "+e);});
		
	    
	    
	    //numbers.forEach( (n) -> { System.out.println(n); } );
		
		
		
	}

}
