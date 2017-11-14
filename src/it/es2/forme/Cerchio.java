package it.es2.forme;

import com.sun.corba.se.impl.interceptors.PICurrent;

public class Cerchio extends Forme {
    private double raggio;

    public Cerchio(Colore colore, double raggio) {
        super(colore);
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double getArea() {
        return raggio * raggio * Math.PI;
    }

    @Override
    public double getPerimetro() {
        return raggio * 2 * Math.PI;
    }
    @Override
    public String toString(){
        return "Cerchio di colore " +super.getColore() + " con raggio " + getRaggio();
    }


    @Override
    public int compareTo(Forme f) {
        return Double.compare(this.getArea(), f.getArea());
        }
}
