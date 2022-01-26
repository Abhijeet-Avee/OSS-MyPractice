package factory.dp.jdbc;

import java.sql.*;

public class JdbcConnectionDemo {
		public static void main(String[] args) {			
			try {
				Connection connection = JdbcConnectionFactory.getConnection();
//				Statement createStmt = connection.createStatement();
//				createStmt.execute("create table Book (id integer not null auto_increment, author varchar(255), isbn varchar(255), price double precision not null, title varchar(255), primary key (id));");
//				
				PreparedStatement statement = connection.prepareStatement("insert into Book (author, isbn, price, title) values (?, ?, ?, ?)");
				statement.setString(1, "yash");
				statement.setInt(2,1234 );
				statement.setDouble(3, 3333.6);
				statement.setString(4, "java head first");
				statement.executeUpdate();
				
				//Print all the details from table
				PreparedStatement getDetails = connection.prepareStatement("select * from Book");
				ResultSet result = getDetails.executeQuery();
				System.out.println("[ID] : [AUTHOR] : [ISBN] : [PRICE] : [TITLE]");
				while(result.next()) {
					System.out.println(result.getInt(1)+" : "+result.getString(2)+":"+result.getInt(3)+":"+result.getDouble(4)+":"+result.getString(5));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
