package day2;

// class is a template which contains data members and methods that work upon them
//java has 4 visibility modifiers: public, protected, default, private
class Part{
	private int id;				//instance variable
	private String name;
	private double price;
	private static String brand = "YMSLI"; 	//class variable
	
	Part(){
		System.out.println("This is default constructor");
	}
	
	public Part(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	//getter, setter/mutator
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(this.id==0)
			this.id = id;
		else
			System.out.println("Its already set");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public static String getBrand() {
		return brand;
	}
	public static void setBrand(String brand) {
		Part.brand = brand;
	}
	
	public void print() {
		System.out.println("Id: "+id+" Name: "+name+" Price: "+price+ " Brand: "+brand);
	}
}

class Inventory{
	private static final int PARTS_SIZE = 10;
	private String inventoryName;
	private Part[] parts = new Part[PARTS_SIZE];
	public Inventory(String inventoryName) {
		this.inventoryName = inventoryName;
		parts = new Part[PARTS_SIZE];
	}
	private int counter=0;
	public void addPart(Part part) {
		counter++;
		if(counter==PARTS_SIZE) {
			System.out.print("cannot add more parts");
			return;
		}
	}
}

public class DemoArrayOfObjects {

	public static void main(String[] args) {
		Part part = new Part(10,"yash",1000);
		part.print();
	}
}
