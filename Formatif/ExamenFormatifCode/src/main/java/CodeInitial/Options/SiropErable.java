package CodeInitial.Options;

import CodeInitial.Produit;

public class SiropErable extends Options {
    private String description;
    private double prix;
    private Options options;

    public SiropErable(Produit produit)
    {
        super(produit);
        description = "SiropErable";
        prix = 2.55;
    }
    public String getDescription()
    {
        return produit.getDescription() +  description;
    }
    public double cost(){
        return prix;
    }

    @Override
    public String toString() {
        return "SiropErable{" +
                "description='" + description + '\'' +
                ", prix=" + prix +
                '}';
    }
}
