package com.example.demo.video.stream;

import java.util.ArrayList;
import java.util.List;

public class SumFunction {
	
	
	public static void main(String[] args) {
		List<Integer> li = List.of(4,8,6);
		int sum = li.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		
		ArrayList<EmployeeStream> eli = new ArrayList<>();
		eli.add(new EmployeeStream(1,"Sagar",45000,"male"));
		eli.add(new EmployeeStream(2,"Ravindr",35000,"male"));
		eli.add(new EmployeeStream(1,"Nandani",25000,"female"));
		eli.add(new EmployeeStream(1,"Shruti",26000,"female"));
		
		int sum2 = eli.stream().filter(e -> e.getGender().equals("male")).mapToInt(e -> e.getSalary()).sum();
		System.out.println(sum2);
	}

}
