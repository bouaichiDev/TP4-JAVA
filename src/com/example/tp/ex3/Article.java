package com.example.tp.ex3;

public class Article {
	private static int compteur = 0;
	private final int id;
	private String code;
	private String libelle;
	private Categorie categorie;
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getId() {
		return id;
	}
	public Article( String code, String libelle, Categorie categorie) {
		super();
		this.id = ++compteur;
		this.code = code;
		this.libelle = libelle;
		this.categorie = categorie;
	}
	
	@Override
	public String toString() {
		return "Article [id=" + id + ", code=" + code + ", libelle=" + libelle + ", categorie=" + categorie + "]";
	}
 
	
}
