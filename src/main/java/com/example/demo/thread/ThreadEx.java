package com.example.demo.thread;

class Ex extends Thread{
	public void run() {
		System.out.println("Thread is running");
		//int a=10;
		for(int a=0;a<10;a++) {
			System.out.println(a);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx {
	public static void main(String[] args) throws InterruptedException {
		Ex e=new Ex();
		Ex e2=new Ex();
		e.start();
		e2.start();
		
		
		System.out.println("After Start");
		e2.getState();
		System.out.println("---"+ e2.getState());
		
		/*
		 * for (int i = 0; i < 5; i++) { Ex object = new Ex(); object.start(); }
		 */
		
		System.out.println();
	}

}
