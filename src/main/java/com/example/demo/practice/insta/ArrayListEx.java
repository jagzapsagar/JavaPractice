package com.example.demo.practice.insta;

import java.util.ArrayList;

public class ArrayListEx {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arList = new ArrayList<Integer>();
		System.out.println("Initial List "+arList);
		arList.add(22);
		arList.add(40);
		arList.add(28);
		arList.add(10);
		System.out.println("Added 4 element "+ arList);
		arList.add(2, 222);
		System.out.println("Added 112 on Index 2: "+arList);
		arList.set(2, 333);
		System.out.println("Updated lis: "+arList);
		System.out.println("Get Index Two: "+arList.get(2));
		arList.remove(2);
		System.out.println("After Removing Index 2: "+arList);
	}

}
