package productApp.controller;

import java.sql.SQLException;

import productApp.model.exceptions.DataAccessException;
import productApp.model.repository.Product;
import productApp.model.service.ProductService;
import productApp.model.service.ProductServiceImpl;

public class MainClass {

	public static void main(String[] args) {
		ProductService productService=new ProductServiceImpl();
		Product product=new Product(11, "laptop", 67000, 3);
		try {
			productService.addProduct(product);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}
}
