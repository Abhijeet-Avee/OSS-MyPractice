package com.adapter.dp;

import java.util.*;

class RoundPeg{
	public void insertToHole(String data) {
		System.out.println("insert to hole :"+data);
	}
}

class SquarePeg{
	public void insertToSquare(String data) {
		System.out.println("insert to square :"+data);
	}
}

//this class act as a adaptor
class ShapeAdaptor extends SquarePeg{
	private RoundPeg peg;

	public ShapeAdaptor(RoundPeg peg) {
		this.peg = peg;
	}
	
	@Override
	public void insertToSquare(String data) {
		peg.insertToHole(data);
	}
	
}

public class AdapterDp {
	public static void main(String[] args) {
		RoundPeg roundPeg = new RoundPeg();
		
		SquarePeg squarePeg = new ShapeAdaptor(roundPeg);
		myMethod(squarePeg);
	}

	private static void myMethod(SquarePeg squarePeg) {
		squarePeg.insertToSquare("hello shape");		
	}
}
