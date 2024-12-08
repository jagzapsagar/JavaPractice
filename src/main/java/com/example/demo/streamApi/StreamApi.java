package com.example.demo.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ch.qos.logback.core.net.SyslogOutputStream;

public class StreamApi {
	
	
	//********WithoutStream API
	public void WithoutStreamAPI() {
		System.out.println("*******Without Stream Method****");
		// Create List and filter all even no
		
		List<Integer> listt= List.of(2,3,44,45,46);// it is immutable object
		//listt.add(33);
		//System.out.println(listt);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(45);
		System.out.println(list2);
		
		List<Integer> list3 = Arrays.asList(20,10,50);
		
		List<Integer> listEven = new ArrayList<>();
		
		for(Integer i : listt) {
			if(i%2 == 0) {
				listEven.add(i);
			}
		}
		System.out.println(listEven);
	}
	
	//using stream
	public void UsintStream() {
		System.out.println("******* using Stream Method****");
		List<Integer> listt= List.of(2,3,44,45,46,122);
		Stream<Integer> stream = listt.stream();
		
		List<Integer> newList = stream.filter(i->i%2 == 0).collect(Collectors.toList());
		System.out.println(newList);
		
		List<Integer> list100 = listt.stream().filter(i -> i > 100 ).collect(Collectors.toList());
		System.out.println(list100);
		
		List<Integer> LargList = listt.stream().filter(i->i>10).collect(Collectors.toList());
		System.out.println("larg no " + LargList);
	}
	
	//Stream Object
	public void StreamObjectt() {
		
		System.out.println("*******Stream Object Method****");
		//Stream<Object> empStream = Stream.empty();
		
		String names[] = {"Sagar", "Nita", "Pranav"};
		
		Stream<String> strm = Stream.of(names);
		strm.forEach(e->{
			System.out.println(e);
		});
	}
	
	public void element() {
		System.out.println("***********Element Method**********");
		List<String> name= List.of("sagar", "sanket", "Kishor");
		
		List <String> newList = name.stream().filter(e->e.startsWith("s")).collect(Collectors.toList());
		
		
		System.out.println(newList);
		
		//in one line how to print
		System.out.println("**************in one line how to print********");
		newList.stream().forEach(System.out::println);
		
		//how to yravers list of elements using forEach
		System.out.println("***********ForEach names from List********");
		name.stream().forEach(e->{
			System.out.println(e);
		});
		
		//Squer of list of numbers using stream
		List<Integer> nos = List.of(23,4,32,3,1,32);
		List<Integer> newList2 = nos.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(newList2);
		System.out.println("*******Sorted Element********");
		nos.stream().sorted().forEach(System.out::println);
		
		int min = nos.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("Min " +min);
		
		int max = nos.stream().max((x,y)-> x.compareTo(y)).get();
		System.out.println("Max no "+ max);
	}
	
	public static void main(String[] args) {
		StreamApi streamApi = new StreamApi();
		System.out.println("******Start********");
		streamApi.WithoutStreamAPI();
		streamApi.UsintStream();
		streamApi.StreamObjectt();
		streamApi.element();
		
	}

}
