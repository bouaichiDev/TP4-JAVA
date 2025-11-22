package com.example.tp.ex3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Categorie[] ca = new Categorie[2];
		ca[0] = new Categorie("O PR", "Ordinateur Portable");
		ca[1] = new Categorie("O PP", "Ordinateur Poste");
		Article[] art = new Article[4];
		art[0] = new Article("14", "DELL", ca[0]);
		art[1] = new Article("14", "HP", ca[0]);
		art[2] = new Article("14", "ASUS", ca[1]);
		art[3] = new Article("14", "LENOVO", ca[1]);

		for (int i = 0; i < ca.length; i++) {
			Categorie cat = ca[i];
			System.out.println("Categorie :" + cat.getLibelle());
			for (int j = 0; j < art.length; j++) {
				if (art[j].getCategorie().getId() == cat.getId())
					System.out.println(art[j].toString());
			}

		}
	}

}
