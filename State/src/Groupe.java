public class Groupe {
    private int numero;
    private String nom;
    private Etat etat;

    public Groupe(int numero, String nom, Etat etat) {
        this.numero = numero;
        this.nom = nom;
        this.etat = etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Groupe {" +
                "numero = " + numero +
                ", nom = '" + nom + '\'' +
                ", etat = '" + etat + '\'' +
                '}';
    }
}
