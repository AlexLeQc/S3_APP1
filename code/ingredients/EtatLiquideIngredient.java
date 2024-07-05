package ingredients;

public class EtatLiquideIngredient implements EtatIngredient{

    private double quantite;

    public void set_Quantite(double quantite){
        this.quantite = quantite;
    }

    public double get_Quantite(){

        return quantite;
    }
}
