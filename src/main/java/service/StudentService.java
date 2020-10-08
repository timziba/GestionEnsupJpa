package service;

import java.util.List;

import dao.StudentDao;
import domaine.Student;

public class StudentService {
	
	
	StudentDao studentDao = new StudentDao() ;
	
	public void createStudent(Student student) {
		
		studentDao.createStudent(student);
	}
	
	public Student  getStudent(long id) {
		
		return studentDao.getStudentById(id);
	}
	
	public void updateStudent(Student student) {
		
		studentDao.updateStudent(student);
	}
	
	public void deleteStudent(long id) {
		studentDao.deleteStudent(id);
	}

	
	public List<Student> getAll(){
		
		return studentDao.getAllStudent();
	}
}
