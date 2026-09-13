/** Démonstration de la télécommande universelle généralisée. */
public class Main {
    public static void main(String[] args) {
        Telecommande telecommande = new Telecommande();
        telecommande.ajouterAppareil(new Lampe("Lampe1"));
        telecommande.ajouterAppareil(new Hifi());
        telecommande.ajouterAppareil(new Television());

        telecommande.activer(0);
        telecommande.activer(1);
        telecommande.activer(2);
        System.out.println(telecommande);
    }
}
