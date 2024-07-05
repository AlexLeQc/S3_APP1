public class EnvoyerMail implements Subscriber {
    public void envoyer(Cours cours) {
        System.out.println("La note du cours est : " + cours.getNote() + ". Un courriel sera envoyé.");
    }
}
