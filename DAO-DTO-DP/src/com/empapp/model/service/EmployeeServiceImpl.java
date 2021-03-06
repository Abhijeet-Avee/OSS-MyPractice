package com.empapp.model.service;

import java.util.ArrayList;
import java.util.List;

import com.empapp.model.exceptions.DataAccessException;
import com.empapp.model.exceptions.EmployeeNotFoundException;
import com.empapp.model.persistence.Employee;
import com.empapp.model.persistence.EmployeeDao;
import com.empapp.model.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		employeeDao = new EmployeeDaoImpl();
	}
	
	@Override
	public void addEmployee(Employee employee) {		
		employeeDao.addEmployee(employee);
		/**
		 * some extra business logic
		 * **/
	}

	@Override
	public void deleteEmployee(int id) {
		employeeDao.deleteEmployee(id);
	}

	@Override
	public void updateEmployee(int id, Employee employee) {
		employeeDao.updateEmployee(id, employee);
	}

	@Override
	public List<Employee> getAll() throws DataAccessException {
		List<Employee> employees = new ArrayList<>();
		employees = employeeDao.getAll();
		return employees;
	}

	@Override
	public Employee getById(int id) throws EmployeeNotFoundException {
		Employee employee = employeeDao.getById(id);
		return employee;
	}

}
