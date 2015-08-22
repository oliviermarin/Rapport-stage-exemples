package csv.to.bean.hibernate.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.CsvToBean;
import au.com.bytecode.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
import csv.to.bean.hibernate.domain.Person;

public class ParseCsvFileService {
	
	public static List<Person> parseCsvFile( String filePath ) {
		
		List<Person> personList = new ArrayList<Person>();
		
		try {
			
			File file = new File( filePath );
			
			FileReader fileReader = new FileReader( file );
			
			CSVReader csvReader = new CSVReader( fileReader, ';' );
			
			HeaderColumnNameTranslateMappingStrategy<Person> strategy = new HeaderColumnNameTranslateMappingStrategy<Person>();
			
			Map<String, String> columnMapping = new HashMap<String, String>();
		    
			columnMapping.put("FIRSTNAME", "firstname");
		    
			columnMapping.put("LASTNAME", "lastname");
		    
			columnMapping.put("AGE", "age");
		    
		    strategy.setColumnMapping( columnMapping );
			
			strategy.setType( Person.class );
			
			CsvToBean<Person> csv = new CsvToBean<Person>();
			
			personList = csv.parse( strategy, csvReader );
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		
		}
		
		return personList;
		
	}
	
}
