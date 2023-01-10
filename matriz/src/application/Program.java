package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n]; // instanciar a matriz na memória
		
		int negativos = 0;
		
		for (int i=0; i < mat.length; i++) { //linhas
			for (int j=0; j < mat[i].length; j++ ) { // colunas
				mat[i][j] = sc.nextInt();
				if (mat[i][j] < 0) {
					negativos ++;
				}
			}
			
		}
		
		/* Para as matrizes são necessários 2 estruturas de for, o i percorre as linhas
		 e o j as colunas.*/
		
		System.out.println("Main diagonal: ");
		for (int i=0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println("\nNegative number: " + negativos);
		
		sc.close();

	}

}
