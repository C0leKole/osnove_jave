package p16_05_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        //Zadatak
        //Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost   prosledjene vrednosti.
        stampajApsolultnuVrednost(20);

    }
    static void stampajApsolultnuVrednost (int x) {

        if (x>0) {
            System.out.println("Apsolutna vrednost broja je: " + x);
        } else {
            System.out.println("Apsolutna vrednost je: " + (x * (-1)));
        }

    }
}
