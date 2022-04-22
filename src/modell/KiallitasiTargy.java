package modell;

import java.util.Date;

public abstract class KiallitasiTargy {
    private int letrehozas;
    private String nev;
    private String keszito;

    public KiallitasiTargy(int letrehozas, String nev, String keszito) {
        this.letrehozas = letrehozas;
        this.nev = nev;
        this.keszito = keszito;
    }

    public String getNev() {
        return nev;
    }

    public String getKeszito() {
        return keszito;
    }
    
    @Override
    public String toString() {
        return "\nKiallitasiTargy{" + "letrehozas=" + letrehozas + ", nev=" + nev + ", keszito=" + keszito  + '}';
    }
    
    
}
