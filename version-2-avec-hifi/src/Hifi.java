/**
 * Classe qui représente une chaîne Hifi.
 * Elle gère le niveau sonore de l'appareil.
 */
class Hifi {

    /**
     * Intensité du son actuel.
     * On suppose que la chaîne est éteinte si la valeur vaut 0.
     */
    private int son = 0;

    /**
     * Permet d'allumer la chaîne ou d'augmenter son volume.
     */
    public void allumer() {
        this.son += 10;
        // Le son ne doit pas dépasser 100.
        if (this.son > 100) {
            this.son = 100;
        }
    }

    /**
     * Permet d'éteindre la chaîne en mettant le son à 0.
     */
    public void eteindre() {
        this.son = 0;
    }

    /**
     * Surcharge de la méthode d'affichage sous la forme "Hifi:10".
     *
     * @return description sous forme de chaîne
     */
    public String toString() {
        String r = "";
        r += "Hifi:" + son;
        return r;
    }
}