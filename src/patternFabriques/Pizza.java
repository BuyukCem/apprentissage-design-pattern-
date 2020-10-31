package patternFabriques;

import java.util.ArrayList;

public class Pizza {
	String nom;
	String pate;
	String sauce;
	ArrayList garnitures = new ArrayList ();
	
	void preparer() {
		System.out.println("Préparation de " + nom);
		System.out.println("Étalage de la pâte...");
		System.out.println("Ajout de la sauce...");
		System.out.println("Ajout des garnitures: ");
		for (int i = 0; i < garnitures.size(); i++) {
			System.out.println(" " + garnitures.get(i));
		}
	}
	
	void cuire() {
		System.out.println("Cuisson 25 minutes à 180°");
	}
	
	void couper() {
		System.out.println("Découpage en parts triangulaires");
	}
	
	void emballer() {
		System.out.println("Emballage dans une boîte offcielle");
	}
	
	public String getNom() {
		return nom;
	}
}
