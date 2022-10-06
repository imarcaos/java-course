package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		//exercise 273 JDBC - data transactions
		Connection conn = null;
		Statement st = null;
		try {
			conn = DB.getConnection();
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 where DepartmentId = 1");
			
			// Simulate a error to brake the transaction
			int x = 1;
			if (x < 2) {
				throw new SQLException("Fake error");
			}

			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 where DepartmentId = 2");
			
			System.out.println("rows1 " + rows1);
			System.out.println("rows2 " + rows2);

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
		
		
	}

}
