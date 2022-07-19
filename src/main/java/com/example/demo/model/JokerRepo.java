package com.example.demo.model;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class JokerRepo {
	@PersistenceContext
	private EntityManager em;
	
	public List<Joker> findAll(){
		Query q = em.createQuery("from Joker");
		return q.getResultList();
	}
	
}
