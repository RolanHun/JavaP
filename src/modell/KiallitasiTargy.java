package modell;

import java.util.Date;

public abstract class KiallitasiTargy {
    private Date letrehozas;
    private String nev;
    private String keszito;

    public KiallitasiTargy(Date letrehozas, String nev, String keszito) {
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
        return "KiallitasiTargy{" + "letrehozas=" + letrehozas + ", nev=" + nev + ", keszito=" + keszito + '}';
    }
    
    
}
