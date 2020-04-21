package com.gerson.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.gerson.model.Productozz;


public class ProductozzDao {
	
	public List<Productozz> productoLista (){
		
		List<Productozz> listapr = new ArrayList<>();
		
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("INICIANDO-JPA-HBERNATE");
		em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			
			listapr = em.createQuery(" from Productozz").getResultList();
			em.getTransaction().commit();
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);	
		}
		
	return listapr;	
	}
	
	
	public void agregarDatos(Productozz pr) {
		
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("INICIANDO-JPA-HBERNATE");
		em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(pr);
		em.flush();
		em.getTransaction().commit();
				
	}
	
	public void actualizarDatos(Productozz pr) {
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("INICIANDO-JPA-HBERNATE");
		em = emf.createEntityManager();
		
		pr.getId();
		pr.getNombreProducto();
		pr.getPrecioProducto();
		pr.getCantidadProducto();
		pr.getTotalProducto();
		
		em.getTransaction().begin();
		em.merge(pr);
		em.flush();
		em.getTransaction().commit();
		
		
	}
	
	public void eliminarDatos(Productozz pr) {
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("INICIANDO-JPA-HBERNATE");
		em = emf.createEntityManager();

		em.getTransaction().begin();		
		pr=em.getReference(Productozz.class, pr.getId());
		em.remove(pr);
		em.flush();
		em.getTransaction().commit();
		
		
	}
	

}
