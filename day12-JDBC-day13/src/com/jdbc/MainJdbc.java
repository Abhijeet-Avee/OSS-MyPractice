package com.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainJdbc {
	private static boolean tableExists(Connection connection, String tableName) throws SQLException{
		DatabaseMetaData meta = connection.getMetaData();
		ResultSet resultSet = meta.getTables(null, null, tableName, new String[] {"TABLE"});
		return resultSet.next();
	}
	private static void createTable(Connection connection) throws SQLException {
		Statement statement = connection.createStatement();
		statement.execute("create table employee("
				+ "id int not null auto_increment primary key,"
				+ "ename varchar(100) not null,"
				+ "city varchar(50) not null,"
				+ "desi varchar(10) not null,"
				+ "salary double not null"
				+ ")");
		System.out.println("Table created!!");
	}
	private static void getDetails(Connection connection) throws SQLException {
		PreparedStatement getDetails = connection.prepareStatement("select * from employee");
		ResultSet result = getDetails.executeQuery();
		System.out.println("[ID] : [NAME] : [CITY] : [DESIGNATION] : [SALARY]");
		while(result.next()) {
			System.out.println(result.getInt(1)+" : "+result.getString(2)+":"+result.getString(3)+":"+result.getString(4)+":"+result.getDouble(5));
		}
	}
	public static void main(String[] args) {
		try (Connection connection = ConnectionFactory.getConnection()) {
			if(!(tableExists(connection, "employee"))) {
				createTable(connection);
			}
			
			PreparedStatement insertData = connection.prepareStatement("insert into employee("
					+ "ename,city,desi,salary) values (?,?,?,?)");
			insertData.setString(1, "Abhijeet");
			insertData.setString(2, "raxaul");
			insertData.setString(3, "Engineer");
			insertData.setDouble(4, 55000.00);
			insertData.executeUpdate();
			
			getDetails(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}