package com.example.demo.array;

public class ReversArray {
	
	public static void main(String[] args) {
		
		int[] ar = {2,3,8,5,45,21,65};
		int size = ar.length;
		int j=size;
		int[] re = new int[size];
		for(int i=0;i<size;i++) {
			re[j-1]=ar[i];
			j=j-1;
			
		}
		for (int i : re) {
			System.out.println(i);
		}
	}

}
