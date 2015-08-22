package csv.to.bean.service;

import java.util.List;
import csv.to.bean.dao.PersonDao;
import csv.to.bean.domain.Person;

public class PersistPersonListService {
	
	public static void persistPersonList( List<Person> personList ) {
		
		Integer personAddedInteger= 0;
		
		for (Person person : personList) {
			
			if ( PersonDao.createNewPerson( person ) ) {
				
				personAddedInteger++;
				
			}
			
		}
		
		System.out.println( personAddedInteger + " personnes ont été ajoutés à la table PERSON" );
		
	}
	
}
