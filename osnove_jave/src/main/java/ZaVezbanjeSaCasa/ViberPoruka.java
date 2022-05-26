package p24_05_2022;

public class ViberPoruka {
    //Kreirati klasu ViberPoruka koja ima:
    //tekst poruke
    //vreme kad je poslata poruka
    //korisnika koji je poslao poruku
    //korisnika kome je poslata poruka
    //gettere i setere i konstuktore
    //rekaciju na poruku
    //metodu prikazi koja stampa podatke o poruci u formatu:
    //From: [Ime i prezime korisnika] * Active Now ili Not Active - at [vreme kad je poslata]
    //To: [Ime i prezime korisnika kome je poslata]
    //[Tekst poruke] : [reakcija] from [korisnik koji je reagovao]
    //
    //POMOC: Trebace vam provera da li reakcija postoji to pravite u if-u
    //if (this.reakcija != null)
    private String tekstPoruke;
    private String vremeSlanja;
    private ViberKorisnik posiljalacPoruke;
    private ViberKorisnik primalacPoruke;
    private ViberReakcija reakcijaNaporuku;



    public ViberPoruka(String tekstPoruke, String vremeSlanja, ViberKorisnik posiljalacPoruke,
                       ViberKorisnik primalacPoruke, ViberReakcija reakcijaNaporuku) {
        this.tekstPoruke = tekstPoruke;
        this.vremeSlanja = vremeSlanja;
        this.posiljalacPoruke = posiljalacPoruke;
        this.primalacPoruke = primalacPoruke;
        this.reakcijaNaporuku = reakcijaNaporuku;
    }

    public ViberReakcija getReakcijaNaporuku() {
        return reakcijaNaporuku;
    }

    public void setReakcijaNaporuku(ViberReakcija reakcijaNaporuku) {
        this.reakcijaNaporuku = reakcijaNaporuku;
    }

    public String getTekstPoruke() {
        return tekstPoruke;
    }

    public void setTekstPoruke(String tekstPoruke) {
        this.tekstPoruke = tekstPoruke;
    }

    public String getVremeSlanja() {
        return vremeSlanja;
    }

    public void setVremeSlanja(String vremeSlanja) {
        this.vremeSlanja = vremeSlanja;
    }

    public ViberKorisnik getPosiljalacPoruke() {
        return posiljalacPoruke;
    }

    public void setPosiljalacPoruke(ViberKorisnik posiljalacPoruke) {
        this.posiljalacPoruke = posiljalacPoruke;
    }

    public ViberKorisnik getPrimalacPoruke() {
        return primalacPoruke;
    }

    public void setPrimalacPoruke(ViberKorisnik primalacPoruke) {
        this.primalacPoruke = primalacPoruke;
    }
    //metodu prikazi koja stampa podatke o poruci u formatu:
    //From: [Ime i prezime korisnika] * Active Now ili Not Active - at [vreme kad je poslata]
    //To: [Ime i prezime korisnika kome je poslata]
    //[Tekst poruke] : [reakcija] from [korisnik koji je reagovao]
    //
    public void stampaj () {
        if (reakcijaNaporuku != null) {
            System.out.println("From: " + this.getPosiljalacPoruke().getImeIprezime() + " * "
                    + getPosiljalacPoruke().isDaLijeAktivan()
                    + " - at " + vremeSlanja);
            System.out.println("To: " + this.getPrimalacPoruke().getImeIprezime());
            System.out.println(this.getTekstPoruke() + " : " + this.reakcijaNaporuku.getEmoji() + " from " +
                    reakcijaNaporuku.getKorisnikKojiJeReagovao().getImeIprezime());
        }
        else {
            System.out.println("Nema reakcija na poruku.");
        }
    }
}
