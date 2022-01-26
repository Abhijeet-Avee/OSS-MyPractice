package productApp.model.repository;

import java.sql.SQLException;

import productApp.model.exceptions.DataAccessException;
import productApp.model.exceptions.HibernateException;

public class ProductDaoImplHib implements ProductDao{

	@Override
	public void addProduct(Product product)throws DataAccessException {
		System.out.println("product added to database using hibernate");
		try {
			
		
			if(1==2)
				throw new HibernateException();
		}catch(HibernateException ex) {
			throw new DataAccessException(ex);
		}
	}

}