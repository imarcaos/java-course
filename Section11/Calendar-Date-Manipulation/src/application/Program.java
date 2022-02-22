package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2022-02-22T09:09:09Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		System.out.println("---------------------");
		System.out.println("Obter Minutos e Mês");
		
		int minutes = cal.get(Calendar.MINUTE);
		// nao esquecer que o mes inicia com o valor 0 , ex. janeiro = 0
		// entao acrescentamos +1
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
			
	}

}
