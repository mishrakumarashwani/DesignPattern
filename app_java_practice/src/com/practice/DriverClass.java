package com.practice;

public class DriverClass {

	public static void main(String[] args) {
		Apple apple1 = Apple.getApple();
		System.out.println(apple1.hashCode());

		Apple apple2 = Apple.getApple();
		System.out.println(apple2.hashCode());
		
		System.out.println(Orange.getOrange().hashCode());
		System.out.println(Orange.getOrange().hashCode());
	}
	
}
