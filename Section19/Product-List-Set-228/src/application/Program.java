package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		//using HashSet mantem ordem de inserção
		//Set<String> set = new HashSet<>();
		
		//TreeSet ordena os itens
		//Set<String> set = new TreeSet<>();
		
		//LinkedHsahSet mantem ordem de inserção
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		//System.out.println(set.contains("Notebook"));
		//set.remove("Tablet");
		
		// remove itens maiores que 3 chars
		//set.removeIf(x -> x.length() >= 3);
		
		set.removeIf(x -> x.charAt(0) == 'T');
		
		for (String p : set) {
			System.out.println(p);
		}

	}

}
