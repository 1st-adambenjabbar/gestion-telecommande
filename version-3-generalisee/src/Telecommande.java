import java.util.ArrayList;
import java.util.List;

/** Télécommande indépendante des types concrets d’appareils. */
public class Telecommande {
    private final List<Appareil> appareils = new ArrayList<Appareil>();

    public void ajouterAppareil(Appareil appareil) {
        appareils.add(appareil);
    }

    public void activer(int indice) {
        appareils.get(indice).allumer();
    }

    public void desactiver(int indice) {
        appareils.get(indice).eteindre();
    }

    public void activerTous() {
        for (Appareil appareil : appareils) {
            appareil.allumer();
        }
    }

    @Override
    public String toString() {
        StringBuilder resultat = new StringBuilder();
        for (Appareil appareil : appareils) {
            resultat.append(appareil).append(System.lineSeparator());
        }
        return resultat.toString();
    }
}
