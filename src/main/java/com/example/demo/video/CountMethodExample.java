package com.example.demo.video;

import java.util.ArrayList;
import java.util.List;

public class CountMethodExample {
	public static void main(String[] args) {
		//Count 
		
		List<Integer> list = List.of(25,45,56,78,86,36);
		
		long elmCount = list.stream().filter(e -> e >50).count();
		System.out.println("Element Count is "+elmCount);
		
		ArrayList<Emp> empList = new ArrayList<>();

		empList.add(new Emp ("ram", 41000));
		empList.add(new Emp ("sham", 62000));
		empList.add(new Emp ("sita", 26000));
		empList.add(new Emp ("rakesh", 81000));
		
		System.out.println("Before Filter "+empList.stream().count());
		
		long empCount = empList.stream().filter(e -> e.getSalary()>50000).count();
		System.out.println("Employee Count Is "+ empCount);
		
	}

}

  class Emp{
	  
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
