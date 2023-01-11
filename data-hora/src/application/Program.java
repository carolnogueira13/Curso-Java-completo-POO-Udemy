package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // padrão da entrada de dados
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now(); // instanciação de um objeto do tipo LocalDate
		LocalDateTime d02 = LocalDateTime.now(); 
		Instant d03 = Instant.now(); // data-hora global
		
		LocalDate d04 = LocalDate.parse("2022-09-23");
		LocalDateTime d05 = LocalDateTime.parse("2022-09-23T11:20:04");
		Instant d06 = Instant.parse("2022-09-23T11:20:04Z");
		Instant d07 = Instant.parse("2022-09-23T11:20:04-03:00"); // para determinar o fuso de GMT-3
		
		LocalDate d08 = LocalDate.parse("23/09/2022", fmt1); // Sobrecarga, utilizando o segundo argumento para interpretar o texto
		LocalDateTime d09 = LocalDateTime.parse("23/09/2022 14:02", fmt2);
		
		LocalDate d10 = LocalDate.of(2022, 07, 22);
		LocalDateTime d11 = LocalDateTime.of(2000, 04, 22, 10, 15);
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
	}

}
