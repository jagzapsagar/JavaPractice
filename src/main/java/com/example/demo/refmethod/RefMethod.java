package com.example.demo.refmethod;

public class RefMethod {
	public static void main(String[] args) {
		
		//RefInterface RefInterfaceobj = stuff::doStuff;
		//RefInterfaceobj.doTask();
		
		//or
		
		//using thread
		Runnable runnble = stuff::threadTask;
		Thread t = new Thread(runnble);
		t.start();
		
		
		
		
		// OR
		
		/*
		 * RefInterface RefInterfaceobj = ()-> {
		 * System.out.println("in dotask from inter");
		 * 
		 * };
		 * 
		 * RefInterfaceobj.doStuff();
		 */
		
	}
	
	

}
