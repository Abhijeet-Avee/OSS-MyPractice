package productApp.model.repository;

import java.sql.SQLException;

import productApp.model.exceptions.DataAccessException;
//sumit jdbc
public class ProductDaoImpl implements ProductDao{

	@Override
	public void addProduct(Product product)throws DataAccessException {
		System.out.println("product added to database using jdbc");
		try {
			
		
			if(1==2)
				throw new SQLException();
		}catch(SQLException ex) {
			throw new DataAccessException(ex);
		}
	}

}