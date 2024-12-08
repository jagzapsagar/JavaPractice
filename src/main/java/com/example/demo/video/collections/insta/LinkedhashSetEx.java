package com.example.demo.video.collections.insta;

import java.util.LinkedHashSet;

public class LinkedhashSetEx {
	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		set.add(22);
		set.add(65);
		set.add(80);
		set.add(8);
		
		System.out.println(set);
		
		System.out.println("Contains '80'? : " + set.contains(80));
		System.out.println(set);
		set.remove(65);
		System.out.println("After Removing 65: " +set);
		System.out.println("Size of Set: "+ set.size());
		set.clear();
		System.out.println("isEmpty: "+set.isEmpty());
		System.out.println(set);
	}

}
