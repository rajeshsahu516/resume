package com.technoelevate.stringtodate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeString {

	public static void main(String[] args) {
String String = "1998-06-07";
LocalDate date = LocalDate.parse(String,DateTimeFormatter.ISO_DATE);
System.out.println(date);

	}

}
