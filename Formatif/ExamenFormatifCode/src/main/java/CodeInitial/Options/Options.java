package CodeInitial.Options;

import CodeInitial.Produit;
public class Options implements Produit{
    public Produit produit;

    public Options(Produit produit){
        this.produit = produit;
    }
    public String getDescription(){
        return produit.getDescription();
    }
    public double cost(){
        return produit.cost();
    }
}
