package com.demo;

import java.util.Arrays;
import java.util.List;

public class StaticUtils {
	
	
	
	public static String range(){
		return "Welcome";
	}
	private String privateTest(String msg) {
		return msg+" Building";
	}
	
	public String getTest(String msg) {
		return privateTest(msg);
	}
	
}
