package test;

import codeInitial.Professeur;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ProfesseurTest {

    @BeforeEach
    void setup(){
        Professeur prof1 = Professeur.getInstance("GUEA0902", "TAMERE");
    }
    @Test
    void getInstance() {
        Professeur prof2 = Professeur.getInstance("LUPI6969", "KIMJUN");
        assertEquals("GUEA0902", prof2.get_cip());
        assertEquals("TAMERE", prof2.get_nom());
    }

    @Test
    void getCip(){
        Professeur prof2 = Professeur.getInstance("LUPI6969", "KIMJUN");
        assertEquals("GUEA0902", prof2.get_cip());
    }

    @Test
    void getNom(){
        Professeur prof2 = Professeur.getInstance("LUPI6969", "KIMJUN");
        assertEquals("TAMERE", prof2.get_nom());
    }

    @Test
    void testToString() {
    }
}