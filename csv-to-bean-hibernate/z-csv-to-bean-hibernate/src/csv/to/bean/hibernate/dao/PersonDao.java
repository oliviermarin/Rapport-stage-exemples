package csv.to.bean.hibernate.dao;

import org.hibernate.Session;
import csv.to.bean.hibernate.domain.Person;
import csv.to.bean.hibernate.util.DataBaseUtil;

public class PersonDao {
	
	public static Boolean createNewPerson( Person person ) {
		
		Session session = DataBaseUtil.getDataBaseUtil().getSessionFactory().openSession();
		
		session.getTransaction().begin();
		
		session.persist( person );
		
		session.getTransaction().commit();
		
		session.close();
		
		return true;
		
	}
	
}
