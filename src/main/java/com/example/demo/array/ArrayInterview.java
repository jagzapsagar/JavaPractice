package com.example.demo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArrayInterview {

	public static void main(String[] args) {

		int[] a = { 2, 5, 3, 8 };
		
		Arrays.stream(a);
		
		Optional<Integer> min = Arrays.stream(a).boxed().min(Comparator.naturalOrder());
		
		
		//ArrayList<Integer> abc = 
				Arrays.stream(a).filter(e-> e%2==0).forEach(e -> {System.out.print(e);});
		
		//List<Integer> Alist = new ArrayList<>();
		List lista = Arrays.asList(a);
		lista.forEach(e-> {System.out.println("ARRAY TO LIST " + e);});
		
		//List<Integer> Alistt = new ArrayList<Integer>(lista);
		//List<Integer> l = Alistt.stream().filter(e -> e%2==0).toList();
		
		//System.out.println("----Array to List filter even "+l);
		
		
		String[] geeks = {"Rahul", "Utkarsh",
                "Shubham", "Neelam"};
		
		ArrayList<String> filter = (ArrayList<String>) Arrays.stream(geeks).filter(e -> e.startsWith("N")).collect(Collectors.toList());
		System.out.println("FILTER STRING ARRAY : "+filter);
		Arrays.stream(geeks).filter(e -> e.startsWith("N")).forEach(e -> {
					System.out.println(e);
					});
		
		Optional<String> Min = Arrays.stream(geeks).min(Comparator.naturalOrder());
		System.out.println("\n Min String "+ Min);

// Conversion of array to ArrayList
// using Arrays.asList
       List al = Arrays.asList(geeks);
       System.out.println(al);

		
		
		List<Integer> list = new ArrayList<>();
		//list.addAll(al);
		list.add(2);
		list.add(23);
		list.add(27);
		
		long count= list.stream().filter(e -> e%2==0).count();
		System.out.println("COUNT___ "+ count);
		
		Optional<Integer> min4 = list.stream().min(Comparator.naturalOrder());
		System.out.println("min------ " + min4.get());
		
		Optional<Integer> max= list.stream().max(Comparator.naturalOrder());
		System.out.println("Max ----- " + max.get());
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum+" -----------Sum");
		
		


	}

}
