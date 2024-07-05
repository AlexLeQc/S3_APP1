package CodeInitial;

import CodeInitial.CremeGlacee.*;
import CodeInitial.Options.*;


public class Client {
    public static void main(String args[]) {
        Produit chocolat = new Chocolat();
        System.out.println(chocolat);
        Options enrobage = new Enrobage(chocolat);

        //chocolat.addOption(enrobage);
        System.out.println(enrobage);

        Produit vanille = new Vanille();
        System.out.println(vanille);
        Options siropErable = new SiropErable(vanille);
        //vanille.addOption(siropErable);
        System.out.println(vanille);
    }
}
