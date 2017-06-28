package net.ssjp.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import net.ssjp.usermanagement.User;

public class UserController {
	private EntityManager em;
	
	public List<User> findAll(){
		TypedQuery<User> query = em.createQuery("SELECT * FROM User ORDER BY id ASC", User.class);
		return query.getResultList();
	}
	
	public void save(User user){
		em.persist(user);
	}
	
	public void update(User user){
		em.merge(user);
	}
	
	public void remove(String id){
		User user = find(id);
		if(user != null)
			em.remove(user);
	}

	public User find(String id) {
		return em.find(User.class, id);
	}
	
	public void detach(User user){
		em.detach(user);
	}
}
