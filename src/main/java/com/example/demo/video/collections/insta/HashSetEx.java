package com.example.demo.video.collections.insta;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		set.add(4);
		set.add(6);
		set.add(5);
		set.add(12);
		set.add(7);
		set.add(71);
		set.add(4);
		set.add(null);
		System.out.println(set);
		System.out.println("Size: "+set.size());	
		if(set.contains(6)) {
			System.out.println("Set Contain 6");
		}
		set.remove(6);
		System.out.println(set);
		
		for (Integer e : set) {
			System.out.println(e);
		}
	}

}
