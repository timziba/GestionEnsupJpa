package dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import domaine.Student;

public class StudentDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gestionensupjpa");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void createStudent(Student student) {
		entityTransaction.begin();
		
		entityManager.persist(student);
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
		
	}
	
	public Student getStudentById(long id) {
		
		entityTransaction.begin();
		Student student = entityManager.find(Student.class, id);
		
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
		return student;
	}
	
	
	public void updateStudent(Student student) {
		
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	
	public void deleteStudent(long id) {
		entityTransaction.begin();
		Student student = getStudentById(id);
		entityManager.remove(student);
	}
	
	

}
