package csv.to.bean.service;

import java.util.List;

import csv.to.bean.domain.Person;

public class MainService {
	
	private final static String filePath = "/Users/oliviermarin/Desktop/rapport-stage-exemples/csv-to-bean/file/person.csv";
	
	public static void main(String[] args) {
		
		List<Person> personList = ParseCsvFileService.parseCsvFile( filePath );
		
		for (Person person : personList) {
			
			System.out.println( person.toString() );
			
		}
		
	}
	
}
