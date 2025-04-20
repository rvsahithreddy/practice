package practice.strings;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class PrintNextSaturday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalDate wednesday = today;
		while(wednesday.getDayOfWeek() != DayOfWeek.WEDNESDAY) {
			System.out.println(wednesday.getDayOfWeek());
			System.out.println(wednesday);
			wednesday = wednesday.plusDays(1);
		}
		
		
		System.out.println(wednesday);
	}

}
