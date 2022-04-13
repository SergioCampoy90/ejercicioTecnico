package com.ricoh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.ricoh.model.User;
import com.mysql.jdbc.Statement;
import com.ricoh.contracts.IAdd;

public class UserAddDao extends BaseDao implements IAdd<User> {
	private Connection connect;

	@Override
	public int add(User user) throws SQLException {
		
		Date date = new Date();
		java.sql.Date fechaActual = new java.sql.Date(date.getTime());
		int idUser = 0;
		PreparedStatement preparedStatement = null;
		ResultSet rskey = null;

		try {
			connect = super.getconnection();
			preparedStatement = connect.prepareStatement(
					"INSERT INTO user(name,surname,dateBirthday,email,dateRegister) VALUE (?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getSurname());
			preparedStatement.setString(3, user.getDateBirthday());
			preparedStatement.setString(4, user.getEmail());			
			preparedStatement.setDate(5, fechaActual);					
			preparedStatement.executeUpdate();

			rskey = preparedStatement.getGeneratedKeys();
			rskey.next();
			idUser = rskey.getInt(1);

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			if (preparedStatement != null)
				preparedStatement.close();
			if (connect != null)
				connect.close();
		}

		return idUser;
	}

}
