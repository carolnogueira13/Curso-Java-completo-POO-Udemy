package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		int sum = list.stream().reduce(0, (x,y) -> x + y); // esse método reduce criou uma operação que fez o somstório da lista
		System.out.println("SUM = " + sum);

		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0) // filtra o strem apenas os números pares
				.map(x -> x * 10) // multiplica todos os elementos do stream por 10 
				.collect(Collectors.toList()); // transforma o stream em lista novamente
		
		System.out.println(Arrays.toString(newList.toArray()));
	}

}
