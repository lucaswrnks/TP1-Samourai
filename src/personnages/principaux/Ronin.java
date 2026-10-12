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
		if (2 * honneur >= yakusa.getReputation()) {
			yakusa.perdreDuel();
			int argentGagne = yakusa.perdreDuel();
			gagnerArgent(argentGagne);
			honneur++;
		}
		else{
			yakusa.gagnerDuel();
			honneur--;			
		}
		
		
	};

};
