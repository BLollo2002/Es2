package it.es2.img;


import it.es2.forme.Colore;
import it.es2.forme.Forme;

public class ImgVect implements Comparable<ImgVect> {
    private int maxforme;
    private int cforme;
    private Forme[] forma;

    public ImgVect(int maxforme) {
        this.maxforme = maxforme;
        cforme = 0;
        forma = new Forme[maxforme];

    }

    public void addforma(Forme nuovaForma){
        if(maxforme > cforme){
            forma[cforme] = nuovaForma;
            cforme ++;
        }
    }

    public int getMaxforme() {
        return maxforme;
    }

    public int getCforme() {
        return cforme;
    }

    public Forme[] getForma() {
        return forma;
    }

    public double areacomponenti(){
        int i;
        double areatot = 0;
        for(i = 0; i < cforme; i++){
            areatot = areatot + forma[i].getArea();
        }
        return areatot;
    }
    public double areacolore(Colore colore){
        int i;
        double areatot = 0;
        for(i = 0; i < cforme; i++){
            if(forma[i].getColore() == colore){
                areatot = areatot + forma[i].getArea();
            }
        }
        return areatot;
    }
    @Override
    public String toString(){
        return "Vettore di area totale: "+areacomponenti();
    }

    @Override
    public int compareTo(ImgVect im) {
        return Double.compare(this.areacomponenti(), im.areacomponenti());
    }
}
