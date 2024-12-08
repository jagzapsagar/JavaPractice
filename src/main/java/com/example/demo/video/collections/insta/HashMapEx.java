package com.example.demo.video.collections.insta;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "Anil");
		map.put(2, "Sanket");
		map.put(3, "Shan");
		map.put(4, "Jeevan");
		
	System.out.println(map);
	System.out.println("Size is: "+map.size()); //return size of map
	System.out.println("Contain key 3: "+map.containsKey(3));//return true/ false
	System.out.println("Contain key : "+map.containsValue("Ram")); //return true/ false
	System.out.println("Removed value: "+map.remove(1)); //Return removed Value
	System.out.println("Get Value of key 4: "+map.get(4));
	System.out.println("key Set: "+map.keySet());
	map.clear();
	System.out.println(map.isEmpty());
	System.out.println(map);
	}

}
