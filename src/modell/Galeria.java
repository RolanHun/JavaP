package modell;

import java.util.ArrayList;

public class Galeria {
    private ArrayList<KiallitasiTargy> tartalma;

    public Galeria() {
        this.tartalma = new ArrayList<>();
    }
    public void festmenytFelvesz(Festmeny fest){
        tartalma.add(fest);
    }
    
    public void keszitoSzerintRend(){
        ArrayList<String> nevszerint = new ArrayList<>();
        for(int i = 0; i < tartalma.size(); i++){
                nevszerint.add(tartalma.get(i).getKeszito());
            }
        
        nevszerint.sort(String::compareToIgnoreCase);
        
        for (String string : nevszerint) {
            System.out.println(string);
            }
        }  
    
    public void targySzerintRend(){
        ArrayList<String> targyszerint = new ArrayList<>();
        for(int i = 0; i < tartalma.size(); i++){
                targyszerint.add(tartalma.get(i).getNev());
            }
        
        targyszerint.sort(String::compareToIgnoreCase);
        
        for (String string : targyszerint) {
            System.out.println(string);
            }
        }  

    @Override
    public String toString() {
        return "Galeria{" + "tartalma=" + tartalma + '}';
    }
}
