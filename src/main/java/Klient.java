public class Klient extends Osoba {
    private String numerDowodu;

    public Klient(String imie, String nazwisko, String numerDowodu) {
        super(imie, nazwisko);
        this.numerDowodu = numerDowodu;
    }
}
