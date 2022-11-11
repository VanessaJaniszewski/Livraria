//
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//public class Connect {
//	
//	
//	public void find(Integer id) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Oracle");;
//		EntityManager em = emf.createEntityManager();
//		try {
//			
//			Livro l1 = em.find(Livro.class, id);
//			em.getTransaction().begin();
//			em.merge(l1);
//			em.getTransaction().commit();
//			
//		}catch (Exception e) {
//		System.err.println(e);
//		}finally {
//		em.close();
//	}}
//	
//	public void add(Livro livro) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Oracle");;
//		EntityManager em = emf.createEntityManager();
//		try {
//			em.getTransaction().begin();
//			em.persist(livro);
//			em.getTransaction().commit();
//			
//		}catch (Exception e) {
//		System.err.println(e);
//		}finally {
//		em.close();
//	}}
//
//}
