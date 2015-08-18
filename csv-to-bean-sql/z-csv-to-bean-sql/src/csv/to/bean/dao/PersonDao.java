package csv.to.bean.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import csv.to.bean.domain.Person;
import csv.to.bean.util.DatabaseUtil;

public class PersonDao {
	
	public static Boolean createNewPerson( Person person ) {
		
		Boolean resultBoolean = false;
		
		try {
			
			Connection connection = DatabaseUtil.getConnection();
			
			PreparedStatement preparedStatement = connection.prepareStatement( 
					
					"INSERT INTO account_database.person (FIRSTNAME, LASTNAME, AGE) VALUES (?, ?, ? )" 
					
				);
			
			preparedStatement.setString( 1 , person.getFirstname() );
			
			preparedStatement.setString( 2 , person.getLastname() );
			
			preparedStatement.setInt( 3 , person.getAge() );
			
			preparedStatement.execute();
			
			preparedStatement.close();
			
			resultBoolean = true;
			
		} catch (SQLException e) {
			
		}
		
		return resultBoolean;
		
	}
	
}
