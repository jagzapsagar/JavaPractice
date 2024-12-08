package com.example.demo.refmethod;

public class stuff {
	
	public static void doStuff() {
		System.out.println("it is stufs class in dostufs methos");
	}
	
	public static void threadTask() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void PrintNo() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
