package com.example.demo.video.collections.insta;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		
	map.put(3, "Nashik");
	map.put(6, "Pune");
	map.put(2, "Mumbai");
	map.put(1, "Nagpur");
	System.out.println(map);
	System.out.println("Accessing key 2: " + map.get(2));
	System.out.println("Map Contain key 1: "+map.containsKey(1)); //true/false
	System.out.println("Map Contain Value Satara: "+map.containsValue("Satara"));
	map.remove(1);
	System.out.println(map);
	System.out.println("Map Size: "+map.size());
	map.clear();
	System.out.println(map.isEmpty());
	System.out.println(map);
	}

}
