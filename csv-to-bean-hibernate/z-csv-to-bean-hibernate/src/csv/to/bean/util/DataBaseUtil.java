package csv.to.bean.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataBaseUtil {
	
	private static DataBaseUtil dataBaseUtil;
	
	private SessionFactory sessionFactory;
	
	private DataBaseUtil(){
			
		sessionFactory = new Configuration().configure( "hibernate.cfg.xml" ).buildSessionFactory();
		
	}
	
	public static DataBaseUtil getDataBaseUtil() {
		
		if ( dataBaseUtil == null ) {
			
			dataBaseUtil = new DataBaseUtil();
			
		}
		
		return dataBaseUtil;
	
	}

	public SessionFactory getSessionFactory() {
	
		return sessionFactory;
	
	}
	
}
