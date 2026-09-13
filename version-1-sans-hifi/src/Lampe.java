/**
 * Représente une lampe que la télécommande peut allumer ou éteindre.
 */
public class Lampe {

    // Nom de la lampe, utilisé pour l'affichage.
    private String nom;

    // Indique si la lampe est allumée ou éteinte.
    private boolean allumee;

    /**
     * Constructeur de la lampe.
     * @param nom nom donné à la lampe
     */
    public Lampe(String nom) {
        this.nom = nom;
        this.allumee = false;
    }

    /**
     * Allume la lampe.
     */
    public void allumer() {
        this.allumee = true;
    }

    /**
     * Éteint la lampe.
     */
    public void eteindre() {
        this.allumee = false;
    }

    /**
     * Retourne une description lisible de l'état de la lampe.
     */
    public String toString() {
        String r = "";
        if (this.allumee) {
            r += "allumee";
        } else {
            r += "eteinte";
        }
        r += " lampe " + this.nom + " est ";
        return r;
    }
}
