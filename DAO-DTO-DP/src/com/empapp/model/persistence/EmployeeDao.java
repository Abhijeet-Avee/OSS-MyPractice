package com.empapp.model.persistence;

import java.util.List;

import com.empapp.model.exceptions.DataAccessException;
import com.empapp.model.exceptions.EmployeeNotFoundException;

//DAO - Data Access Object
public interface EmployeeDao {
	public void addEmployee(Employee employee);
	public void deleteEmployee(int id);
	public void updateEmployee(int id,Employee employee);
	public List<Employee> getAll() throws DataAccessException;
	public Employee getById(int id) throws EmployeeNotFoundException;
}
