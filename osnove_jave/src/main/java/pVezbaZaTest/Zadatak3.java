package pVezbaZaTest;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        // Za potrebe loto igre na srecu, potrebno je napisati program koja ispisuje informaciju da li
        //je odigrana loto kombinacija upravo dobitna kombinacija. Korisnik unosi dva niza oba duzine
        //7, prvi niz predstavlja odigranu kombinaciju a drugi niz predstavlja izvucenu kombinaciju.
        //Program na kraju ispisuje da li je dobitna kombinacija.Primer poziva metoda:
        //Ako se unesu nizovi:
        //● odigrana={1, 2, 3, 4, 5, 33, 29} i izvucena= {1,2 ,3, 7, 29, 30, 32}
        //● Program stampa “Nije dobitna kombinacija”
        //Ako se metoda pozove za:
        //● odigrana={1, 2, 3, 4, 5, 33, 29} i izvucena={1, 2, 3, 4, 5, 33, 29} vraca true.
        //● Program stampa “Jeste dobitna kombinacija”

        loto();


    }

    static void loto() {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> niz1 = new ArrayList<Integer>();
        ArrayList<Integer> niz2 = new ArrayList<Integer>();
        Random random = new Random();


        for (int i = 0; i < 7; i++) {

            System.out.print("Unesite kombinaciju: ");
            int odigrana = s.nextInt();

            niz1.add(odigrana);
        }
        for (int i = 0; i < 7; i++) {
            int izvucena = random.nextInt(41);
            niz2.add(izvucena);
        }
        if (niz1 == niz2) {
            System.out.println("Dobitnik ste!");


        } else {
            System.out.println("Niste dobitnik!");
        }
        System.out.println("Vasa kombinacija je: " + niz1);
        System.out.println("Izvucena kombinacija je: " + niz2);
    }
}
