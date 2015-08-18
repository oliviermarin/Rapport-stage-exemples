package csv.to.bean.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import csv.to.bean.constant.DatabaseConstant;

public class DatabaseUtil {
	
	private static Connection connection = null;
	
	public static Connection getConnection() {
		
		if ( connection == null ) {
			
			try {
				
				Class.forName( DatabaseConstant.JDBC_DRIVER );
				
				connection = (Connection)DriverManager.getConnection( 
						
						DatabaseConstant.DB_URL, 
						
						DatabaseConstant.USER, 
						
						DatabaseConstant.PASS 
						
					);
				
			} catch( ClassNotFoundException e ){
				
				e.printStackTrace();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
		return connection;
		
	}
	
}
