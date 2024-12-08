package com.example.demo.thread;

  class MyThread extends Thread{
	  @Override
	  public void run() {
		  int i =0;
		  while(i<10) {
			  System.out.println
			  ("Thread Is Running " + i);
			  i++;
		  }
	  }
  }
  
  public class SimpleThread {
	public static void main(String[] args) {
		MyThread obj = new MyThread();
		  obj.start();
		  
		  int i=0;
		  while(i<5) {
			  System.out.println
			  ("Thread is Already Started "+i);
			  i++;
		  }
		 
	}
	  
}
