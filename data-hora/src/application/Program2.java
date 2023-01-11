package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program2 {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		LocalDate d04 = LocalDate.parse("2022-09-23");
		LocalDateTime d05 = LocalDateTime.parse("2022-09-23T11:20:04");
		Instant d06 = Instant.parse("2022-09-23T11:20:04Z");
		
		DateTimeFormatter mf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter mf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter mf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		// ZoneID.systemDefault() = Para poder pegar o fuso horário do sistema do computador em uso, ele converter para a hora no fuso horário do computador
		DateTimeFormatter mf4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter mf5 = DateTimeFormatter.ISO_INSTANT;
		
		
		
		System.out.println("d04 = " + d04);
		System.out.println("d04 formatada = " + d04.format(mf1)); // data formatada através do formato determinado no mf1
		System.out.println("d04 formatada = " + mf1.format(d04));
		
		System.out.println("d05 formatada = " + d05.format(mf1));
		System.out.println("d05 formatada = " + d05.format(mf2));
		System.out.println("d05 = " + d05.format(mf4));
		
		System.out.println("d06 formatada = " + mf3.format(d06)); // mostra a hora já no fuso horário local do computador
		System.out.println("d06  = " + mf5.format(d06));
		System.out.println("d06  = " + d06);
		
		
	}

}
