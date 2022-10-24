package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		// ex294 leveling JPA/Hibernate part3
		
		/* ex1 - Objects already inserted in our DB
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		/* ex1 - Objects already inserted in our DB
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		*/
		
		/* ex2 - find object
		Pessoa p = em.find(Pessoa.class, 2);		
		System.out.println(p);
		*/
		
		// ex3 - remove object
		//Pessoa p = new Pessoa(2, null, null); // this way don't work
		// para o código funcionar sempre precisamos inserir um objeto(1º) ou recuperar do DB e incluir uma transação(2º)
		// 2º método abaixo
		em.getTransaction().begin();
		Pessoa p = em.find(Pessoa.class, 2);
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
		
	}

}
