public class TestCoursMailTexto {
    public static void main(String[] args) {
        Cours cours = new Cours("Patrons de Conception", 90);
        EnvoyerMail envoyerMail = new EnvoyerMail();
        EnvoyerTexto envoyerTexto = new EnvoyerTexto();
        cours.attach(envoyerMail);
        cours.attach(envoyerTexto);
        System.out.println("Nouvelle note au cours : 85");
        cours.setNote(85);
        System.out.println("Changement de note : 95");
        cours.detach(envoyerTexto);
        cours.setNote(95);
    }
}