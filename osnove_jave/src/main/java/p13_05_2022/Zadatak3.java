package p13_05_2022;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        //Napisati program koji ima niz brojeva duzine 10. Niz je fiksnih vrednosti (ne u nosi ih korisnik)
        // a zatim se od korisnika ucitava pozicija elementa koji zeli da izbaci iz niza.
        // Pre i nakon izbacivanja ispisati niz na ekranu. Ukoliko korisnik unese poziciju van opsega niza,
        // ispisati poruku o gresci.
        //Commitujte zadatak i pushujte na github sa porukom Domaci 13.05.2022 Zadatak 3 brisanje iz niza“
        //Primer izvrsenja 1:
        //Niz je: 1,3,5,6,7,1,3,4,2,9
        //Unesite poziciju za izbacivanje: 5
        //Niz nakon brisanja je: 1,3,5,6,7,3,4,2,9
        //
        //Primer izvrsenja 2:
        //Niz je: 1,3,5,6,7,1,3,4,2,9
        //Unesite poziciju za izbacivanje: 11
        //Uneli ste nevalidnu poziciju!

        Random random = new Random();
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i <=10 ; i++) {
            int randomBroj = random.nextInt(10);
            nizBrojeva.add(randomBroj);
        }
        System.out.print("Niz je: ");
        for (int i = 0; i <nizBrojeva.size()-1 ; i++) {
            System.out.print(nizBrojeva.get(i) + ", ");
        }
        System.out.println();
        System.out.println("Unesite poziciju za izbacivanje: ");
        int pozicija = s.nextInt();

        if (pozicija >= 0 && pozicija < nizBrojeva.size()-1) {
            nizBrojeva.remove(pozicija);
            System.out.print("Niz je: ");
            for (int i = 0; i <nizBrojeva.size()-1 ; i++) {

                System.out.print(nizBrojeva.get(i) + ", ");
            }
        } else {
            System.out.println("Uneli ste nevalidnu poziciju!");
        }

    }
}
