package ocp_training.day1.lesdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Application {

	public static void main(String[] args) {
		// LocalDate
		//LocalTime
		//LocalDateTime
		//ZonedDateTime
		
		//1) Créating
		/*
		LocalDate ld = LocalDate.now();
		LocalDate ld2 = LocalDate.of(1990, Month.JANUARY, 10);
		System.out.println(ld);
		System.out.println(ld2);
		
		LocalTime lt = LocalTime.now();
		LocalTime lt2 = LocalTime.of(10, 15);
		
		System.out.println(lt);
		System.out.println(lt2);
		
		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime ldt2 = LocalDateTime.of(ld2, lt2);
		System.out.println(ldt);
		System.out.println(ldt2);
		
		//2) Manipulation
		ld = ld.plusDays(2);
		System.out.println(ld.plusDays(2));
		System.out.println(ld);
		
		String ch = "ocp";
		System.out.println(ch.replace("p", "a"));
		System.out.println(ch);
		
		StringBuilder sb = new StringBuilder("ocp");
		sb.reverse();
		System.out.println(sb);*/
		LocalDate ld = LocalDate.now();
		Period p = Period.of(2, 4, 5);
		System.out.println(ld.plus(p));
		// 3) Formatting
		
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(ld.format(f));
		System.out.println(f.format(ld));
		DateTimeFormatter fl = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(ld.format(fl));
		
		DateTimeFormatter ff = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(ld.format(ff));
		
		System.out.println(ZonedDateTime.now()); 

	}

}
