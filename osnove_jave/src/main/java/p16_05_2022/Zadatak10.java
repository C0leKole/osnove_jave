package p16_05_2022;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
        //Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj konverziji.
        // Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno izvrsiti
        // konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost.
        // U glavnom programu pozvati funkciju za neki od primera.
        //Primer poziva funkcija:
        //Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
        //Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
        //Primer izvrsenja main programa:
        //
        //Unesite vrednost u eurima: 3
        //
        //Unesite valutu za konverziju: RSD
        //
        //3 EUR je 351.6339 RSD
        //
        //Konverzija eura u druge valute:
        //
        //1 EUR = 117.2113 RSD
        //
        //1 EUR = 1.1821 USD


        double iznos = konverzija(3, "RSD");
        System.out.println("Za unetu vrednost valute u EUR konverzija iznosi: " + iznos);
    }
    static double konverzija (double vrednost, String valuta) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost u eurima: ");
        vrednost = s.nextInt();

        System.out.println("Unesite valutu za koverziju: ");
        valuta = s.next();

        if (valuta.equals("RSD")) {
           return vrednost * 117.2113;
        } if (valuta.equals("USD")) {
            return vrednost * 1.1821;
        }  if (valuta.equals("RUB")) {
            return vrednost * 67.41;
        }
        return vrednost;
    }
}
