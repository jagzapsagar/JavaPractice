package com.example.demo.thread;

 class MyThread1 extends Thread{
	 public void run() {
		 for(int i =0;i<5;i++) {
			 System.out.println("First Thread "+i);
			 try {
				currentThread().sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 
	 }
 }
 class MyThread2 extends Thread{
	 public void run() {
		 for(int i =0;i<5;i++) {
			 System.out.println("Second Thread "+i);
		 }
		 
	 }
 }

public class MultiThreadingEx {
	
	public static void main(String[] args) {
		
		MyThread1 obj1 = new MyThread1();
		MyThread2 obj2 = new MyThread2();
		
		obj1.start();
		obj2.start();
		
	}

}
