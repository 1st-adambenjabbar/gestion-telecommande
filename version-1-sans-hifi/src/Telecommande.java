/**
 * Gère une liste de lampes et permet de les contrôler.
 */
import java.util.ArrayList;
import java.util.List;

public class Telecommande {
    // Liste des lampes associées à cette télécommande.
    private List<Lampe> lampes;

    /**
     * Initialise la télécommande avec une liste vide.
     */
    public Telecommande() {
        this.lampes = new ArrayList<Lampe>();
    }

    /**
     * Ajoute une lampe à la télécommande.
     * @param lampe lampe à ajouter
     */
    public void ajouterLampe(Lampe lampe) {
        this.lampes.add(lampe);
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

    /**
     * Allume toutes les lampes de la télécommande.
     */
    public void activerToutes() {
        for (Lampe lampe : this.lampes) {
            lampe.allumer();
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
        return r;
    }

}