import java.util.Scanner;

/**
 * Programme de démonstration de la télécommande avec lampes et Hi-Fi.
 */
public class Main {
    public static void main(String[] args) {
        Telecommande t = new Telecommande();
        ajouterAppareils(t);

        // Test d'activation d'une lampe et de la chaîne Hi-Fi.
        t.activerLampe(1);
        t.activerHifi(0);
        System.out.println(t);

        lancerMenu(t);
    }

    private static void lancerMenu(Telecommande t) {
        System.out.println(t);
        try (Scanner sc = new Scanner(System.in)) {
            boolean fini = false;
            while (!fini) {
                System.out.println("Choisir le type : lampe / hifi / exit");
                String type = sc.nextLine();
                if (type.equals("exit")) {
                    fini = true;
                    continue;
                }

                System.out.println("Entrer l'indice");
                int choix = Integer.parseInt(sc.nextLine());
                System.out.println("Entrer la commande (+/-)");
                String commande = sc.nextLine();

                if (type.equals("lampe")) {
                    if (commande.equals("+")) {
                        t.activerLampe(choix);
                    } else if (commande.equals("-")) {
                        t.desactiverLampe(choix);
                    }
                } else if (type.equals("hifi")) {
                    if (commande.equals("+")) {
                        t.activerHifi(choix);
                    } else if (commande.equals("-")) {
                        t.desactiverHifi(choix);
                    }
                } else {
                    System.out.println("Type inconnu");
                }
                System.out.println(t);
            }
        }
    }

    private static void ajouterAppareils(Telecommande t) {
        t.ajouterLampe(new Lampe("Lampe1"));
        t.ajouterLampe(new Lampe("Lampe2"));
        t.ajouterLampe(new Lampe("Lampe3"));
        t.ajouterLampe(new Lampe("Lampe4"));
        t.ajouterHifi(new Hifi());
    }
}
