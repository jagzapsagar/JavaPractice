package com.example.demo.video.oops;

class Base {
	public static void Display() {
		System.out.println("Base Class");
	}
}

class Derived extends Base {

	public static void Display() {
		System.out.println("Derived Class");
	}

}

public class MainClass {
	public static void main(String[] args) {
		Base b = new Derived();
		b.Display();
	}

}
