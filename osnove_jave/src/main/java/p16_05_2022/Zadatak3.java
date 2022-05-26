package p16_05_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        //Napisati metodu koja stampa zvezdicu sa razmakom. U glavnom programu je potrebno odstampati sledecu sliku:
        //*  *  *
        //*  *
        //*

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();

        for (int i = n; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                printZvezdica();
            }
            System.out.println(" ");
        }

    }

    static void printZvezdica() {
        System.out.print(" * ");
    }
}
