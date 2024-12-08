package com.example.demo.array;

public class SortArray {
	public static void main(String[] args) {
		int[] a = {3,4,5,6,7,8};
		int size = a.length;
		//int[] sort = new int[size];
		int temp;
		for(int i=0;i<size;i++) {
			for(int j =i+1;j<size;j++) {
				if(a[j]<a[i]) {
					temp = a[i];
					a[i]= a[j];
					a[j]= temp;
				}
			}
		}
		for(int k : a) {
			System.out.println(k);
		}
	}

}
