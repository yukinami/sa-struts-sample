package org.seasar.sastruts.sample.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.seasar.sastruts.sample.entity.Post;

public class PostsRepository implements CrudRepositoryBase<Post, Long> {

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public Post save(Post entity) {
		Post post = entityManager.find(Post.class, entity.id);
		if (post == null) {
			entityManager.persist(entity);
			entityManager.flush();
		} else {
			entityManager.merge(entity);
		}
		
		return entity;
	}

	public Post findOne(Long id) {
		return entityManager.find(Post.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Post> findAll(){
		return entityManager.createQuery("SELECT p FROM Post p ").getResultList();
	}

	public void delete(Long id) {
		Post entity = entityManager.find(Post.class, id);
		entityManager.remove(entity);
	}

	public void delete(Post entity) {
		entityManager.remove(entity);
	}

}
