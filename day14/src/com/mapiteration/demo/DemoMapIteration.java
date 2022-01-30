package com.mapiteration.demo;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;
public class DemoMapIteration {

	public static void main(String[] args) {
		
		Map<String, Integer>result=new HashMap<String, Integer>();
		result.put("raj", 90);
		result.put("ekta", 60);
		result.put("sumit", 70);
		System.out.println(result);
		System.out.println("---iteration in map---------");
		
		result.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(( o1,  o2)-> o2.compareTo(o1)))
		.forEach(System.out::println);
		
		
		//result.forEach((k, v)-> System.out.println(k+": "+ v));
		
//		Stream<Entry<String, Integer>> stream = result.entrySet()
//		.stream();
//		
//		stream.forEach(new Consumer<Entry<String, Integer>>() {
//
//			@Override
//			public void accept(Entry<String, Integer> entry) {
//				System.out.println(entry.getKey()+":"+ entry.getValue());
//			}
//		});
//		
	}
}