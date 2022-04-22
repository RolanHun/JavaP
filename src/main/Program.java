package main;

import java.util.Date;
import modell.Festmeny;
import modell.Galeria;

public class Program {

    public static void main(String[] args) {
        Galeria g1 = new Galeria();
        g1.festmenytFelvesz(new Festmeny("BFestett", "AFestő"));
        g1.festmenytFelvesz(new Festmeny(20220422,"AFestett1", "CFestő1"));
        g1.festmenytFelvesz(new Festmeny(20250422,"DFestett2", "BFestő2"));
        g1.festmenytFelvesz(new Festmeny("EFestett3", "EFestő3", "kep.txt"));
        g1.festmenytFelvesz(new Festmeny("kep.txt", 20200420, "CFestett3", "DFestő3"));
        
        g1.targySzerintRend();
        g1.keszitoSzerintRend();
        
        System.out.println(g1);
    }
    
}
