import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Teste {
	public static void main(String[] args) throws InterruptedException {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Oracle");
		EntityManager em = emf.createEntityManager();
		
		Livro l1 = new Livro("Flowers for Algernon",null);
		Autor a1 = new Autor("Daniel Keyes", null);
		
		l1.setAutor_id(a1);
		
		
		em.getTransaction().begin();
		em.persist(a1);
		em.getTransaction().commit();
	
	
		em.getTransaction().begin();
		em.persist(l1);
		em.getTransaction().commit();
		
	

				em.getTransaction().begin();
				Query query = em.createQuery("From livro");
				em.getTransaction().commit();
				System.out.println(query.getResultList().toString());
				
				
				
		

		
//		System.out.println("RESULTRADO DA QUERY: "+c.query("Livro"));
//		
	}

}
