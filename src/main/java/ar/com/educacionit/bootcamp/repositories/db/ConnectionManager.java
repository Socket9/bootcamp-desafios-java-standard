package ar.com.educacionit.bootcamp.repositories.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
	
	public static Connection getConnection() {
		String usernameDb = "root";
		String passwordDb = "root";
		String url = "jdbc:mysql://127.0.0.1:3307/desafio5?serverTimeZone=UTC&useSSL=false";
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driverClassName);
			
			
			return DriverManager.getConnection(url,usernameDb,passwordDb);
		}catch (Exception e) {
			throw new IllegalArgumentException("No se pudo obtener conexion para:" + url + " - " + driverClassName,e);
		}
	}
}
