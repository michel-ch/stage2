package model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.mysql.jdbc.PreparedStatement;

import controller.main;
import view.accueil;

import java.sql.Connection;

public class model {
	
	private Connection con;
	private ArrayList<PRODUIT> ListProduits;
	private ArrayList<CA> ListCA;
	private ArrayList<TRANSACTION> ListTransaction;
	private ArrayList<PRODUIT> Ticket;
	private ArrayList<TAXE> ListTVA;
	
	public model() {
		
		String BDD = "caisse";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection conn;
			conn = DriverManager.getConnection(url, user, passwd);
			this.con = conn;
			System.out.println("Connection OK");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<PRODUIT> getListProduits() {
		return ListProduits;
	}
	public ArrayList<CA> getListCA() {
		return ListCA;
	}
	public ArrayList<TRANSACTION> getListTransaction() {
		return ListTransaction;
	}
	public ArrayList<PRODUIT> getTicket() {
		return Ticket;
	}
	public ArrayList<TAXE> getTVA(){
		return ListTVA;
	}
	
	public void getAll() throws SQLException {
		//ListProduits.clear();
		//ListCA.clear();
		//ListTransaction.clear();
		ListProduits=new ArrayList<PRODUIT> ();
		ListCA=new ArrayList<CA> ();
		ListTransaction=new ArrayList<TRANSACTION>();
		Ticket = new ArrayList<PRODUIT>();
		ListTVA = new ArrayList<TAXE>();
		
		ResultSet resultats;
		String requete;
		
		//*************************************
		// CREATION LISTE PRODUITS
		//*************************************
		requete = "SELECT * FROM produits";

		Statement stmt = con.createStatement();
		resultats = stmt.executeQuery(requete);

		while (resultats.next()) {
			PRODUIT produit = new PRODUIT(resultats.getInt(1), resultats.getString(2), resultats.getFloat(3));
			ListProduits.add(produit);
		}

		//*************************************
		// CREATION LISTE CA
		//*************************************
		requete = "SELECT * FROM ca";

		stmt = con.createStatement();
		resultats = stmt.executeQuery(requete);
		while (resultats.next()) {
			CA ca = new CA(resultats.getInt(1), resultats.getFloat(2),resultats.getString(3));
			ListCA.add(ca);
		}
		
		//*************************************
		// EXTRACTION TVA
		//*************************************
		requete = "SELECT * FROM loi";

		stmt = con.createStatement();
		resultats = stmt.executeQuery(requete);
		while(resultats.next()) {
			TAXE loi = new TAXE(resultats.getInt(1), resultats.getFloat(2));
			ListTVA.add(loi);
		}
		
		
		//*************************************
		System.out.println("nb produits :"+ListProduits.size());
		System.out.println("nb ca :"+ListCA.size());
		System.out.println("nb transactions :"+ListTransaction.size());
		
		System.out.println("chargement BDD OK");
		
	}
	
	public PRODUIT findproduits(int id)
	{
		for(int i=0;i<ListProduits.size();i++)
		{
			if(ListProduits.get(i).getId()==id)
			{
				return ListProduits.get(i);
			}
		}
		return null;
	}
	
	// FINDPRODUIT POUR SUPPRESSION PRODUIT
	
	public PRODUIT findproduits(String nom)
	{
		for(int i=0;i<ListProduits.size();i++)
		{
			if(ListProduits.get(i).getNom().equals(nom))
			{
				return ListProduits.get(i);
			}
		}
		return null;
	}
	
	public CA findca(int id)
	{
		for(int i=0;i<ListCA.size();i++)
		{
			if(ListCA.get(i).getId()==id)
			{
				return ListCA.get(i);
			}
		}
		return null;
	}
	public TRANSACTION findtransaction(int id)
	{
		for(int i=0;i<ListTransaction.size();i++)
		{
			if(ListTransaction.get(i).getId()==id)
			{
				return ListTransaction.get(i);
			}
		}
		return null;
	}
	
	public TAXE findTVA(int id)
	{
		for(int i=0;i<ListTVA.size();i++)
		{
			if(ListTVA.get(i).getId()==id)
			{
				return ListTVA.get(i);
			}
		}
		return null;
	}
	
	//***************************************************
	// AJOUT DE PRODUIT LISTE
	//***************************************************
	
	public void creationProduit(String nom, float prix) throws SQLException {
		ResultSet resultats;
		String requete;
		Statement command = con.createStatement();
		
		//System.out.println("INSERT INTO `produits` (`id`, `nom`, `prix`) VALUES (NULL, '"+nom+"', '"+prix+"');");
		//System.out.println("SELECT * from produits WHERE produits.nom = "+nom+";");
		
		
		try{
			requete = "SELECT * from produits WHERE produits.nom = "+nom+";";
			Statement stmt = con.createStatement();
			resultats = stmt.executeQuery(requete);
		}catch (Exception e) {
			command.execute("INSERT INTO `produits` (`id`, `nom`, `prix`) VALUES (NULL, '"+nom+"', '"+prix+"');");
			requete = "SELECT * from produits WHERE produits.nom = '"+nom+"';";
			Statement stmt = con.createStatement();
			resultats = stmt.executeQuery(requete);
			while (resultats.next()) {
				PRODUIT produit = new PRODUIT(resultats.getInt(1), resultats.getString(2), resultats.getFloat(3));
				ListProduits.add(produit);
			}
		}

		
	}
	
	//***************************************************
	// SUPPRESSION DE PRODUIT LISTE
	//***************************************************
	
	public void suppressionProduit(String nom) throws SQLException {
		Statement command = con.createStatement();
		command.execute("DELETE FROM produits WHERE produits.nom = '"+nom+"';");
		PRODUIT p = main.getM().findproduits(nom);
		main.getM().ListProduits.remove(p);
	}
	
	//***************************************************
	// MODIF DE PRODUIT LISTE
	//***************************************************
	
	public void modifProduit(String origine,String nom,float prix) throws SQLException {
		//System.out.println(main.getM().findproduits(nom).getNom());
		//System.out.println(main.getM().findproduits(nom).getPrix());
		Statement command = con.createStatement();
		int origineid = main.getM().findproduits(origine).getId();
		command.execute("UPDATE `produits` SET `nom` = '"+nom+"' , prix = "+prix+" WHERE `produits`.`id` = '"+origineid+"';");
		//System.out.println("UPDATE `produits` SET `nom` = '"+nom+"' , prix = "+prix+" WHERE `produits`.`id` = '"+origineid+"';");
		
		// CHANGEMENT DES NOM PRIX DANS LA LISTE
		PRODUIT p = main.getM().findproduits(origine);
		p.setNom(nom);
		p.setPrix(prix);
	}
	
	//***************************************************
	// MODIF TVA
	//***************************************************
	
	public void modifTVA(float tva) throws SQLException {
		Statement command = con.createStatement();
		command.execute("UPDATE `loi` SET `tva` = '"+tva+"' WHERE `loi`.`id` = 1;");
		TAXE a = main.getM().findTVA(1);
		a.setTva(tva);
	}
	
	
	//***************************************************
	// AJOUT DE PRODUIT TICKET 
	//***************************************************
	
	public void ajoutticket(String nom,int quantite ,float prix) throws SQLException {
		PRODUIT produit = new PRODUIT(nom,quantite,prix);
		main.getM().Ticket.add(produit);
		//System.out.println(main.getM().getTicket().size());
	}
	
	//***************************************************
	// CONSULTER TRANSACTION AVEC CA
	//***************************************************
	
	public void consulterCAJOUR(String date) throws SQLException {
		
		ResultSet resultats;
		String requete;
		System.out.println("SELECT * FROM `transactions` where DATE(date) = '"+date+"'");
		requete = "SELECT * FROM `transactions` where DATE(date) = '"+date+"'";
		Statement stmt = con.createStatement();
		resultats = stmt.executeQuery(requete);
		while (resultats.next()) {
			//System.out.println(" "+resultats.getInt(1)+" "+resultats.getString(2)+" "+resultats.getFloat(3)+" "+resultats.getString(4));
			TRANSACTION transaction = new TRANSACTION(resultats.getInt(1), resultats.getString(2), resultats.getFloat(3), resultats.getString(4));
			ListTransaction.add(transaction);
		}
		//System.out.println("size : "+ListTransaction.size());
		
	}
	
	
	//***************************************************
	//***************************************************
	//***************************************************
	
	
}
