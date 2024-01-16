package com.practice;

public class Orange {
	
	// Eager way of creating singleton object
	private static Orange orange = new Orange();
	
	public static Orange getOrange() {
		return orange;
	}
}
