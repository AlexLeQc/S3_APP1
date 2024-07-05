package codeInitial;

/**
 * @author Big Snitch energy
 */
public class Professeur {
    /**
     * class coquette
     *
     */
    private String cip;
    private String nom;

    private static Professeur instance = null;

    /**
     *
     * @param cip
     * @param nom
     */
    private Professeur(String cip, String nom) {
        this.cip = cip;
        this.nom = nom;
    }

    /**
     *
     * @param cip
     * @param nom
     * @return instance big cock
     */
    public static Professeur getInstance(String cip, String nom){
        if (instance == null){
            instance = new Professeur(cip, nom);
        }
        return instance;
    }

    /**
     *
     * @return un bo string cock
     */
    @Override
    public String toString() {
        return "Professeur{" +
                "hash code=" + this.hashCode() + " \n"+
                "cip='" + cip + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }

    public String get_cip(){
        return cip;
    }

    public String get_nom(){
        return nom;
    }
}
