
public class TestGroupe {
    public static void main(String[] args) {
        Groupe groupe = new Groupe(1, "Design Patterns", Etat.CREE);
        System.out.println("Le groupe créé est : " + groupe);
        groupe.setEtat(Etat.OUVERT);
        System.out.println("Le groupe est ouvert : " + groupe);
        groupe.setEtat(Etat.TERMINE);
        System.out.println("Le groupe terminé est : " + groupe);
    }
}

