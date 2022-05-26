package p16_05_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        //Zadatak
        //Napisati metodu koja stampa N zvezdica u istom redu. Broj zvezdica je odredjen parametrom N.
        //Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
        //N=5, print je=> * * * * *
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        starPrint(n);

    }

    static void starPrint(int n) {

        System.out.print("N=" + n + " print je => ");
        for (int i = 0; i < n; i++) {
            System.out.print(" * ");
        }
        System.out.println();
    }
}
