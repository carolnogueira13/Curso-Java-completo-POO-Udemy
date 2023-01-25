package application;

import java.io.File;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory); // mostra as pastas da pasta digitada
		System.out.println("FOLDERS: ");
		for (File folder: folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile); // mostra os arquivos da pasta digitada
		System.out.println("FILES: ");
		for (File file: files) {
			System.out.println(file);
		}
		
		boolean sucess = new File(strPath + "\\ana").mkdir(); // cria no caminho digitado uma subpasta com o nome que foi definido no caso /ana
		System.out.println("Diretório criado com sucesso: " + sucess);
		
		
		
		
		
		
		sc.close();

	}

}
