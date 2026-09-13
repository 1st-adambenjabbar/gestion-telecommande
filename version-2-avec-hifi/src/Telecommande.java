/**
 * Gère une liste de lampes et permet de les contrôler.
 */
import java.util.ArrayList;
import java.util.List;

public class Telecommande {
    // Appareils contrôlés par cette télécommande, séparés dans cette version.
    private List<Lampe> lampes;
    private List<Hifi> hifis;

    /**
     * Initialise la télécommande avec une liste vide.
     */
    public Telecommande() {
        this.lampes = new ArrayList<Lampe>();
        this.hifis = new ArrayList<Hifi>();
    }

    /**
     * Ajoute une lampe à la télécommande.
     * @param lampe lampe à ajouter
     */
    public void ajouterLampe(Lampe lampe) {
        this.lampes.add(lampe);
    }

    /** Ajoute une chaîne Hi-Fi à la télécommande. */
    public void ajouterHifi(Hifi hifi) {
        this.hifis.add(hifi);
    }

    /**
     * Allume la lampe située à l'index donné.
     * @param indiceLampe position de la lampe dans la liste
     */
    public void activerLampe(int indiceLampe) {
        this.lampes.get(indiceLampe).allumer();
    }

    /**
     * Éteint la lampe située à l'index donné.
     * @param indiceLampe position de la lampe dans la liste
     */
    public void desactiverLampe(int indiceLampe) {
        this.lampes.get(indiceLampe).eteindre();
    }

    /** Augmente le son de la chaîne Hi-Fi choisie. */
    public void activerHifi(int indiceHifi) {
        this.hifis.get(indiceHifi).allumer();
    }

    /** Éteint la chaîne Hi-Fi choisie. */
    public void desactiverHifi(int indiceHifi) {
        this.hifis.get(indiceHifi).eteindre();
    }

    /**
     * Allume toutes les lampes de la télécommande.
     */
    public void activerToutes() {
        for (Lampe lampe : this.lampes) {
            lampe.allumer();
        }
        for (Hifi hifi : this.hifis) {
            hifi.allumer();
        }
    }

    /**
     * Retourne l'état de toutes les lampes de la télécommande.
     * @return chaîne contenant l'état de chaque lampe
     */
    public String toString() {
        String r = "";
        for (Lampe lampe : this.lampes) {
            r += lampe.toString() ;
        }
        for (Hifi hifi : this.hifis) {
            r += hifi.toString() + System.lineSeparator();
        }
        return r;
    }

}
