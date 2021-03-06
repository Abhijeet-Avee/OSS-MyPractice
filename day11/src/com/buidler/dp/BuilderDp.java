package com.buidler.dp;

class Food{
	private String name;
	private int unit;
	private int vitC;
	private int vitA;
	private int vitB12;
	private int vitB5;
	private int vitD;
	
	public Food(String name, int unit, int vitC, int vitA, int vitB12, int vitB5, int vitD) {
		super();
		this.name = name;
		this.unit = unit;
		this.vitC = vitC;
		this.vitA = vitA;
		this.vitB12 = vitB12;
		this.vitB5 = vitB5;
		this.vitD = vitD;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public int getVitC() {
		return vitC;
	}
	public void setVitC(int vitC) {
		this.vitC = vitC;
	}
	public int getVitA() {
		return vitA;
	}
	public void setVitA(int vitA) {
		this.vitA = vitA;
	}
	public int getVitB12() {
		return vitB12;
	}
	public void setVitB12(int vitB12) {
		this.vitB12 = vitB12;
	}
	public int getVitB5() {
		return vitB5;
	}
	public void setVitB5(int vitB5) {
		this.vitB5 = vitB5;
	}
	public int getVitD() {
		return vitD;
	}
	public void setVitD(int vitD) {
		this.vitD = vitD;
	}
}

class FoodBuilder{
	private String name;
	private int unit;
	private int vitC=100;
	private int vitA=20;
	private int vitB12=2000;
	private int vitB5=400;
	private int vitD=120;
	
	public FoodBuilder(String name, int unit) {
		super();
		this.name = name;
		this.unit = unit;
	}
	
	public Food build() {
		return new Food(name,unit,vitC,vitA,vitB12, vitB5, vitD);
	}

	public int getVitC() {
		return vitC;
	}

	public FoodBuilder setVitC(int vitC) {
		this.vitC = vitC;
		return this;
	}

	public int getVitA() {
		return vitA;
	}

	public FoodBuilder setVitA(int vitA) {
		this.vitA = vitA;
		return this;
	}

	public int getVitB12() {
		return vitB12;
	}

	public FoodBuilder setVitB12(int vitB12) {
		this.vitB12 = vitB12;
		return this;
	}

	public int getVitB5() {
		return vitB5;
	}

	public FoodBuilder setVitB5(int vitB5) {
		this.vitB5 = vitB5;
		return this;
	}

	public int getVitD() {
		return vitD;
	}

	public FoodBuilder setVitD(int vitD) {
		this.vitD = vitD;
		return this;
	}
	
	
}

public class BuilderDp {
	public static void main(String[] args) {
		Food food = new Food("parleg",10,2,12,1200,34,000);
		
		Food food2 = new FoodBuilder("parleg",10).setVitA(100).setVitB12(200)
				.setVitC(22).build();
	}
}
