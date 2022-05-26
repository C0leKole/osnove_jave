package p16_05_2022;

public class Zadatak7 {
    public static void main(String[] args) {
        //.Zadatak
        //Napisati metodu koja vraca suprotno negativna broj od prosledjenog.
        // Metoda prima broj N i vraca ga sa negativnom vrednoscu.
        //Primer: Ako se metoda pozove za N=10, vraca -10
        //	Ako se metoda pozove za N=-11, vraca 11
        int negativanBroj = suprotonoOdProsledjenog(5);
        System.out.println("Negativan broj je: " + negativanBroj);
    }

    static int suprotonoOdProsledjenog (int broj) {
        if ( broj < 0) {
            return broj;
        } else {
            return -broj;
        }
    }
}
