package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

	
	public static Connection getCon(){
		
		Connection con=null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","Suvel@123");
		
		} 
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return con;
	}
	
}
