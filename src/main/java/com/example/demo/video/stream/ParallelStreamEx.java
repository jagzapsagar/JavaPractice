package com.example.demo.video.stream;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamEx {
	public static void main(String[] args) {
		
		System.out.println("Sequential Stream ");
		IntStream.range(1, 20).forEach(e -> {
			System.out.println(Thread.currentThread().getName()+ " "+ e);
		});
		
		System.out.println("Parallel Stream");
		IntStream.range(1, 20).parallel().forEach(e -> {
			System.out.println(Thread.currentThread().getName()+ " "+ e);
		});
		
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
		
		System.out.println("Seq Stream ");
		list.stream().forEach(e ->{
			System.out.println(Thread.currentThread().getName()+ " "+ e);
		});
		
		System.out.println("Parallel Stream ");
		list.parallelStream().forEach(e ->{
			System.out.println(Thread.currentThread().getName()+ " "+ e);
		});
	}

}
