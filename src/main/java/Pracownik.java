public class Pracownik extends Osoba {
    private int IDPracownika;

    public Pracownik(String imie, String nazwisko, int IDPracownika) {
        super(imie, nazwisko);
        this.IDPracownika = IDPracownika;
    }
}
