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
    public double area() {
        return raggio * raggio * Math.PI;
    }

    @Override
    public double perimetro() {
        return raggio * 2 * Math.PI;
    }
    @Override
    public String toString(){
        return "Cerchio di colore " +super.getColore() + " con raggio " + getRaggio();
    }
}
