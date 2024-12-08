package com.example.demo.video.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	private int id;
	private String name;
	private String gender;
	private int salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String gender, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}
	
	
}

public class GroupingByEx {
	
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"sagar", "male", 42000));
		list.add(new Employee(2,"Sita", "female", 52000));
		list.add(new Employee(3,"Rahul", "male", 82000));
		list.add(new Employee(1,"Ram", "male", 32000));
		
		Map<String, List<Employee>> map = list.stream().collect(Collectors.groupingBy(Employee::getGender));
		for(Map.Entry<String, List<Employee>> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		Map<String, Integer> sum = list.stream().collect(Collectors.groupingBy(e -> e.getGender(), Collectors.summingInt(t -> t.getSalary())));
		
		for(Map.Entry<String, Integer> t : sum.entrySet()) {
			System.out.println(t.getKey()+" "+ t.getValue());
		}
		
		Map<String, Long> count = list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		for(Map.Entry<String, Long> r : count.entrySet()) {
			System.out.println(r.getKey()+" "+ r.getValue());
		}
	}

}
