package it.es2.forme;

public class Quadrato extends Forme {
    private double lato;


    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public Quadrato( Colore colore, double lato) {
        super(colore);
        this.lato = lato;
    }

    @Override
    public double getArea() {
        return lato * lato;
    }

    @Override
    public double getPerimetro() {
        return lato * 4;
    }
    @Override
    public int compareTo(Forme f) {
        return Double.compare(this.getArea(), f.getArea());
    }
    @Override
    public String toString(){
        return "Quadrato di colore " +super.getColore() + " con lato " + getLato();
    }
}
