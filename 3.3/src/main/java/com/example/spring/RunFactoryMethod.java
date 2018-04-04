package com.example.spring;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class RunFactoryMethod {

	public static void main(String[] args) {
		/*
		 * Demostrar uso de NumberFormat
		 */
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(9878979823.51230));
		
		
		/*
		 * Obtener timezone local mediante clase Calendar
		 */		
		Calendar calendar = Calendar.getInstance();
		TimeZone timeZone = calendar.getTimeZone();
		System.out.println(timeZone);

	}

}
