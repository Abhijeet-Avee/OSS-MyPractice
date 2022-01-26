package productApp.model.service;

import java.sql.SQLException;

import productApp.model.exceptions.DataAccessException;
import productApp.model.repository.Product;
import productApp.model.repository.ProductDao;
import productApp.model.repository.ProductDaoImpl;
import productApp.model.repository.ProductDaoImplHib;
import productApp.model.repository.ProductDaoImplMongdoDdb;

public class ProductServiceImpl implements ProductService {
	private ProductDao dao;
	
	public ProductServiceImpl() {
		this.dao = new ProductDaoImplMongdoDdb();
	}
	
	@Override
	public void addProduct(Product product) throws DataAccessException {
		//add some business logic*
		dao.addProduct(product);
	}

}
