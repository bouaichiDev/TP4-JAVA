package com.example.tp.ex1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Création de deux étudiants
		Etudiant e1 = new Etudiant("Dupont", "Alice");
		Etudiant e2 = new Etudiant("Martin", "Bob");

		// Ajout de notes
		e1.ajouterNote(14.5);
		e1.ajouterNote(12.0);
		e1.ajouterNote(16.0);
		e2.ajouterNote(10.0);
		e2.ajouterNote(13.5);

		// Affichage des notes et moyennes
		e1.afficherNotes();
		System.out.println(e1);

		e2.afficherNotes();
		e2.SupprimerDernierNote();
		System.out.println(e2);
	}

}
