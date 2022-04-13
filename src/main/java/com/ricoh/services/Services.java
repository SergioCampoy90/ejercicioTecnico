package com.ricoh.services;

import java.sql.SQLException;

import com.ricoh.dao.UserAddDao;
import com.ricoh.model.User;

public class Services {

	UserAddDao userdao;

	public Services() {

		userdao = new UserAddDao();
	}

	public int redirigirAccion(String action, String name, String surname, String date, String email) throws SQLException {
		int retorno = 0;
		if (action.equals("insert")) {
			retorno = addUser(name, surname, date, email);
		} 
		return retorno; 
	}

	public int addUser(String name, String surname, String date, String email) throws SQLException {
		String name1 = String.valueOf(name);
		String surname1 = String.valueOf(surname);
		String date1 = String.valueOf(date);
		String email1 = String.valueOf(email);		
		User aux = new User();
		aux.setName(name1);
		aux.setSurname(surname1);
		aux.setDateBirthday(date1);
		aux.setEmail(email1);	
	
		int userañadido = userdao.add(aux);
		
		
		return userañadido;
	}
	
}
