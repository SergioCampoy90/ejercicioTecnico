package com.ricoh.contracts;

import java.sql.SQLException;


public interface IAdd<T> {

	public int add(T modelo) throws SQLException; 
			
}
