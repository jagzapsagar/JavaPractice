package com.example.demo.thread.video;

class A implements Runnable{

	@Override
	public void run() {
		System.out.println("Class A is Running");
		
	}
	
}

class B implements Runnable{

	@Override
	public void run() {
		System.out.println("Class B is Running");
		
	}
	
}

public class ThreadRunble {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		
		t1.start();
		t2.start();
	}

}
