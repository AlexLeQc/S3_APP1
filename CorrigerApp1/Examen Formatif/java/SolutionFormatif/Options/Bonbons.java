package SolutionFormatif.Options;

import SolutionFormatif.Produit;

public class Bonbons extends Options {
    private String description;
    private double prix;

    public Bonbons(Produit produit)
    {
        super(produit);             ////cette ligne va chercher le constructeur de la classe parent,
                                    ////soit la classe Options dans ce cas
        //les lignes suivantes definissent les valeurs de la classe
        description = "Bonbons";
        prix = 2.55;
    }

    /*
     * vu que c'est une classe decorateur,
     * il va chercher la fonction identique
     * de la variable produit dans sa classe parent
     */
    public String getDescription()
    {
        return produit.getDescription() + "\n\t" + description;
    }

    /*
     * vu que c'est une classe decorateur,
     * il va chercher la fonction identique
     * de la variable produit dans sa classe parent
     */
    public double cost()
    {
        return produit.cost() + prix;
    }

    @Override
    public String toString()
    {
        return "Bonbons{" +
                "description='" + description + '\'' +
                ", prix=" + prix +
                '}';
    }
}
