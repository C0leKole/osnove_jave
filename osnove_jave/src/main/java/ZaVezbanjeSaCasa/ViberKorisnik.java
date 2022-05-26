package p24_05_2022;

public class ViberKorisnik {
    //Kreirati klasu ViberKorisnik koja ima:
    //ime i prezime
    //broj telefona
    //da li je trenutno aktivan (boolean)
    //gettere, settere, konstuktore

    private String imeIprezime;
    private String brojtelefona;
    private boolean daLijeAktivan;

    public ViberKorisnik(String imeIprezime, String brojtelefona, boolean daLijeAktivan) {
        this.imeIprezime = imeIprezime;
        this.brojtelefona = brojtelefona;
        this.daLijeAktivan = daLijeAktivan;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public String getBrojtelefona() {
        return brojtelefona;
    }

    public void setBrojtelefona(String brojtelefona) {
        this.brojtelefona = brojtelefona;
    }

    public boolean isDaLijeAktivan() {
        return daLijeAktivan;
    }

    public void setDaLijeAktivan(boolean daLijeAktivan) {
        this.daLijeAktivan = daLijeAktivan;
    }
}
