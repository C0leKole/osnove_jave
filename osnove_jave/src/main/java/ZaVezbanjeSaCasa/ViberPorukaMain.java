package p24_05_2022;

public class ViberPorukaMain {
    public static void main(String[] args) {

        ViberKorisnik korisnik1 = new ViberKorisnik(
                "Nikola Ilic",
                "0603185320",
                true);

        ViberKorisnik korisnik2 = new ViberKorisnik(
                "Pera Peric",
                "062312340",
                true);

        ViberReakcija r = new ViberReakcija(":(", korisnik2);


        ViberPoruka p = new ViberPoruka(
                "Ovi konstruktori nisu bas laganica!",
                "23:51",
                korisnik1,
                korisnik2,
                r);


        p.stampaj();


    }

}
