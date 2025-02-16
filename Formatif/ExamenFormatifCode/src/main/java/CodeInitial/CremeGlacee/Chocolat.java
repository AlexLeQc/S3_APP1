package CodeInitial.CremeGlacee;
import CodeInitial.Produit;

import CodeInitial.Options.Options;

public class Chocolat implements Produit {
    private String description;
    private double prix;
    private Options options;
    public Chocolat()
    {
        description = "Chocolat";
        prix = 1.05;
    }
    public String getDescription()
    {
        return description;
    }
    public double cost(){
        return prix;
    }

    @Override
    public String toString() {
        return "Chocolat{" +
                "description='" + description + '\'' +
                ", prix=" + prix +
                ", options=" + options +
                '}';
    }
}
