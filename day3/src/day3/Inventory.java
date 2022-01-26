package day3;

import java.util.LinkedList;

public class Inventory {
	private String inventoryName;
	private LinkedList<Product> products;
	
	public Inventory(String inventoryName) {
		this.inventoryName = inventoryName;
		this.products = new LinkedList<Product>();
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public void issue(int productId, int qty) {
		for(Product product: products) {
			if(product.getProductId()==productId) {
				if(product.getProductQty()>=qty) {
					product.setProductQty(product.getProductQty()-qty);
				}
				else
					System.out.println("Out of Stock");
			}
		}
	}
	
	public void procurment(int productId,int qty) {
		for(Product product: products) {
			if(product.getProductId()==productId) {
				product.setProductQty(product.getProductQty()+qty);
			}
		}
	}
	
	public void printInventoryDetails() {
		System.out.println("-------------");
		System.out.println("inventoryName: "+ inventoryName);
		System.out.println("--product list------");
		for(Product product: products) {
			product.printProductDetails();
		}
	}
}
