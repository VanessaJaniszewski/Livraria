

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Connect {
	
	
	
	public void findLivro(Integer id) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Oracle");;
	EntityManager em = emf.createEntityManager();
		try {
			Livro l1 = em.find(Livro.class, id);
			em.getTransaction().begin();
			em.find(Livro.class,l1);
			em.getTransaction().commit();
		}catch (Exception e) {
		System.err.println(e);
		}finally {
		em.close();
	}}
	
	public void addLivro(Livro livro) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Oracle");;
	EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(livro);
			em.getTransaction().commit();
		}catch (Exception e) {
		System.err.println(e);
		}finally {
		em.close();
	}}
	
	public void removeLivro(Livro livro) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Oracle");;
	EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.remove(livro);
			em.getTransaction().commit();
		}catch (Exception e) {
		System.err.println(e);
		}finally {
		em.close();
	}}
	
	public void findAutor(Integer id) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Oracle");;
	EntityManager em = emf.createEntityManager();
		try {
			Livro l1 = em.find(Livro.class, id);
			em.getTransaction().begin();
			em.find(Autor.class,l1);
			em.getTransaction().commit();
		}catch (Exception e) {
		System.err.println(e);
		}finally {
		em.close();
	}}
	
		public void addAutor(Autor autor) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Oracle");;
	EntityManager em = emf.createEntityManager();
			try {
				em.getTransaction().begin();
				em.persist(autor);
				em.getTransaction().commit();
			}catch (Exception e) {
			System.err.println(e);
			}finally {
			em.close();
		}
	}
		
		public void removeAutor(Autor autor) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Oracle");;
	EntityManager em = emf.createEntityManager();
			try {
				em.getTransaction().begin();
				em.remove(autor);
				em.getTransaction().commit();
			}catch (Exception e) {
			System.err.println(e);
			}finally {
			em.close();
		}
	}
		@SuppressWarnings("unchecked")
		public String query(String table) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Oracle");;
	EntityManager em = emf.createEntityManager();
			String queryCalled = "From "+table;
			Query query = em.createQuery(queryCalled);
			em.getTransaction().begin();
			List<String> results = new ArrayList<String>();
			results = query.getResultList();
			em.getTransaction().commit();
			StringBuilder results2 = new StringBuilder();
			for (String s : results) {
				results2.append(s);
			}
			return results2.toString();
		}
}
