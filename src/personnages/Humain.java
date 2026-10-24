package personnages;

public class Humain {

	private String nom;
	private int argent;
	private String boisson;
	
	public Humain(String nom, int argent, String boisson){
		this.nom = nom;
		this.argent=argent;
		this.boisson=boisson;
	}
	
	public void parler(String texte) {
	System.out.println(nom + " : " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + this.nom + " et j’aime boire du " + this.boisson);
		};
	
	public void boire() {
		parler("Mmmm, un bon verre de " + this.boisson + " ! GLOUPS ! ");
	};
	
	public int getArgent() {
		return argent;
	};
	
	public String getBoisson() {
		return boisson;
	}
	
	public String getNom() {
		return nom;
	};
	
	public void gagnerArgent(int n) {
		this.argent += n;		
	};
	
	public void perdreArgent(int n) {
		this.argent -= n;		
	}
}
