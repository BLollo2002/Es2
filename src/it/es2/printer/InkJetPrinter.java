package it.es2.printer;

import it.es2.forme.Colore;
import it.es2.img.ImgVect;

public class InkJetPrinter {
    private int MAXLEVEL;
    private int[] cartridge;

    public InkJetPrinter(int MAXLEVEL) {
        this.MAXLEVEL = MAXLEVEL;
        cartridge = new int[Colore.values().length];
        initCartridges();
    }
    private void initCartridges(){
        for (Colore c : Colore.values()) {
            this.cartridge[c.ordinal()] = MAXLEVEL;
        }
    }
    public void changeCartridge(Colore colore){
        this.cartridge[colore.ordinal()] = MAXLEVEL;
    }
    public boolean checkCartridgesLevel(ImgVect im){
        for (Colore c : Colore.values()) {
            if(im.areacolore(c) >this.cartridge[c.ordinal()]){
                return false;
            }
        }
        return true;
    }
    public void stampa(ImgVect im){
        for (Colore c : Colore.values()) {
            this.cartridge[c.ordinal()] -= im.areacolore(c);
        }
    }
    public void showCartridgesLevel(){
        System.out.println("Livelli delle cartucce");
        for(Colore c : Colore.values()){
            System.out.println(Colore.valueOf(c.name()) + " " + cartridge[c.ordinal()]);
        }
    }

}
