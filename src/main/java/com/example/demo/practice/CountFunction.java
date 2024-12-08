package com.example.demo.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

 class Emp {
	 private String name;
	 private int salary;
	 
	 
	 
	public Emp(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + "]";
	}
	 
	 
 }

public class CountFunction {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(12,45,78,14,36);
		
		long count = list.stream().filter(e -> e<50).count();
		System.out.println("Count is " +count);
		
		List<Emp> empList = new ArrayList<>();
		empList.add(new Emp("Ram" , 25000));
		empList.add(new Emp("Sham" , 52000));
		empList.add(new Emp("Sita" , 45000));
		empList.add(new Emp("Rakesh" , 39000));
		empList.add(new Emp("Krushna" , 78000));
		
		long counte = empList.stream().filter(e -> e.getSalary()>50000).count();
		System.out.println("Count Of Employee "+counte);
		
		
		
		
	}

}
