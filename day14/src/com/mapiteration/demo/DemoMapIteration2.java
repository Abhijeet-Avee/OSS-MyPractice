package com.mapiteration.demo;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;
class Value{
	private int val;

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public Value(int val) {
		this.val = val;
	}

	public Value() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Value [val=").append(val).append("]");
		return builder.toString();
	}
	
	
}
public class DemoMapIteration2 {

	public static void main(String[] args) {
		Map<Emp, Value>result=new TreeMap<Emp, Value>();
		result.put(new Emp(190, "suman", 80.00, "sales"), new Value(80));
		result.put(new Emp(12, "raj", 90.00, "it"), new Value(90));
		result.put(new Emp(628, "umesh", 59.00, "mkt"), new Value(59));
		
		System.out.println("---iteration in map---------");
	
//		result
//		.entrySet()
//		.stream()
//		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Emp::getSalary).reversed()))
//		//.sorted((o1,o2) -> Double.compare(o2.getKey().getSalary(), o1.getKey().getSalary()))
//		.forEach(entry-> System.out.println(entry.getKey()+": "+ entry.getValue()));
//		
		
		result
		.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue(Comparator.comparing(Value::getVal).reversed()))
		.forEach(entry-> System.out.println(entry.getKey()+": "+ entry.getValue()));
		
		
	}
}