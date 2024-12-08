package com.example.demo.video.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Emp{
	private int id;
	private String name;
	private int salary;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

public class PartitionByEx {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(22);
		list.add(35);
		list.add(18);
		list.add(44);
		list.add(55);
		
	 	Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(e -> e %2==0));
	 	System.out.println(map.get(true));
	 	System.out.println(map.get(false));
	 	
	 	ArrayList<Emp> emplist = new ArrayList<>();
	 	emplist.add(new Emp (1,"Sachin", 82000));
	 	emplist.add(new Emp (2,"Pranav", 30000));
	 	emplist.add(new Emp (3,"Rahul", 62000));
	 	emplist.add(new Emp (4,"Sanket", 70000));
	 	emplist.add(new Emp (5,"Shan", 75000));
	 	
	 	Map<Boolean, List<Emp>> emap = emplist.stream().collect(Collectors.partitioningBy(e -> e.getSalary()>50000));
	 	
	 	System.out.println(emap.get(true));
	 	System.out.println(emap.get(false));
	}

}
 