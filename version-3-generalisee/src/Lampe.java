/** Lampe compatible avec la télécommande universelle. */
public class Lampe implements Appareil {
    private final String nom;
    private boolean allumee;

    public Lampe(String nom) {
        this.nom = nom;
        this.allumee = false;
    }

    @Override
    public void allumer() {
        this.allumee = true;
    }

    @Override
    public void eteindre() {
        this.allumee = false;
    }

    @Override
    public String toString() {
        return (allumee ? "allumee" : "eteinte") + " lampe " + nom;
    }
}
