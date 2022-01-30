package com.behavioral.parameterization;

//------new class with Apple as a argument--------
class AppleClass {
	public static boolean isGreen(Apple apple) {
		return apple.getColor().equals("green");
	}
}

public class Apple {
	private String color;
	private int weight;

	// instance method ? : this pointer/ref is passed implicity
	public boolean isGreen() {
		return color.equals("green");
	}

	public boolean isHeavy() {
		return weight >= 250;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Apple(String color, int weight) {
		this.color = color;
		this.weight = weight;
	}

	public Apple() {
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Apple [color=").append(color).append(", weight=").append(weight).append("]");
		return builder.toString();
	}

}