package it.es2.printer;

import it.es2.forme.Cerchio;
import it.es2.forme.Colore;
import it.es2.forme.Quadrato;
import it.es2.forme.Rettangolo;
import it.es2.img.ImgVect;

public class TestPrinter {
    public static void main(String[] args) {

        ImgVect[] img= new ImgVect[3];
        InkJetPrinter printer = new InkJetPrinter(1000);

        img[0] = new ImgVect(6);
        img[0].addforma(new Quadrato(Colore.BLACK, 11));
        img[0].addforma(new Rettangolo(Colore.RED, 15, 19));
        img[0].addforma(new Cerchio(Colore.YELLOW, 1));
        img[0].addforma(new Quadrato(Colore.BLUE, 10));
        img[1] = new ImgVect(6);
        img[1].addforma(new Quadrato(Colore.BLACK, 5));
        img[1].addforma(new Rettangolo(Colore.RED, 5, 7));
        img[1].addforma(new Cerchio(Colore.YELLOW, 5));
        img[1].addforma(new Quadrato(Colore.BLUE, 2));
        img[2] = new ImgVect(6);
        img[2].addforma(new Quadrato(Colore.BLACK, 7));
        img[2].addforma(new Rettangolo(Colore.RED, 3, 9));
        img[2].addforma(new Cerchio(Colore.YELLOW, 8));
        img[2].addforma(new Quadrato(Colore.BLUE, 12));

        for(ImgVect i : img){
            if(printer.checkCartridgesLevel(i)){
                System.out.println("Stampa di:\n" + i);
                printer.stampa(i);
            }else{
                System.out.println("inchiostro insufficiente");
            }
        }
        printer.showCartridgesLevel();
    }
}
