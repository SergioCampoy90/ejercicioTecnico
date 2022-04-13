package com.ricoh.model;

public class User {
	
	private int idUser;
	private String name;
	private String surname;
	private String dateBirthday;
	private String email;

	public User(int idUser, String name, String surname, String dateBirthday, String email) {
		this.idUser = idUser;
		this.name = name;
		this.surname = surname;
		this.dateBirthday = dateBirthday;
		this.email = email;
	}
	
	public User() {

	}
		
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDateBirthday() {
		return dateBirthday;
	}
	public void setDateBirthday(String dateBirthday) {
		this.dateBirthday = dateBirthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
