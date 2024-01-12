package com.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Demo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/callable" , "root" , "root");
		
		CallableStatement callable = connection.prepareCall("call update_procedure(800,2) ");  //storeproceser name
		
		callable.execute();
		connection.close();
		
		
		
		
	}

}




