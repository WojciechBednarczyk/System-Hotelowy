import java.util.ArrayList;

public class Hotel {
    private String miasto;
    private String nazwaHotelu;
    private String adresHotelu;
    private ArrayList<Pokoj> listaPokoi;

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getNazwaHotelu() {
        return nazwaHotelu;
    }

    public void setNazwaHotelu(String nazwaHotelu) {
        this.nazwaHotelu = nazwaHotelu;
    }

    public String getAdresHotelu() {
        return adresHotelu;
    }

    public void setAdresHotelu(String adresHotelu) {
        this.adresHotelu = adresHotelu;
    }

    public ArrayList<Pokoj> getListaPokoi() {
        return listaPokoi;
    }

    public void setListaPokoi(ArrayList<Pokoj> listaPokoi) {
        this.listaPokoi = listaPokoi;
    }

    public Hotel(String miasto, String nazwaHotelu, String adresHotelu) {
        this.miasto = miasto;
        this.nazwaHotelu = nazwaHotelu;
        this.adresHotelu = adresHotelu;
    }
}
