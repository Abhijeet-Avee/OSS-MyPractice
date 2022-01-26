package productApp.model.service;

import java.sql.SQLException;

import productApp.model.exceptions.DataAccessException;
import productApp.model.repository.Product;

public interface ProductService {
	public void addProduct(Product product)throws DataAccessException;
}