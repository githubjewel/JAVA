//https://www.ntu.edu.sg/home/ehchua/programming/java/DateTimeCalendar.html
package datetime;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		  
		  Date now = new Date();
	      SimpleDateFormat dateFormatter = new SimpleDateFormat("EEEE, MMMM d");
	      System.out.println("Format 3:   " + dateFormatter.format(now));
	      
		
		
	}
}
