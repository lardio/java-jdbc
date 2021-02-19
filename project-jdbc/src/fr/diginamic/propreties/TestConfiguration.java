package fr.diginamic.propreties;

import java.util.ResourceBundle;

public class TestConfiguration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle monFichierConf = ResourceBundle.getBundle("data");
		String driverName = monFichierConf.getString("nom");
		System.out.println(driverName);
	}

}
