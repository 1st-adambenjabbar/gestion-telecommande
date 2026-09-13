/** Télévision compatible avec la télécommande universelle. */
public class Television implements Appareil {
    private int son;

    public Television() {
        this.son = 0;
    }

    @Override
    public void allumer() {
        this.son += 10;
        if (this.son > 100) {
            this.son = 100;
        }
    }

    @Override
    public void eteindre() {
        this.son = 0;
    }

    @Override
    public String toString() {
        return "Television:" + son;
    }
}
