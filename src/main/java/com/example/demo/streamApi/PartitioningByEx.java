package com.example.demo.streamApi;

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

public class PartitioningByEx {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(12);
		list.add(7);
		list.add(46);
		list.add(35);	
		Map<Boolean,List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(e -> e%2==0));
		System.out.println(collect.get(true));
		System.out.println(collect.get(false));
		System.out.println(collect);
		
		ArrayList<Emp> elist = new ArrayList<Emp>();
		elist.add(new Emp(1,"Sachin", 82000));
		elist.add(new Emp(2,"Shantanu", 22000));
		elist.add(new Emp(1,"Akash", 55000));
		elist.add(new Emp(1,"Pranav", 32000));
		
		Map<Boolean, List<Emp>> map =  elist.stream().collect(Collectors.partitioningBy(e -> e.getSalary()< 50000));
		System.out.println("salary is Less that50K: "+map.get(true));
		System.out.println(map.get(false));
	}

}

