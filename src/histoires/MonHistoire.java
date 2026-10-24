/*
@startuml
skinparam classAttributeIconSize 0

package "personnages" {
    class Humain {
        - nom : String
        - argent : int
        - boisson : String
        + Humain(nom : String, argent : int, boisson : String)
        + parler(texte : String) : void
        + direBonjour() : void
        + boire() : void
        + getNom() : String
        + getArgent() : int
        + getBoisson() : String
        + gagnerArgent(n : int) : void
        + perdreArgent(n : int) : void
    }
}

package "personnages.principaux" {
    class Commercant {
        + Commercant(nom : String, argent : int)
        + seFaireExtorquer() : int
        + recevoir(argent : int) : void
    }

    class Yakusa {
        - clan : String
        - reputation : int
        + Yakusa(nom : String, argent : int, boisson : String, clan : String)
        + getClan() : String
        + getReputation() : int
        + direBonjour() : void
        + extorquer(commercant : Commercant) : void
        + gagnerDuel() : void
        + perdreDuel() : int
    }

    class Ronin {
        - honneur : int
        + Ronin(nom : String, argent : int, boisson : String)
        + donner(n : int, commercant : Commercant) : void
        + provoquer(yakusa : Yakusa) : void
    }
}

Humain <|-- Commercant
Humain <|-- Yakusa
Humain <|-- Ronin

@enduml
*/
package histoires;
import personnages.principaux.Commercant;
import personnages.principaux.Ronin;
import personnages.principaux.Samourai;
import personnages.principaux.Yakusa;

public class MonHistoire {

	public static void main(String[]args) {
		Commercant marco = new Commercant("Marco", 20);
        Yakusa yaku = new Yakusa("Warsong", 30, "Yaku le Noir", 10, "whisky");
        Ronin roro = new Ronin("Roro", 60, "sake");
        Samourai akira = new Samourai("Akira", 100, "thé", "Miyamoto");

        System.out.println("\n PRÉSENTATIONS :");
        marco.direBonjour();
        yaku.direBonjour(); 
        roro.direBonjour();
        akira.direBonjour();

        System.out.println("\n ACTIONS SAMOURAÏ :");
        akira.boire("sake"); 

        System.out.println("\n DUEL ET INTERACTION ---");
        yaku.extorquer(marco);
        roro.provoquer(yaku);
	}
}
