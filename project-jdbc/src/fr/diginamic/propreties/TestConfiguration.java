package fr.diginamic.propreties;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class TestConfiguration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle monFichierConf = ResourceBundle.getBundle("data");
		String driverName = monFichierConf.getString("nom");
		System.out.println(driverName);
		
		Enumeration<String> keys = monFichierConf.getKeys();
		
		while( keys.hasMoreElements() ) {
			String key = keys.nextElement();
			System.out.println(monFichierConf.getString(key));
		}
		
	}

}
