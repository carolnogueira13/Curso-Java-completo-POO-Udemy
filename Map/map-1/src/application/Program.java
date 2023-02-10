package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "999721132");
		
		cookies.remove("email"); // remover a inserção de dados que tem "email" como chave
		cookies.put("phone", "993189751"); // nesse caso com o valor chave phone já existe, ele irá subescrver (substituir) por esse novo valor associado
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		
		
		
		System.out.println("ALL COOKIES: ");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key)); // coookies.get(key) pegar o valor associado a chave
		}
		

	}

}
