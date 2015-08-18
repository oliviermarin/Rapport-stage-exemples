package csv.to.bean.service;

import java.util.List;

import csv.to.bean.domain.Person;

public class MainService {
	
	private final static String filePath = "C:/Users/F78973/Desktop/person.csv";
	
	public static void main(String[] args) {
		
		List<Person> personList = ParseCsvFileService.parseCsvFile( filePath );
		
		for (Person person : personList) {
			
			System.out.println( person.toString() );
			
		}
		
	}
	
}
