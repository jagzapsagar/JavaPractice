package com.example.demo.thread;

public class Threadd {
	public static void main(String[] args) {
		
		Runnable thrd = ()->{
			System.out.println("Threasd 111111");
			for(int i =1;i<10;i++) {
				System.out.println(i+ " ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t = new Thread(thrd);
		t.start();
		
	}

}
