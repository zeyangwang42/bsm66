package com.demo;

import java.util.Map;
import java.util.HashMap;
import java.util.*;


public class TestVoidMethod {
	public Map<String,String> map =new HashMap<String,String>();
	private List l = new ArrayList();
	public void addString(String word, String meaning) {
		System.out.println("Real Method");
		map.put(word, meaning);
	}
	public void add(String word) {
//		System.out.println("Real Method");
		l.add(word);
	}
	public int size() {
//		System.out.println("Real Method");
		return l.size();
	}
}
