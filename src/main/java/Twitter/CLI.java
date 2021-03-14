package Twitter;

import java.time.LocalDate;

public class CLI {
	
	public static void main(String[] args){
		
		// Test for query string
		
		int year = LocalDate.now().getYear();
		int month = LocalDate.now().getMonthValue();
		int day = LocalDate.now().getDayOfMonth();
		
		
		System.out.println("&to=" + year + "-" + month + "-" + day + "&from=" + year + "-" + month + "-" + day);
	}
	
}
