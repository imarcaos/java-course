package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		
		//exercise 273 JDBC - data transactions
		Connection conn = null;
		Statement st = null;
		try {
			conn = DB.getConnection();
			
			conn.setAutoCommit(false); // make the operation stand for the operator
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 where DepartmentId = 1");
			
			// Simulate a error to brake the transaction
			int x = 1;
			if (x < 2) {
				throw new SQLException("Fake error");
			}

			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 where DepartmentId = 2");
			
			conn.commit(); // depend from the operator to confirm the transaction
			
			System.out.println("rows1 " + rows1);
			System.out.println("rows2 " + rows2);

		}
		catch (SQLException e) {
			try {
				conn.rollback(); // back to the original stage when the program get an error
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
				
			} catch (SQLException e1) { // when get error on rollback
				throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
			} 
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
		
		
	}

}
