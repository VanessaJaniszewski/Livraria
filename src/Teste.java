import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Oracle");
		EntityManager em = emf.createEntityManager();
		Livro l1 = new Livro("Flowers for Algernon", "Daniel Keyes", null);
		
		try {
			em.getTransaction().begin();
			em.persist(l1);
			em.getTransaction().commit();
		}catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		
		
	}

}
