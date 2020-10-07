
package domaine;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String themeCourse;
	private int numberHours;
	
	@OneToMany(mappedBy = "course" , fetch = FetchType.LAZY)
	private Collection<Student> students;
	
	public Course(String themeCourse, int numberHours) {
		super();
		this.themeCourse = themeCourse;
		this.numberHours = numberHours;
	}

	
	
	public Course() {
		super();
	}



	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}



	public String getThemeCourse() {
		return themeCourse;
	}

	public void setThemeCourse(String themeCourse) {
		this.themeCourse = themeCourse;
	}

	public int getNumberHours() {
		return numberHours;
	}

	public void setNumberHours(int numberHours) {
		this.numberHours = numberHours;
	}
	
	

	public Collection<Student> getStudents() {
		return students;
	}


	public void setStudents(Collection<Student> students) {
		this.students = students;
	}


	@Override
	public String toString() {
		return "Course [themeCourse=" + themeCourse + ", numberHours=" + numberHours + "]";
	}
	
}
