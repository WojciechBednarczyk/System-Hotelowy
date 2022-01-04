public class Rezerwacja {
    private DaneRezerwacji daneRezerwacji;
    private Klient klient;
    private Potwierdzenie potwierdzenie;
    private int IDRezerwacji;

    public DaneRezerwacji getDaneRezerwacji() {
        return daneRezerwacji;
    }

    public void setDaneRezerwacji(DaneRezerwacji daneRezerwacji) {
        this.daneRezerwacji = daneRezerwacji;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Potwierdzenie getPotwierdzenie() {
        return potwierdzenie;
    }

    public void setPotwierdzenie(Potwierdzenie potwierdzenie) {
        this.potwierdzenie = potwierdzenie;
    }

    public int getIDRezerwacji() {
        return IDRezerwacji;
    }

    public void setIDRezerwacji(int IDRezerwacji) {
        this.IDRezerwacji = IDRezerwacji;
    }

    public void zmienTermin(String nowyTermin)
    {
        daneRezerwacji.setPoczatekPobytu(nowyTermin);
    }
    public boolean czyZatwierdzona()
    {
        if (potwierdzenie == null)
        {
            return false;
        }
        else
            return true;
    }
    public Rezerwacja(DaneRezerwacji daneRezerwacji, Klient daneKlienta, int IDRezerwacji) {
        this.daneRezerwacji = daneRezerwacji;
        this.klient = daneKlienta;
        this.IDRezerwacji=IDRezerwacji;
    }
}
