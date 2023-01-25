package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Ana Caroline\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) { // comando para percorrer as linhas do arquivo
				System.out.println(sc.nextLine());
			}
		} 
		catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} 
		finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Bloco finally executado!");
		}
	}
}