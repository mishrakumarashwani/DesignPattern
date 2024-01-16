package com.practice;

import java.lang.reflect.Constructor;

public class MyClass {

	public static void main(String[] args) throws Exception {
//		Apple apple1 = Apple.getApple();
//		System.out.println(apple1.hashCode());
//
//		Apple apple2 = Apple.getApple();
//		System.out.println(apple2.hashCode());
//		
//		System.out.println(Orange.getOrange().hashCode());
//		System.out.println(Orange.getOrange().hashCode());
		
		/*
		 * 1. Reflection API to break singleton pattern
		 */
		
		Apple a1 = Apple.getApple();
		System.out.println(a1.hashCode());
		
		Constructor<Apple> constructor = Apple.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Apple a2 = constructor.newInstance();
		System.out.println(a2.hashCode());
	}
	
}
