package pe.com.core.entity;

import java.io.Serializable;

public class User implements Serializable{
	private Integer idUser;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	
	public User() {
		super();
	}
	
	public User(Integer idUser) {
		super();
		this.idUser = idUser;
	}
	
	public User(Integer idUser, String firstname, String lastname, 
			String email, String password) {
		super();
		this.idUser=idUser;
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
		this.password=password;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
