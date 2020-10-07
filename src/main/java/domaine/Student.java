package domaine;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Class Student
 * 
 * @author Student
 *
 */

@Entity
@DiscriminatorValue("student")
public class Student extends Person {

	private String dateOfBirth;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Course course;

	public Student(String firstName, String lastName, String mailAdresse, String adress, String numberPhone,
			String dateOfBirth , Course course) {
		super(firstName, lastName, mailAdresse, adress, numberPhone);
		this.dateOfBirth = dateOfBirth;
		this.course = course;
	}

	
	
	public Student() {
		super();
	}



	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	

	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	@Override
	public String toString() {
		return "Student [dateOfBirth=" + dateOfBirth + ", getId()=" + getId() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getMailAdresse()=" + getMailAdresse() + ", getAdress()="
				+ getAdress() + ", getNumberPhone()=" + getNumberPhone() + "]";
	}

}
