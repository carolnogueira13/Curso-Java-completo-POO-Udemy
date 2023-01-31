package application;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>(); // rápido, mas não garante a ordem
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		
		System.out.println(set.contains("Notebook")); // se contém o elemento "Notebook"
		
		set.remove("Tablet");
		set.removeIf(x -> x.length() >= 3); // remove o elemnto com o tamanho maior e igual a 3 caracteres
		set.removeIf(x -> x.charAt(0) == 'T'); // remove o elemento que a primeira letra é T
		
		for (String p : set) {
			System.out.println(p);
		}

	}

}
