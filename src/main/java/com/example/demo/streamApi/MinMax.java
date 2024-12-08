package com.example.demo.streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;



public class MinMax {
	
	public static void main(String[] args) {
		ArrayList<Empp> empList = new ArrayList<>();

		empList.add(new Empp ("ram", 41000));
		empList.add(new Empp ("sham", 62000));
		empList.add(new Empp ("sita", 26000));
		empList.add(new Empp ("rakesh", 81000));
		
		Optional<Integer> maxx = empList.stream().map(e -> e.getSalary()).max(Comparator.comparingInt(e -> e));
		System.out.println(maxx);
		
		Integer sum = empList.stream().filter(e -> e.getSalary()<50000).mapToInt(e -> e.getSalary()).sum();
		System.out.println(sum);
		
		List<String> names = empList.stream().map(e -> e.getName()).collect(Collectors.toList());	
		System.out.println(names);
	}
	

}

class Empp{
	  
	  private String name;
	  private int salary;
	  
	public Empp(String name, int salary) {
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

