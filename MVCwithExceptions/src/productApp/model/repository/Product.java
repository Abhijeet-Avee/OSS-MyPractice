package productApp.model.repository;

//DTO: it is just like thaali to tranfer data from one layer to other
//POJO: plain old java object
public class Product {
	private int id;
	private String name;
	private double price;
	private int qty;
	
	public Product() {}
	
	public Product(int id, String name, double price, int qty) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [id=").append(id).append(", name=").append(name).append(", price=").append(price)
				.append(", qty=").append(qty).append("]");
		return builder.toString();
	}
	
	
}
