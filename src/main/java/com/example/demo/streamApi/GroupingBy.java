package com.example.demo.streamApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class stud {

	private int id;
	private String name;
	private String gender;

	public stud() {
		super();
		// TODO Auto-generated constructor stub
	}

	public stud(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
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

	@Override
	public String toString() {
		return "stud [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}

}

public class GroupingBy {

	public static void main(String[] args) {
		ArrayList<stud> list = new ArrayList<>();

		list.add(new stud(1, "Sagar", "male"));
		list.add(new stud(2, "Sita", "female"));
		list.add(new stud(3, "Rahul", "male"));
		list.add(new stud(4, "Ram", "male"));

		Map<String, Long> count = list.stream().collect(Collectors.groupingBy(stud::getGender, Collectors.counting()));
		for (Map.Entry<String, Long> entry : count.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
		
		Map<String,List<stud>> collect = list.stream().collect(Collectors.groupingBy(e -> e.getGender()));
		for (Map.Entry<String, List<stud>> entry : collect.entrySet()) {
			System.out.println(entry.getKey()+ " "+ entry.getValue());
			
		}
		
		Map<String, Integer> sum = list.stream().collect(Collectors.groupingBy(e -> e.getGender(), Collectors.summingInt(e -> e.getId())));
		for(Map.Entry<String, Integer> e : sum.entrySet()) {
			System.out.println(e.getKey()+ " "+ e.getValue());
		}

	}

}
