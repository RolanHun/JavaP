package modell;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

public class Festmeny extends KiallitasiTargy{
    private String eleresiUt;

    public Festmeny(String eleresiUt, Date letrehozas, String nev, String keszito) {
        super(letrehozas, nev, keszito);
        this.eleresiUt = eleresiUt;
        letezik(eleresiUt);
    }
    
    public Festmeny(Date letrehozas, String nev, String keszito) {
        this("", letrehozas, nev, keszito);
    }
    
    private void letezik(String path){
        if(Files.exists(Paths.get(path))){
            System.out.println("megjelenítés folyamatban...");
        }
        else{
            System.out.println("nem lehet megjeleníteni!");
        }
    }
}
