package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domaine.User;

public class UserDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gestionensupjpa");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	


}
