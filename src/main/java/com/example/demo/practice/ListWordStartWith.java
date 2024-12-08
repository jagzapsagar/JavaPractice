package com.example.demo.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListWordStartWith {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Anil");
		list.add("Ram");
		list.add("Sham");
		list.add("Sunil");
		
		ArrayList<String> CheckList = new ArrayList<String>();
		
		for(String a : list){
			if(a.startsWith("S")) {
				CheckList.add(a);
			}
		}
		
		List<String> Str = list.stream().filter(e -> e.startsWith("S")).collect(Collectors.toList());
		
		Map<String, Integer> len = list.stream().collect(Collectors.toMap(e -> e, String::length));
		len.forEach((e,r)->{
			System.out.println(e+" "+r);
		});

	}

}
