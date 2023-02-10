package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD case", 80.90));
		
		/* Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice() * 1.1);
		};*/
		
		// list.forEach(new PriceUpdate()); // Implementação da interface
		//list.forEach(Product :: staticPriceUpdate); // Reference method para método static na classe Product
		//list.forEach(Product :: PriceUpdate); // Reference method para método não static na classe Product
		// list.forEach(cons); // Expressão lambda declarada
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1)); // Expressão lambda inline
		
		
		list.forEach(System.out :: println); // Reference method para o metodo println
		
		
		
		}
		

}


