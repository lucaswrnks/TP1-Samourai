package personnages.principaux;
import personnages.Humain;

public class Ronin extends Humain {
	int honneur = 1;
	
	public Ronin (String nom, int argent, String boisson) {
		super(nom, argent, boisson);	
		
	};
	
	public void donner(int n, Commercant commercant) {
		
		perdreArgent(n);
		
		commercant.recevoir(n);
	};
	
	public void provoquer(Yakusa yakusa) {
		if (2 * this.honneur >= yakusa.getReputation()) {
			parler("Je t'ai eu petit yakusa " + yakusa.getNom() + " !");
			int argentGagne = yakusa.perdreDuel();
			gagnerArgent(argentGagne);
			honneur++;
		}
		else{
			parler("J'ai perdu contre le yakusa " + yakusa.getNom() + ", snif...");
			yakusa.gagnerDuel();
			honneur--;			
		}
		
		
	};

};
