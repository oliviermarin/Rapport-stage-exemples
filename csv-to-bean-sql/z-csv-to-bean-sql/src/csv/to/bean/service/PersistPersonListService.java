package csv.to.bean.service;

import java.util.List;
import csv.to.bean.dao.PersonDao;
import csv.to.bean.domain.Person;

public class PersistPersonListService {
	
	public static void persistPersonList( List<Person> personList ) {
		
		for (Person person : personList) {
			
			PersonDao.createNewPerson( person );
			
		}
		
	}
	
}
