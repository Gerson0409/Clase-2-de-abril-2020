package com.gerson.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.gerson.model.Usuario;

public class UsuarioDao {
	
	public List<Usuario> ingresoUsuario(Usuario usu){
		
	List<Usuario> listaU = new ArrayList<>();
		
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("Login");
		em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			
			listaU = em.createQuery(" from Usuario as u where  u.usuario = '"+usu.getUsuario()+"' and u.contrasenia= '"+usu.getContrasenia()+"'").getResultList();
			em.getTransaction().commit();
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e+"Error");
		}
		
	return listaU;	
	}

	

	
}
