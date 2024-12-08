package com.example.demo.video.collections.insta.practice;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		
		LinkedList<Integer> list= new LinkedList<>();
		System.out.println("Before Add Element "+ list);
		list.add(25);
		list.add(35);
		list.add(45);
		list.add(55);
		System.out.println("After Add Element "+ list);
		list.add(2, 20);
		System.out.println("Added 2 on Index 0: "+ list);
		list.addFirst(100);
		System.out.println("100 Added in Index first: "+ list);
		list.addLast(900);
		System.out.println("900 Added in Index last: "+ list);
		list.remove(0);
		System.out.println("Remove 0th index Element: "+ list);
		list.removeFirst();
		System.out.println("Remove 1st Element: "+ list);
		list.removeLast();
		System.out.println("Remove last Element: "+ list);
		
		
	}

}
