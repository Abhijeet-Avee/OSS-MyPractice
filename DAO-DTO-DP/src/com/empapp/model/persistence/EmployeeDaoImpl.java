package com.empapp.model.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.empapp.model.exceptions.DataAccessException;
import com.empapp.model.exceptions.EmployeeNotFoundException;

public class EmployeeDaoImpl implements EmployeeDao {

	private Connection connection;

	public EmployeeDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public void addEmployee(Employee employee) {
		try {
			PreparedStatement insertData = connection
					.prepareStatement("insert into employee(" + "ename,city,desi,salary) values (?,?,?,?)");
			insertData.setString(1, employee.getEname());
			insertData.setString(2, employee.getCity());
			insertData.setString(3, employee.getDesi());
			insertData.setDouble(4, employee.getSalary());
			insertData.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void deleteEmployee(int id) {
		try {
			PreparedStatement deleteData = connection.prepareStatement("delete from employee where id=?");
			deleteData.setInt(1, id);
			deleteData.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void updateEmployee(int id, Employee employee) {
		try {
			PreparedStatement updateData = connection.prepareStatement("update employee set" + "salary=? where id=?");
			updateData.setDouble(1, employee.getSalary());
			updateData.setInt(2, employee.getId());
			updateData.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public List<Employee> getAll() throws DataAccessException {
		List<Employee> employees = new ArrayList<Employee>();
		try {
			Employee emp = null;
			PreparedStatement statement = connection.prepareStatement("select * from employee");
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				emp = new Employee(result.getInt(1), result.getString(2), result.getString(3), result.getString(4),
						result.getDouble(5));
				employees.add(emp);
			}
		}catch(SQLException e) {
			throw new DataAccessException(e);
		}
		return employees;
	}

	@Override
	public Employee getById(int id) throws EmployeeNotFoundException {
		Employee employee = null;
		try {
			PreparedStatement statement = connection.prepareStatement("select * from employee where id=?");
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			if (result.next()) {
				employee = new Employee(result.getInt(1), result.getString(2), result.getString(3), result.getString(4),
						result.getDouble(5));
			} else {
				throw new EmployeeNotFoundException("employee with id =" + id + " is not found");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return employee;
	}

}
