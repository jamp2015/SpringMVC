package com.sip.dao;

import javax.persistence.EntityManager;

import com.sip.model.User;

public class UserDaoImpl implements UserDao {
	
	private EntityManager entitymanager;
	
	public UserDaoImpl(EntityManager entitymanager) {
		this.entitymanager = entitymanager;
	}

	public void create(User user) {
		entitymanager.getTransaction().begin();
		entitymanager.persist(user);
		entitymanager.getTransaction().commit();
	}

	public User find(int userId) {
		entitymanager.getTransaction().begin();
		User user = entitymanager.find(User.class, userId);
		entitymanager.getTransaction().commit();
		return user;
	}

	public void delete(int userId) {
		entitymanager.getTransaction().begin();
		User user = entitymanager.find(User.class, userId);
		entitymanager.remove(user);
		entitymanager.getTransaction().commit();
	}

	public void update(User newUser) {
		entitymanager.getTransaction().begin();
		User user = entitymanager.find(User.class, newUser.getUserId());
		user = newUser;
		entitymanager.getTransaction().commit();
	}
}
