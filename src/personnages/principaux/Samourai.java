package personnages.principaux;
import personnages.Humain;


public class Samourai extends Ronin {
	private String seigneur;

	public Samourai(String nom, int argent, String boisson, String seigneur){
		super(nom, argent, boisson);
		this.seigneur = seigneur;
	}
	
	public String getSeigneur() {
		return seigneur;
	}
	@Override
	public void direBonjour() {
        super.direBonjour();
        parler(" J'ai pour seigneur le grand " + seigneur + ".");
    }
	
	public void boire(String boisson) {
        parler(" Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
    }
	
	
	
}
