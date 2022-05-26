package p16_05_2022;

public class Zadatak8 {
    public static void main(String[] args) {
        //Zadatak
        //Napisati metodu koja proverava da li je trougao pravougli.
        // Metoda prima stranice trougla i hipotenuzu trougla.
        // Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
        //Trougao je pravougli ukoliko je a*a+b*b=c*c
        boolean jeste =daLiJePravougli(3, 5, 5);
        System.out.println(jeste);
    }

    static boolean daLiJePravougli(int a, int b, int c) {
        if (a * a + b * b == c * c) {
            return true;
        } else {
            return false;
        }
    }
}
