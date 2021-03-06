package csv.to.bean.hibernate.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import csv.to.bean.hibernate.domain.Person;
import csv.to.bean.hibernate.util.DataBaseUtil;

public class PersistPersonTest {

	public static void main(String[] args) {
		
		Session session = DataBaseUtil.getDataBaseUtil().getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Person person = new Person();
		
		person.setFirstname( "Olivier" );
		
		person.setLastname( "Marin" );
		
		person.setAge( 23 );
		
		session.persist( person );
		
		transaction.commit();
		
		session.close();
		
	}
	
}
