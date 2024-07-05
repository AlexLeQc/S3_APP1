package SolutionFormatif;

import SolutionFormatif.CremeGlacee.*;
import SolutionFormatif.Options.*;

public class Client {
    public static void main(String args[]) {

        CremeGlacee chocolat = new SolutionFormatif.CremeGlacee.Chocolat();
        System.out.println(chocolat);
        SolutionFormatif.Options.Options enrobage = new SolutionFormatif.Options.Enrobage();

        chocolat.addOption(enrobage);
        System.out.println(chocolat);

        CremeGlacee vanille = new Vanille();
        System.out.println(vanille);
        SolutionFormatif.Options.Options siropErable = new SiropErable();
        vanille.addOption(siropErable);
        System.out.println(vanille);
    }
}
