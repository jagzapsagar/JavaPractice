package com.example.demo.collections;

import java.util.HashSet;
import java.util.Iterator;


class A{
	public void test() {
		
	}
}

public class HashSetEx {
	public static void main(String[] args) {
		
		
		HashSet<Emp> set=new HashSet<>();
		
		Emp e1= new Emp("sagar", 1);
		Emp e2= new Emp("Rahul", 2);
		Emp e3= new Emp("Ganesh", 3);
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		
		Iterator<Emp> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
