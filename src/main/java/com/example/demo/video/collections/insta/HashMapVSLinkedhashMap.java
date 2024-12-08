package com.example.demo.video.collections.insta;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapVSLinkedhashMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> hashmap = new HashMap<>();
		hashmap.put(4, "Sagar");
		hashmap.put(5, "Ravi");
		hashmap.put(8, "Kapil");
		hashmap.put(2, "Kishor");
		System.out.println("---HashMap---");
		hashmap.forEach((e,r) -> {
			System.out.println(e+" "+r);
		});
	
		Map<Integer, String> linkmap = new LinkedHashMap<>();
		linkmap.put(23, "Ram");
		linkmap.put(32, "Sita");
		linkmap.put(10, "Rakesh");
		linkmap.put(45, "Pankaj");
		System.out.println("---Linked HashMap---");
		linkmap.forEach((e,r) -> {
			System.out.println(e + " " + r);
		});
		
	}

}
