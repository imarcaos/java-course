package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		/* example 1
		 
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
		
		// remove chars que contenham a letra T
		set.removeIf(x -> x.charAt(0) == 'T');
		
		for (String p : set) {
			System.out.println(p);
		}
		
		 */
		
		/* example 2 */
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		//intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		//difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);

	}

}
