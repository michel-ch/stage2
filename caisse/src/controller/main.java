package controller;
import java.sql.SQLException;

import model.model;
import view.accueil;


public class main {

	private static model m;
	
	public static model getM() {
		return m;
	}
	
	public static void main(String[] args) throws SQLException{
		System.out.println("main");
		
		m = new model();
		m.getAll();
		
		//AUTEUR a = m.findlAuteur(3);
		//System.out.println(a.getDescription());
		accueil window = new accueil();
		
		//mainMVC.getM().getAll();
	}

}