package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, argent, "thé");
	};
	
	public int seFaireExtorquer() {
		int somme = getArgent();
		perdreArgent(somme);
		parler("J'ai tout perdu! le monde est vraiment trop injuste!");
		return somme;
		
	};
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler("Je te remercie généreux donateur !");
		
	};
};
