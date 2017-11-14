package it.es2.forme;

public abstract class Forme implements Misurabile{
     Colore colore;

    public Forme(Colore colore) {
        this.colore = colore;
    }

    public  Colore getColore() {
        return colore;
    }
}
