public class EnvoyerTexto implements Subscriber {
    public void envoyer(Cours cours) {
        System.out.println("La note du cours est : " + cours.getNote() + ". Un texto sera envoyé.");
    }
}