package com.example.demo.video;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class MainClass {
	
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"Sanket", 52000));
		list.add(new Employee(2,"Shantanu", 82000));
		list.add(new Employee(3, "rahul", 78000));
		list.add(new Employee(4, "Sham", 48000));
		
		Optional<Employee> highSalary = list.stream().max(Comparator.comparingDouble(Employee::getSalary));
		System.out.println("Highest Salary Employee " + highSalary);
		
		Optional<Employee> minSalary = list.stream().min(Comparator.comparingDouble(Employee::getSalary));
		System.out.println("Minimum Salary Employee "+ minSalary);
	}

}
