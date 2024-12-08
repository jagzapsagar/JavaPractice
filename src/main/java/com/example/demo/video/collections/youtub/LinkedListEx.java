package com.example.demo.video.collections.youtub;

import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Sagar");
		list.add("Ram");
		list.add("Sita");
		list.add("Ram");
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.addFirst("Ramesh");
		list.addLast("Rahul");
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.remove("Ram");
		System.out.println(list);
		System.out.println(list.contains("Sitaram"));
	}

}
