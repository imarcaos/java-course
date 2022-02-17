package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		list.add(2, "Marco");
		
		System.out.println(list.size());		
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------------------");

		// list.remove("Anna"); // remove comparando
		// list.remove(1); // remove dado na posição 1 da lista
		list.removeIf(x -> x.charAt(0) == 'M'); // pega um item da lista x e retorna se o valor na posição 0 de cada item é igual a 'M'.

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------------------");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // quando não encontra o elemento, retorna -1
		System.out.println("------------------------------------");
		
		// Impressão com os nomes da lista iniciados com "A"
		// função abaixo, primeiro converto a lista para stream (Java +8, aceita operações lambda),
		// faz uma operação lambda (argumento filter) e no collect volta ele para o formato list
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("------------------------------------");
		
		// filtra o primeiro nome da lista começado com a letra A, caso não encontre retorna null
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
