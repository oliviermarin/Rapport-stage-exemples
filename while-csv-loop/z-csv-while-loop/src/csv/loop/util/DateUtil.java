package csv.loop.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public static Date getDate( String DateString ) {
		
		Date result = null;
		
		try {
			
			String format = "dd/MM/yyyy";
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat( format );
			
			result = simpleDateFormat.parse( DateString );
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		
		}
		
		return result;
		
	}
	
}
