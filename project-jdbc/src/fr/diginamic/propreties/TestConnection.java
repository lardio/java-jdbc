package fr.diginamic.propreties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import org.mariadb.jdbc.Driver;

public class TestConnection {

	public static void main(String[] args) {
		
		
		ResourceBundle fichierConf = ResourceBundle.getBundle("data");
		String driverClass = fichierConf.getString("database.driver");
		String url = fichierConf.getString("database.url");
		String user = fichierConf.getString("database.user");
		String password = fichierConf.getString("database.password");
		
		try {
			Class.forName(driverClass); // charger driver fournit par librairie maria DB	
		} catch (ClassNotFoundException e) {
			System.out.println("kO");
		}
		
		try {
			Connection connection = DriverManager.getConnection(url, user, password); //demande au drivermanager de fournir une connexion type mariadb
			System.out.println(connection.isClosed()); // si false OK
			
		} catch (SQLException e) {
			System.out.println("error");
		}
	}

}
