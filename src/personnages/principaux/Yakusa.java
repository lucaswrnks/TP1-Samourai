package personnages.principaux;

import personnages.Humain;

public class Yakusa extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakusa (String clan, int reputation, String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		this.clan = clan;
	};
	
	public String getClan() {
		return clan;
	};
	
	public int getReputation() {
		return reputation;
	};

	public void extorquer(Commercant commercant) {
		int somme = commercant.seFaireExtorquer();
		gagnerArgent(somme);
		reputation++;

	};
	
	public void gagnerDuel() {
		reputation++;
		parler("Je suis le vainqueur !");
	};
	
	public int perdreDuel() {
		int somme = getArgent();
		perdreArgent(somme);
		reputation--;
		parler("J'ai perdu!");
		
		return somme;
		
	};
	
	public void direBonjour() {
		parler("Bonjour!");
	};
	
};
