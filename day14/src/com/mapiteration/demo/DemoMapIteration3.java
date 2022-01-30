package com.mapiteration.demo;

import java.util.*;


public class DemoMapIteration3{
	
	public static void main(String[] args) {
		Map<Integer, String>result=new HashMap<>();
		result.put(90, "raj");
		result.put( 65,"ravi");
		result.put(70,"suman");
		
		long val=result.entrySet()
		.stream()
		.filter(e-> e.getKey()%2==0)		//Get only even keys
		.count();
		System.out.println(val);
	}

}