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
	
	
	
	public void createStudent(Student student) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		entityManager.persist(student);
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
		
	}
	
	public Student getStudentById(long id) {

		Student student = entityManager.find(Student.class, id);

		return student;
	}
	
	
	
	public void updateStudent(Student student) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	
	public void deleteStudent(long id) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Student student = getStudentById(id);
		entityManager.remove(student);
		entityTransaction.commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}
	

	

}
