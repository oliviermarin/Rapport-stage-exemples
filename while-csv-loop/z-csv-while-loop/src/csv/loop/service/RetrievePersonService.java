package csv.loop.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import csv.loop.domain.Person;
import csv.loop.util.DateUtil;
import au.com.bytecode.opencsv.CSVReader;

public class RetrievePersonService {
	
	public static List<Person> RetrievePerson(String filePath ) {
		
		List<Person> personList = new ArrayList<Person>();
		
		try {
			
			File file = new File( filePath );
			
			FileReader fileReader = new FileReader( file );
			
			CSVReader csvReader = new CSVReader( fileReader, ';' );
			
			List< String[] > lineList = csvReader.readAll();
			
			for ( String[] stringArray : lineList ) {
				
				if ( ! stringArray[0].startsWith( "#" ) ) {
					
					Person person = new Person();
					
					person.setFirstname( stringArray[0] );
					
					person.setLastname( stringArray[1] );
					
					person.setBirth( DateUtil.getDate( stringArray[2] ) );
					
					personList.add( person );
					
				}
				
			}
			
			csvReader.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		return personList;
		
	}
	
}
