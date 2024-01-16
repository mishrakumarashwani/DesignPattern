package com.practice;

public enum Apple {
	INSTANCE;
//	private static Apple apple;
	
	// constructor
//	private Apple() {
//		if(apple != null) {
//			throw new RuntimeException("You are trying to break singleton pattern");
//		}
//	}

	// Lazy way of creating singleton object
//	public static Apple getApple() {
//		if(apple == null) {
//			synchronized(Apple.class) {
//				if(apple == null) {
//					apple = new Apple();
//				}
//			}
//		}
//		return apple;
//	}
	public void test() {
		System.out.println("test method");
	}

}

/*
 * 1. constructor private
 * 2. object create with the help of method
 * 3. create private field to store object
 */

