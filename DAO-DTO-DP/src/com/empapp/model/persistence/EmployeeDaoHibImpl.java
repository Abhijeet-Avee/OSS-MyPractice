package com.empapp.model.persistence;

import java.util.List;

import com.empapp.model.exceptions.DataAccessException;
import com.empapp.model.exceptions.EmployeeNotFoundException;
import com.empapp.model.exceptions.HibernateException;

public class EmployeeDaoHibImpl implements EmployeeDao{

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		//hibernate code....
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(int id, Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAll() throws DataAccessException {
		System.out.println("getting all emp by hibrenate..");
		try {
			if(1==2)
				throw new HibernateException();
		}catch(HibernateException e){
			throw new DataAccessException(e);
		}
		return null;
	}

	@Override
	public Employee getById(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
