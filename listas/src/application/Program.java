package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		/* Esse é o comando para instanciar uma lista do tipo
		 String (precisa usar o Wrapper Class), e como é do tipo Interface
		 necessita de uma classe para ser implementada nesse caso foi utilizada 
		 a classe ArrayList
		 */
		
		list.add("Maria"); // Adicionar o elemento "Maria" na lista
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); // Adicionar o elemento "Marco" na posição 2
		
		System.out.println(list.size()); // Tamanho da lista
		
		for (String name : list) {
			System.out.println(name);
		}
		
		// list.remove(1); // Remove o elemento da posição 1
		// list.remove("Anna"); // Remove o elemento "Anna"
		list.removeIf(x -> x.charAt(0) == 'M'); // Remoççao por predicado, no caso irá remorver todos os elementos que começarem com a letra M
		
		System.out.println("---------------------------------------------------");
		for (String name : list) {
			System.out.println(name);
		}
		
		System.out.println("---------------------------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		System.out.println("---------------------------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		/* Esse comando acima filtra os elementos da lista, para uma nova lista que tenha apenas 
		 elementos iniciados com A, para isso ele deve: converter a lista para stream, utilzar o metodo filter, 
		 passando um predicado lambda e por último com o collect passar do stream para lista novamente
		 */
		
		for (String name: result) { // print da lista nova result apenas com os elementos inciados com A
			System.out.println(name);
		}
		
		System.out.println("---------------------------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
