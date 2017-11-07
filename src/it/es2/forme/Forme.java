package it.es2.forme;

public abstract class Forme implements Comparable<Forme> {
     Colore colore;

    public Forme(Colore colore) {
        this.colore = colore;
    }

    public  Colore getColore() {
        return colore;
    }

    public abstract double area();

    public abstract double perimetro();

    public int compareTo(Forme f){
        return Double.compare(this.area(), f.area());
    }

}
