package com.example.demo.impPrograms;

public class Secondlargest {
	public static void main(String[] args) {
		
		int[] ar= {2,3,1,23,24,43};
		int temp;
		for(int i=0; i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				
			}
		}
		
		for(int i : ar) {
			System.out.println(i);
		}
	}

}
