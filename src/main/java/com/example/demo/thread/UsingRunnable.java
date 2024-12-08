package com.example.demo.thread;

class UsRun implements Runnable {

	@Override
	public void run() {
		System.out.println("Running----------");
		for(int i=0;i<5;i++) {
			System.out.println(i);
		
		}
		// TODO Auto-generated method stub
		
	}

	

}


public class UsingRunnable{
	public static void main(String[] args) {
		
		UsRun u=new UsRun();
		
		Thread t =new Thread(u);
		
		t.start();
		
	}
}
