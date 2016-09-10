package br.com.material.bd.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAConnection {

	private static EntityManagerFactory conection;
	private EntityManager em;
	
	private EntityManagerFactory connect(){
		
		try{
			if(conection != null && conection.isOpen()){
				return conection;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		conection = Persistence.createEntityManagerFactory("MATERIAL");
		
		return conection;
	}
	
	protected EntityManager getEntityManager(){
		if(em == null || !em.isOpen()){
			em = connect().createEntityManager();
		}
		return em;
	}
	
	protected void closeConection(){
		
		if(em != null && em.isOpen()){
			this.em.close();
		}
	}
}
