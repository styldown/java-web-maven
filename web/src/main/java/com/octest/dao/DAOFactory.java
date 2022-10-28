package com.octest.dao;

import java.sql.Connection;



import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DAOFactory {

	private static String url = "jdbc:mysql://54.159.209.82:3306/simplon";
	    /**
	     * Nom du userery'(y-
	     */
	private static String user = "root";
	    /**
	     * Mot de passe du user
	     */
	private static String passwd = "my-secret-pw";
	    /**
	     * Objet Connexion
	     */
	private static Connection connect;
	    
	    /**
	     * Méthode qui va nous retourner notre instance
	     * et la créer si elle n'existe pas...
	     * @return
	     */
	public static Connection getInstance(){
		try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        	System.out.println("erreu1");

        }

		try {
			connect= DriverManager.getConnection(url, user, passwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        	System.out.println("erreur2");

		}
        return connect;
    }    
	       
		
	
		

}
