package CodeInitial.Options;
import CodeInitial.Produit;

public class Enrobage extends Options {
    private String description;
    private double prix;
    public Enrobage(Produit produit)
    {
        super(produit);
        description = "Enrobage";
        prix = 2.55;
    }
    public String getDescription()
    {
        return produit.getDescription() +  description;
    }
    public double cost(){
        return prix + produit.cost();
    }

    @Override
    public String toString() {
        return "Enrobage{" +
                "description='" + description + '\'' +
                ", prix=" + prix +
                '}';
    }
}
