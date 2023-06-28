package com.demo;

import java.util.Map;

public class NumberCalculation {

	private Map<String,String> map;
	public int add(int x, int y) {
		return x+y;
	}
	
	public int subtract(int x,int y) {
		return x-y;
	}
	public int multiply(int x,int y) {
		return x*y;
	}
	public int divide(int x,int y) {
		return x/y;
	}
	
	public void addString(String word, String meaning) {
		System.out.println("Real Method");
		map.put(word, meaning);
	}
}
