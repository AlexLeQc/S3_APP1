package CodeInitial.Options;

import CodeInitial.Produit;

public class Bonbons extends Options {
    private String description;
    private double prix;
    public Bonbons(Produit produit)
    {
        super(produit);
        description = "Bonbons";
        prix = 2.55;
    }
    public String getDescription()
    {
        return produit.getDescription() + description;
    }
    public double cost(){
        return prix + produit.cost();
    }

    @Override
    public String toString() {
        return "Bonbons{" +
                "description='" + description + '\'' +
                ", prix=" + prix +
                '}';
    }
}
