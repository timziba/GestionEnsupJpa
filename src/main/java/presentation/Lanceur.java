package presentation;

import java.io.Console;
import java.util.List;
import java.util.Scanner;

import domaine.Course;
import domaine.Student;
import service.StudentService;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StudentService studentService = new StudentService();
		int choix = -1;
		Scanner sc = new Scanner(System.in);
		System.out.println("***************** BIENVENUE A L'ENSITECH *******************");
		
		while (choix!=0) {
			
			
			System.out.println("Tapez 1 pour ajouter un etudiant");
			System.out.println("Tapez 2 pour lire information d'un etudiant");
			System.out.println("Tapez 3 pour modifier un etudiant");
			System.out.println("Tapez 4 pour supprimer un etudiant" );
			System.out.println("Tapez 5 pour voir la liste des étudiants" );
			System.out.println("Tapez 0 pour quitter" );
			
			
			choix = sc.nextInt();
			
			switch(choix) {
			
			case 1:
				Student student = new Student();
				sc.nextLine();
				System.out.println("Nom de l'etudiant ?");
				student.setFirstName(sc.nextLine()); 
				System.out.println("Prenom de l'etudiant ?");
				student.setLastName(sc.nextLine()); 
				System.out.println("Mail de l'etudiant ?");
				student.setMailAdresse(sc.nextLine()); 
				System.out.println("Adresse de l'etudiant ?");
				student.setAdress(sc.nextLine());
				System.out.println("Telephone de l'etudiant ?");
				student.setNumberPhone(sc.nextLine()); 
				System.out.println("Date de naissance de l'etudiant ?");
				student.setDateOfBirth(sc.nextLine()); 
				
				System.out.println("Veuiller creer un cours pour l'attribuer un l'etudiant");
				Course course = new Course();
				System.out.println("Donner le theme");
				course.setThemeCourse(sc.nextLine());
				System.out.println("Donner le nombre d'heure");
				course.setNumberHours(sc.nextInt());
				student.setCourse(course);
				
				studentService.createStudent(student);
				break;
			
			case 2:
				
				sc.nextLine();
				System.out.println("Entrer l'identifiant de l'etudiant ?");
				int id = sc.nextInt();
				Student studentFound = studentService.getStudent(id);
				System.out.println("les informations de l'etudiant numero " + id);
				System.out.println(studentFound.getFirstName() + "  " + studentFound.getLastName() + 
						"suit le cours"+ studentFound.getCourse().getThemeCourse());
				break;
				
			case 3:
				sc.nextLine();
				System.out.println("Entrer l'identifiant de l'etudiant ?");
				int idmo = sc.nextInt();
				Student studentUpdate = studentService.getStudent(idmo);
				System.out.println("Adresse de l'etudiant ?");
				studentUpdate.setAdress(sc.nextLine());
				System.out.println("Telephone de l'etudiant ?");
				studentUpdate.setNumberPhone(sc.nextLine()); 
				studentService.updateStudent(studentUpdate);
				
				break;
				
			case 4:
				sc.nextLine();
				System.out.println("Entrer l'identifiant de l'etudiant ?");
				int iddel = sc.nextInt();
				studentService.deleteStudent(iddel);
				System.out.println("Etudiant supprimer avec succes");
				
				break;
				
			case 5:
				sc.nextLine();
				System.out.println("la liste des etudiants");
				
				List<Student> listStudent = studentService.getAll();
				
				System.out.println("PRENOM" + "     "+ "NOM");
				for (Student studentList : listStudent) {
					
					System.out.println(studentList.getFirstName() + "  "+ studentList.getLastName());
				}
				break;

				default:
					System.out.println("A BIENTOT");
					
			
			}
			
		}

	}

}
