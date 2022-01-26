package day3;
//Building<>----Flat

class Flat{
	private String flatNumber;
	private String ownerName;
	private double price;
	public Flat(String flatNumber) {
		this.flatNumber = flatNumber;
	}	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void printFlatDetails() {
		System.out.println("Flat Number: "+flatNumber);
		System.out.println("Owner Name: "+ownerName);
		System.out.println("Price :"+price);
	}
}

class Building{
	private String buildingName;
	private String buildingLocation;
	
	private Flat flat;
	public void addFlat(String ownerName, double price) {
		flat = new Flat("1234");
		flat.setOwnerName(ownerName);
		flat.setPrice(price);
	}
	public void getFlatDetails(String flatNumber) {
		flat.printFlatDetails();
		System.out.println("buildingName: "+ buildingName);
		System.out.println("buildingLocation: "+ buildingLocation);
	}
}

public class DemoComposition {
	public static void main(String[] args) {
		Building building=new Building();
		building.addFlat("anil", 100000);
		building.getFlatDetails("1234");
		
		building=null;
	}
}
