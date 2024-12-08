package com.example.demo.thread.video;

class Task1 extends Thread{
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println("Thread1 "+ Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Task2 extends Thread{
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println("Thread2 "+Thread.currentThread().getName() + " " + i);
	}
}
}

public class ThreadExamples {
	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getName());
		
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		
		t1.start();
		t2.start();
	}

}
