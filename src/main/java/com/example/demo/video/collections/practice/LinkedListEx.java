package com.example.demo.video.collections.practice;

import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Sagar");
		list.add("Ram");
		list.add("Sita");
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list);
	}

}
