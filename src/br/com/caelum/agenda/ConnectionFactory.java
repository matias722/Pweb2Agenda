package br.com.caelum.agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/agenda", "jose", "admin");
		} catch (SQLException e) {
			System.out.println("Erro ao conectar..");
			throw new RuntimeException(e);
		}
		catch(ClassNotFoundException e){
			System.out.println("Erro ao conectar..");
			throw new RuntimeException(e);
		}
	}

}
