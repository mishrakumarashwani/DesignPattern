package com.practice;

import java.io.Serializable;

public class Apple implements Serializable {
	private static Apple apple;
	
	// constructor
	private Apple() {
		if(apple != null) {
			throw new RuntimeException("You are trying to break singleton pattern");
		}
	}

	// Lazy way of creating singleton object
	public static Apple getApple() {
		if(apple == null) {
			synchronized(Apple.class) {
				if(apple == null) {
					apple = new Apple();
				}
			}
		}
		return apple;
	}

}

/*
 * 1. constructor private
 * 2. object create with the help of method
 * 3. create private field to store object
 */

