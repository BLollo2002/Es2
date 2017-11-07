package it.es2.forme;

public class Rettangolo extends Forme{
    private double lato1, lato2;

    public Rettangolo(Colore colore, double lato1, double lato2) {
        super(colore);
        this.lato1 = lato1;
        this.lato2 = lato2;
    }

    public double getLato1() {
        return lato1;
    }

    public void setLato1(double lato1) {
        this.lato1 = lato1;
    }

    public double getLato2() {
        return lato2;
    }

    public void setLato2(double lato2) {
        this.lato2 = lato2;
    }

    @Override
    public double area() {
        return lato1 *lato2;
    }

    @Override
    public double perimetro() {
        return (lato1 + lato2) * 2;
    }

    @Override
    public String toString(){
        return "Rettangolo di colore " +super.getColore() + " con lato1 " + getLato1() + " con lato2 " + getLato2();
    }
}
