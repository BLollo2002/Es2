package it.es2.img;

import com.sun.media.sound.EmergencySoundbank;
import it.es2.forme.*;

import java.util.Arrays;

public class TestVect {
    public static void main(String[] args) {
        int i;

        ImgVect im = new ImgVect(10);
        im.addforma(new Quadrato(Colore.BLACK, 10));
        im.addforma(new Rettangolo(Colore.RED, 5, 9));
        im.addforma(new Cerchio(Colore.YELLOW, 15));
        im.addforma(new Quadrato(Colore.BLUE, 20));
        im.addforma(new Rettangolo(Colore.BLACK, 6, 10));
        im.addforma(new Cerchio(Colore.RED, 5));
       ;


        for (i = 0; i < im.getCforme(); i++) {
            System.out.println(im.getForma()[i]);
        }

        System.out.println("area forme di colore rosso: " + im.areacolore(Colore.RED));
        System.out.println("area forme di colore blu: " + im.areacolore(Colore.BLUE));
        System.out.println("area forme di colore giallo: " + im.areacolore(Colore.YELLOW));
        System.out.println("area forme di colore nero: " + im.areacolore(Colore.BLACK));


        Arrays.sort(im.getForma(),0 ,im.getCforme()-1);
        System.out.println("Array ordinato per area");
        for (i = 0; i < im.getCforme(); i++) {
            System.out.println(im.getForma()[i]);

        }

        ImgVect[] img= new ImgVect[3];

        img[0] = new ImgVect(6);
        img[0].addforma(new Quadrato(Colore.BLACK, 11));
        img[0].addforma(new Rettangolo(Colore.RED, 15, 9));
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

        Arrays.sort(img);
        System.out.println("/nVettori ordinati per area totale ");
        for (i = 0; i < 3; i++) {
            System.out.println(img[i]);

        }



    }
}
