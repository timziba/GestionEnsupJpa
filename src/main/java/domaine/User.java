package domaine;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("user")
public class User extends Person{

	
	private String login;
	private String password;
	private String profil;
	
	
	public User(String firstName, String lastName, String mailAdresse, String adress, String numberPhone, String login,
			String password, String profil) {
		super(firstName, lastName, mailAdresse, adress, numberPhone);
		this.login = login;
		this.password = password;
		this.profil = profil;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfil() {
		return profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}
	
	
}
