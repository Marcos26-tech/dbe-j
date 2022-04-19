package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.fiap.model.User;

public class UserDao {
	
	EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("progamer-persistence-unit");
	EntityManager manager = 
			factory.createEntityManager();

	public void create(User user) {
		
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
		
		manager.clear();
	}
	
	public List<User> listAll() {
		
		TypedQuery<User> query = 
				manager.createQuery("SELECT u FROM User u", User.class);
		
		return query.getResultList();
		
	}

}
