package model;

import java.sql.Date;

public class PRODUIT {
	private int id;
	private String nom;
	private float prix;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public PRODUIT(int id, String nom, float prix) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
	}
	public PRODUIT(String nom, float prix) {
		super();
		this.nom = nom;
		this.prix = prix;
	}
}
