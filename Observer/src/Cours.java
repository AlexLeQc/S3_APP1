import java.util.ArrayList;
import java.util.List;

public class Cours {
    private String nom;
    private int note;
    private List<Subscriber> subscribers = new ArrayList<>();

    public int getNote() {
        return note;
    }

    public Cours(String nom, int note) {
        this.nom = nom;
        this.note = note;
    }

    public void attach(Subscriber subscriber){
            subscribers.add(subscriber);
    }

    public void detach(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notifyObserver(){
        for (Subscriber subscriber : subscribers){
            subscriber.envoyer(this);
        }
    }
    public void setNote(int note) {
        this.note = note;
        notifyObserver();
    }
}