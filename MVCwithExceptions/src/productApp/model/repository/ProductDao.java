package productApp.model.repository;

import productApp.model.exceptions.DataAccessException;

public interface ProductDao {
	public void addProduct(Product product)throws DataAccessException;
}