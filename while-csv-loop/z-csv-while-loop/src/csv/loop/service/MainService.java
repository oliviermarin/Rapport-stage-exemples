package csv.loop.service;

import java.util.List;
import csv.loop.domain.Person;

public class MainService {
	
	private final static String filePath = "path/rapport-stage-exemples/while-csv-loop/file/person.csv";
	
	public static void main(String[] args) {
		
		List<Person> personList = RetrievePersonService.RetrievePerson( filePath );
		
		for (Person person : personList) {
			
			System.out.println( person.toString() );
			
		}
		
	}
	
}
