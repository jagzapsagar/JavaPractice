package com.example.demo.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.demo.array.Emp;

public class ArrayListEx {
	
	
	
	public static void main(String[] args) {
		
		//Emp emp;
		
		ArrayList<Emp> li= new ArrayList<Emp>();
		
		Emp emp1= new Emp(1,"Sagar", 2500);
		Emp emp2= new Emp(2,"Sagar", 2600);
		Emp emp3= new Emp(3,"Sagar", 2700);
		
		li.add(emp1);
		li.add(emp2);
		li.add(emp3);
		li.add(new Emp (4, "Akshay", 45000));
		
		Optional<Emp> maxsE = li.stream().max(Comparator.comparingDouble(Emp::getSalary));
		
		Optional<Emp> maxsEe = li.stream().max(Comparator.comparingDouble(Emp::getSalary));
		
		double sum = li.stream().mapToDouble(Emp::getSalary).sum();
		
		long count = li.stream().map(Emp::getId).count();
		
		Optional<Emp> SecondHSalary = li.stream()
				.sorted(Comparator.comparingDouble(Emp::getSalary).reversed()).skip(1).findFirst();
		System.out.println("SECOND HIGHEST SALARY EMPLOYEE " + SecondHSalary.get());
		
		System.out.println("For Each----------");
		li.stream().filter(e -> e.getSalary()>2550).forEach(e -> {System.out.print(e);});
		System.out.println("For Each----------");
		
		for(Emp e : li) {
			System.out.println(e);// if we r not write to string it will pring object not value
			//System.out.println(e.getId() + e.getName() + e.getSalary()); //if we r not write toString in model then use it
		}
		System.out.println("Using For each**************");
		li.forEach(e -> {System.out.println(e);});
		//double sum;
		double new1 = li.stream()
				.mapToDouble(Emp::getSalary)
				.sum();
		System.out.println(new1);
		
		Optional<Emp> maxEmp =  li.stream().max(Comparator.comparingDouble(Emp::getSalary));
		
		if(maxEmp.isPresent()) {
			System.out.println("MAX SALARY present " + maxEmp);
		}
		
		long countt = li.stream().count();
		System.out.println(countt);
		
		
		System.out.println(li.stream().findFirst());
		
		
		
	}

}
