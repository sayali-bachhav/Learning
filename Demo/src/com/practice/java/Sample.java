package com.practice.java;

public class Sample {
	public void add() {
		System.out.println("this is add method");
	}

	public void read() {
		System.out.println("this is read method");
	}

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println("hi sayali");
		Sample s = new Sample();
		s.add();
		s.read();

	}

}
