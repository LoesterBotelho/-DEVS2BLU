package devs2blu.loester.exer01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio01 {

	public static void main(String[] args) {

		
		List<String> listaDaFeira = Arrays.asList("Abobrinha", "Berinjela", "Cenoura", "Ervilha");
		listaDaFeira.forEach(legumes -> System.out.println(legumes));

		
		Map<String, Integer> mapa = new HashMap<>();		
		mapa.put("Vítor", 1);
		mapa.put("Rosana", 2);
		mapa.put("Suellen", 3);		
		mapa.forEach((chave, valor) -> System.out.println(chave + " : " + valor));
		
		
		
		
		List<String> animaisVet = new ArrayList<>(Arrays.asList("gatinhos", "gato", "peixinhos", "peixe"));
		animaisVet.removeIf(animal -> animal.length() > 6);
		animaisVet.forEach(System.out::println);
		
		
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numeros.stream()
		       .filter(numero -> numero % 2 == 0) 
		       .forEach(numero -> System.out.println(numero));
		
		
	}
}
