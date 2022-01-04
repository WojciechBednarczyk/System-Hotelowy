public class Pokoj {

    private int numerPokoju;
    private String rodzajPokoju;
    private int iloscMiejsc;
    private int IDPokoju;
    private float cenaZaDobe;
    private boolean dostepnosc = true;

    public Pokoj(int numerPokoju, String rodzajPokoju, int iloscMiejsc, int IDPokoju, float cenaZaDobe) {
        this.numerPokoju = numerPokoju;
        this.rodzajPokoju = rodzajPokoju;
        this.iloscMiejsc = iloscMiejsc;
        this.IDPokoju = IDPokoju;
        this.cenaZaDobe = cenaZaDobe;
    }

    @Override
    public String toString() {
        return "Pokoj{" +
                "numerPokoju=" + numerPokoju +
                ", rodzajPokoju='" + rodzajPokoju + '\'' +
                ", iloscMiejsc=" + iloscMiejsc +
                ", IDPokoju=" + IDPokoju +
                ", cenaZaDobe=" + cenaZaDobe +
                ", dostepnosc=" + dostepnosc +
                '}';
    }

    public void zajmijPokoj() {
        dostepnosc=false;
    }

    public void zwolnijPokoj() { dostepnosc = true;}

    public boolean isDostepnosc() {
        return dostepnosc;
    }
}
