package csv.to.bean.hibernate.service;

import java.util.List;

import csv.to.bean.hibernate.domain.Person;

public class MainService {
	
	public static void main(String[] args) {
		
		List<Person> personList = ParseCsvFileService.parseCsvFile( 
				
				"/Users/oliviermarin/Desktop/rapport-stage-exemples/csv-to-bean-hibernate/file/person.csv" );
		
		PersistPersonListService.persistPersonList( personList );
		
	}
	
}
