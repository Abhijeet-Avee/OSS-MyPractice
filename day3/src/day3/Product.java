package day3;
public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	private int productQty;
	public Product(int productId, String productName, double productPrice, int productQty) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQty = productQty;
	}
		
	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public void printProductDetails() {
		System.out.println("productId: "+ productId);
		System.out.println("productPrice: "+ productPrice);
		System.out.println("productId: "+ productId);
		System.out.println("productId: "+ productId);
	}
}
